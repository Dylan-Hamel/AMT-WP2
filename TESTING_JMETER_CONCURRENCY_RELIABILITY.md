Afin de contrôler que nous n'avons pas de problèmes de concurrences lors "d'ajout" d'events en parallèle pour le même utilisateur, nous avons crée un script JMeter assez simple qui va créer un nouveau badge, un nouveau pointScale puis une nouvelle rule "connectée" à ces 2 derniers et enfin 2 events en même temps" pour le même utilisateur

Etant donné que la partie fonctionnelle n'est pas parfaite, cela ne trigger pas l'assignation d'un badge à un user, de plus nous n'avons pas vraiment implémenté de stratégie de gestion de concurrence que ce soit pessimiste ou optimiste, tout est géré par défaut par JPA/hibernate

Néanmoins un test peut être fait, c'est pour la création du user au premier event le concernant.

Pour cela nous avons installé le plugin parallel controller.

On constate que l'utilisateur est créé 2 fois.

![concurrency-2_events_new-user](documentation/concurrency-2_events_new-user.png)