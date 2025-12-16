Gestion d’une Médiathèque

Description

Ce projet implémente une médiathèque en Java permettant de gérer des médias (livres, DVDs, etc.) et d'effectuer des opérations comme l'ajout, l'emprunt, le retour, et l'affichage des informations sur ces médias. Le projet permet de pratiquer plusieurs concepts de programmation orientée objet en Java tels que l'encapsulation, l'héritage, le polymorphisme, les interfaces, et la gestion des exceptions.

Fonctionnalités
1. Gestion des Médias

Ajouter des médias (livres, DVDs, etc.).

Emprunter et retourner des médias.

Afficher les informations des médias (titre, auteur/réalisateur, année, nombre de pages/durée, disponibilité).

Rechercher un média par titre.

2. Interfaces et Abstraction

Interface Empruntable : Permet de gérer l'emprunt et le retour des médias.

Classe abstraite Media : Contient des attributs et des méthodes communs à tous les types de médias.

Polymorphisme : Implémentation de polymorphisme pour afficher les informations des médias.

3. Interface Utilisateur

Menu texte permettant à l'utilisateur d'interagir avec le programme.

Gestion des exceptions lorsque l'on tente d'emprunter un média déjà emprunté.

Structure du Projet

Le projet est organisé en plusieurs packages pour séparer la logique métier, les services et l'interface utilisateur :

1. mediatheque.model

Contient les classes métier qui représentent les entités du projet :

Media : Classe abstraite de base pour les différents types de médias.

Livre : Représente un livre, sous-classe de Media.

Dvd : Représente un DVD, sous-classe de Media.

Utilisateur : Représente un utilisateur qui peut emprunter des médias.

Empruntable : Interface pour définir les opérations liées à l'emprunt de médias.

2. mediatheque.service

Contient la logique métier de la médiathèque :

Mediatheque : Classe qui gère l'ajout, l'affichage, et la recherche de médias dans la médiathèque.

3. mediatheque.ui

Contient les classes pour l'interface utilisateur (principalement pour les tests et les interactions avec l'utilisateur) :

TestMediatheque : Programme principal pour tester les fonctionnalités de la médiathèque (emprunt, retour, etc.).

Afficheur : Classe utilitaire pour afficher les informations des objets qui implémentent l'interface Affichable.

Structure des fichiers

Voici la structure des fichiers du projet :
TP_Mediatheque/
│
├── mediatheque/
│   ├── model/
│   │   ├── Media.java
│   │   ├── Livre.java
│   │   ├── Dvd.java
│   │   ├── Utilisateur.java
│   │   ├── Empruntable.java
│   │   └── Affichable.java
│   │
│   ├── service/
│   │   └── Mediatheque.java
│   │
│   └── ui/
│       ├── TestMediatheque.java
│       ├── Afficheur.java
│       └── TestMediatheque2.java
└── README.md


Media.java : Classe abstraite représentant un média.

Livre.java : Classe représentant un livre.

Dvd.java : Classe représentant un DVD.

Utilisateur.java : Classe représentant un utilisateur.

Empruntable.java : Interface définissant les méthodes pour emprunter et retourner des médias.

Mediatheque.java : Classe gérant les médias dans la médiathèque.

TestMediatheque.java : Classe pour tester les fonctionnalités du programme.

Afficheur.java : Classe utilitaire pour afficher les informations des objets.

Auteurs

Nom : MOHAMED EL OMARI
Date : 16/12/2025

