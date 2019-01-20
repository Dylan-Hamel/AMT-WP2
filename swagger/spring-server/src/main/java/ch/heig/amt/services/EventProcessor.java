package ch.heig.amt.services;

import ch.heig.amt.entities.BadgeEntity;
import ch.heig.amt.entities.EventEntity;
import ch.heig.amt.entities.PointAwardEntity;
import ch.heig.amt.entities.RuleEntity;
import ch.heig.amt.repositories.BadgeRepository;
import ch.heig.amt.repositories.PointAwardRepository;
import ch.heig.amt.repositories.RuleRepository;
import ch.heig.amt.repositories.UserRepository;
import org.springframework.scheduling.annotation.Async;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class EventProcessor {

    private UserRepository userRepository;
    private PointAwardRepository pointAwardRepository;
    private RuleRepository ruleRepository;
    private BadgeRepository badgeRepository;

    public EventProcessor(UserRepository userRepository, PointAwardRepository pointAwardRepository,
                          RuleRepository ruleRepository, BadgeRepository badgeRepository) {
        this.userRepository = userRepository;
        this.pointAwardRepository = pointAwardRepository;
        this.ruleRepository = ruleRepository;
        this.badgeRepository = badgeRepository;
    }

    @Async
    @Transactional
    public void processEvent(EventEntity eventEntity) {
        List<RuleEntity> linkedRules = this.ruleRepository.
                findAllByBadgeEntity_ApplicationEntityAndType(
                        eventEntity.getUserEntity().getApplicationEntity(),
                        eventEntity.getType());

        for(RuleEntity rule : linkedRules) {

            PointAwardEntity pointAwardEntity = this.pointAwardRepository.
                    findByUserEntityAndRuleEntity(eventEntity.getUserEntity(), rule);

            if (pointAwardEntity == null) {
                pointAwardEntity = new PointAwardEntity();
                pointAwardEntity.setPoints((long) 0);
                pointAwardEntity.setRuleEntity(rule);
                pointAwardEntity.setUserEntity(eventEntity.getUserEntity());
                this.pointAwardRepository.save(pointAwardEntity);
            }

            if (pointAwardEntity.getPoints() >= rule.getThreshold()) {

                // Fetch matching badge for the current rule
                eventEntity.getUserEntity().getBadgeEntities().add(rule.getBadgeEntity());
                this.userRepository.save(eventEntity.getUserEntity());

            }
        }

    }

}
