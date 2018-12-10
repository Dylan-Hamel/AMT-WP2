package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.Registration;
import ch.heigvd.gamification.model.RegistrationSummary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RegistrationEndpoint implements RegistrationApi {

    @Override
    public ResponseEntity<List<RegistrationSummary>> registrationGet() {

        List<ch.heigvd.gamification.model.RegistrationSummary> rs = new ArrayList<>();
        rs.add(new ch.heigvd.gamification.model.RegistrationSummary().applicationName("Dylan-Application-TEST"));
        rs.add(new ch.heigvd.gamification.model.RegistrationSummary().applicationName("Facebook"));


        // ACTION - query on db, check input, etc.
        // add in swagger.yaml


        return ResponseEntity.ok().body(rs);
    }

    @Override
    public ResponseEntity<Void> registrationPost(Registration registration) {

        // ACTION - query on db, check input, etc.
        // add in swagger.yaml


        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
