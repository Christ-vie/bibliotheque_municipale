Gestion d'une bibliothèque
municipale
Vous avez été contacté par le directeur d'une bibliothèque municipale qui désire
informatiser sa gestion. Il compte beaucoup sur la mise en place d'un système
informatique pour améliorer la qualité du service offert aux usagers.
Actuellement, la gestion de la bibliothèque est faite entièrement manuellement, au
moyen d'un système de fiches manuscrites. Ce système entraîne une charge de travail
très lourde pour les employés et un gaspillage important (fiches périmées retirées du
fichier). La lourdeur du système est évidente si l'on considère que la bibliothèque
possède actuellement 36872 livres répartis entre 21709 titres différents et 2634
abonnés.
Grâce au système informatique, un abonné doit pouvoir retrouver un livre dans les
rayons connaissant son titre. Les livres sont identifiés par un code catalogue qui leur
est affecté à l'achat et par une cote qui permet de les situer dans la bibliothèque.
L'abonné doit aussi pouvoir connaître la liste des livres d'un auteur ou la liste par éditeur
ou encore la liste par thème (bande dessinée, science fiction, policier,...). Chaque livre
est acheté en un ou plusieurs exemplaires (on stocke la date d'acquisition). Tous les
exemplaires d'un même livre ont une cote différente mais le même code catalogue. Les
différents exemplaires d'un même livre peuvent éventuellement provenir de différents
éditeurs. Pour suivre de près l'état du stock, la bibliothèque utilise un code indiquant
l'état d'usure de chaque livre. Ce code d'usure est éventuellement mis à jour par un
bibliothécaire à chaque retour d'un livre en prêt.
Le directeur souhaite également mettre en place une procédure de recherche
documentaire par mots-clés. Vous devez donc prévoir la possibilité de recherche à
partir d'un mot-clé de tous les ouvrages correspondants. Un ouvrage peut avoir un
nombre quelconque de mots-clés.
La bibliothèque utilise aussi un fichier des abonnés organisé par numéro matricule qui
contient notamment les coordonnées (nom. adresse et téléphone) de l'abonné, sa date
d'adhésion, sa date de naissance, sa catégorie professionnelle (ou bien étudiant ou
enfant, le cas échéant).
La gestion des prêts implique qu'on connaisse à tout moment la liste des livres détenus
par un abonné et inversement qu'on puisse retrouver le nom des abonnés détenant un
livre non présent dans les rayons.
Les prêts sont accordés pour une durée de 15 jours éventuellement renouvelable, si
aucune demande de ce livre n'a eu lieu entre-temps. Il faut donc connaître pour chaque
livre emprunté, la date du prêt et la date de retour. La gestion des prêts nécessite aussi
la mémorisation des livres demandés par un abonné. Cet abonné sera prioritaire lors du
retour du livre en prêt. Sa priorité est maintenue pendant une semaine, à partir de la
date de retour du livre.
Par ailleurs, tout livre non restitué envoie un email de notification et entraîne un blocage
du compte utilisateur jusqu'à la restitution des livres. Le déblocage du compte est
effectué manuellement par le salarié lors de la restitution de tous les livres en retard.
Un utilisateur peut créer un compte sur l’application et ou se connecter avec son
compte github.
On vous demande en dehors de l’implémentation de la solution de :
● Définir les users story de l’application
● Réfléchir à l’architecture de l’application.
● Mettre en perspective les systèmes d'intégration continue, de déploiement
continue.
● Définir Les ressources dont vous avez besoin
● Définir les technologies utilisées
● Etc ...
Il est vivement recommandé d’organiser vos idées dans un kanban sous github:
En créant un projet et un repository qui sera linker au projet.
Cette application sera développée en utilisant les compétences vues dans les modules.
Le choix des langages de développement est libre, il faut néanmoins respecter les
bonnes pratiques pour la sécurisation et la distribution, la documentation.
Par ailleurs, pour tous ceux qui vont travailler sur Java, il faudrait utiliser Maven, et
éventuellement Spring/Spring-boot.
Pour les autres langages, il faut indiquer votre gestionnaire de projet s’il en existe.
Enfin, proposer une stratégie de rentabilisation de son application.
Ressources
Votre projet (repository et kanban) sera créé sur l'organisation github ynovmaster2
dans lequel sera généré les équipes projets une fois les groupes connus.
Pipeline:
● Github Actions
Gestion de projet:
● Github project
○ Utiliser l’option Automated Kanban (To do, In progress, Done)
○ Ajouter l'étape Close (codes livrés) et cocher toutes les options
○ Linker votre kanban à votre repository
○ Définir vos tâches pour le suivis de la production
○ Vos repos et projet sont privés.
● Gestions des branches
○ Gitflow
○ Ou Manuel mais il faut une branch develop en plus de la branch master
Sonar:
● https://sonarcloud.io/organizations/ynovmaster2/
● Id organization: ynovmaster2
Artifactory:
● https://jfrog.com/artifactory/start-free/#saas
● Génération de votre serveur et création des repos
MongoDB
● https://mlab.com/
● Création de la base
Serveur de déploiement:
● La plateform cloud https://www.heroku.com/ est conseillée
○ Linker heroku et github via la génération des tokens
○ Il faut un serveur de dev (develop) et de production (master)
● Si vous déployer dans une autre plateforme il faut l’indiquer
Consignes
Vous devez prêter à attentions aux éléments suivants qui seront pris en compte lors de
la notation.
Il faudrait Obligatoirement me restitué sur le moodle du devoir un pdf d’une page
minimum:
● Description du réalisé
● Description des rôles
● Liens des ressources github, sonar, artifactory etc.
● Toutes informations utiles
Ci-dessous les éléments de votre kanban pour gérer vos users stories et tâches:
● To Do
● In progress
● Done
● Close
Il faut documenter votre projet et vos codes
Il faut tester votre code
Il faut que votre projet soit visible sur https://sonarcloud.io/ pour son évaluation
Il faut que vos artefacts (snapshot et releases) soient disponibles sur
https://votreserveur.jfrog.io/
Il faut que votre projet soit déployable sur heroku ou ailleurs
https://www.heroku.com/
Il faut définir votre pipeline d’intégration et déploiement continue (CI/CD) avec les
github actions pour automatiser votre build test sonar , publication sur artifactory et
déploiement.
La gestion rigoureuse de vos branches seraient également pris en compte:
1. Une branche develop pour déployer votre application en recette (une instance
heroku de dev)
2. Une branche master qui sera utiliser pour faire la release et déployer votre
application en production, votre pipeline devrait se déclencher lors des merges
request sur cette branche (un instance heroku de prod)
3. Des branches de features/release pour les tâches particulières
Des documents utiles pour le projet
● Readme.md
● .gitignore
● LICENSE (voir sur github)
● CHANGELOG
○ R0.0.1 - 24/01/2020
○ Exemple initialisation du projet
● Fournir le fichier settings.xml pour publier depuis votre ordinateur vers le serveur
distant jfrog
Il faut que votre projet soit fonctionnel
Si vous avez un projet maven, Il faut que dans le pom.xml on retrouve les
métadonnées sur le projet:
● Documenter la balise name
● Documenter la balise description
● Documenter la balise developers
● Documenter la balise contributors (m’ajouter)
● Documenter la balise licenses
● Définir la balise scm
● Définir la balise distributionManagement Les repos pour publier votre artefact
sur jfrog
● Etc.
Pour les projets non maven il faudrait également documenter les éléments listés
ci-dessus et indiquer le fichier de description.
