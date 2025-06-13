# tp2_jpa
# Introduction
      Au cours de cette activité, notre objectif a été de découvrir et de manipuler Spring Boot avec Spring Data JPA afin de gérer de manière efficace la persistence des données dans une base de données relationnelle.
      Ce projet consiste en la création d'une application Spring complète, incluant le développement d'entités, de repositories, de services, et de contrôleurs.
      Au travers de cas pratiques, et en utilisant Spring Web, Spring Data JPA, H2 et MySQL, le projet illustre le fonctionnement de l’API Spring, le mapping Objet-Relationnel, et le changement de base de données en cours de route.

# Objectif
      L'objectif de ce projet consiste donc à :
      
      S'initier à Spring Boot et Spring Data JPA afin de gérer le cycle de vie des entités en base de données.
      
      Créer une application CRUD (Créer, Lire, Mettre à jour, Supprimer) sur une entité Patient.
      
      Expérimenter le changement de base de données de H2 (embeded) vers MySQL en modifiant simplement quelques configurations.
      
      Étendre le cas d’étude en incluant d’autres entités (comme médecin, rendez-vous, consultation, roles, utilisateurs) afin de manipuler des cas d'utilisation plus complexes.
      
      Mettre en place le projet avec Spring Initializr, IntelliJ Ultimate, Spring Web, Spring Data JPA et Lombok afin d’avoir une base robuste et rapide de développement.

# But
      Le but de ce projet est donc de :
      
      Acquérir la maîtrise de Spring Data JPA, de la création d'entité jusqu'aux méthodes de repository générées automatiquement.
      
      Comprendre le fonctionnement de l’API Spring, de l’injection de dépendances, des couches service, repository et controller.
      
      S'entraîner sur des cas d’étude concrets, afin d'être capable de réaliser une application de gestion de données de A à Z.
      
      Se préparer au développement d'une application d'envergure, utilisant Spring, en utilisant de bonnes pratiques de conception, d’architecture, et de gestion de base de données.
      

TP2 : JPA-JDBC-H2
1. Installer IntelliJ Ultimate
2. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock

   
3. Créer l'entité JPA Patient ayant les attributs :
![image](https://github.com/user-attachments/assets/80825dfe-f104-4a2b-9158-06005b6c0071)

4. Configurer l'unité de persistance dans le ficher application.properties
![image](https://github.com/user-attachments/assets/85cadeee-34a1-4857-a302-6134caf2d484)

5. Créer l'interface JPA Repository basée sur Spring data:
![image](https://github.com/user-attachments/assets/8e66e450-81fe-4ff5-8bf1-1d28778ed903)
6. Tester quelques opérations de gestion de patients :
    - Ajouter des patients
    - Consulter tous les patients
    - Consulter un patient
    - Chercher des patients
    - Mettre à jour un patient 
    - supprimer un patient
7. Migrer de H2 Database vers MySQL
   ![image](https://github.com/user-attachments/assets/dc966e46-8684-4675-8b17-63e20c56300b)
8. Reprendre les exemples  du Patient, Médecin, rendez-vous, consultation, users et roles de la vidéo :
   Entitie patient:
   ![image](https://github.com/user-attachments/assets/b4293d6a-63d8-4ba7-b131-3b1a44f51110)
   Entitie Medecin:
   ![image](https://github.com/user-attachments/assets/6917e942-b160-43a5-91bc-7af0cc8bf9f8)
   Entitie RendezVous:
   ![image](https://github.com/user-attachments/assets/474b69c4-c4bc-402e-a421-8a9f9ada9466)
   Entitie Consultation :
   ![image](https://github.com/user-attachments/assets/f5354be4-667e-429d-b951-a39b55c68865)

# Conclusion
      Au terme de ce projet :
      
      Nous avons réussi à crée une application Spring Boot fonctionnelle, connectée d’abord à H2 puis à MySQL.
      
      Nous avons implémenté toutes les opérations CRUD sur l'entité Patient.
      
      Nous avons exploré le fonctionnement de Spring Data JPA, généré des méthodes de recherches automatiquement, et géré le changement de base de données simplement par configuration.
      
      Nous avons approfondi notre expérience sur Spring en incluant d’autres cas d’étude (comme médecin, rendez-vous, consultation, roles, utilisateurs) afin d’avoir une expérience proche d'une application d'envergure.
      
      Cette expérience a été l'occasion de se familiariser avec IntelliJ Ultimate, Spring Initializr, H2, MySQL, Spring Web, Spring Data JPA et Lombok, et de voir de près la création d'une API back-end robuste, évolutive et maintenable.
      





   

