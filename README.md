# Helpdesk Ticket System

Système de gestion de tickets de support technique en Java, avec 
file de priorité et authentification sécurisée.

## Fonctionnalités
- Création de tickets avec priorité (Basse/Moyenne/Haute/Critique)
- Traitement des tickets selon leur urgence (PriorityQueue + Comparator personnalisé)
- Mots de passe utilisateurs hachés avec sel aléatoire (SHA-256), jamais stockés en clair
- Menu interactif en console

## Architecture
- `User`, `Ticket` — modèle de données, encapsulation complète
- `TicketManager` — logique métier, séparée de l'interface (Main)
- `PasswordUtils` — hachage et salage sécurisé des mots de passe
- Enums `Role`, `Statut`, `Priorite`

## Lancer le projet
1. Cloner le dépôt : `git clone https://github.com/ninaraima2/helpdesk-ticket-system.git`
2. Ouvrir le dossier dans VS Code (ou tout IDE avec support Java)
3. S'assurer d'avoir le JDK 21+ installé (`java -version` pour vérifier)
4. Lancer `Main.java` (bouton "Run" au-dessus de `public static void main`, ou clic droit → "Run Java")
5. Suivre le menu interactif dans le terminal

## Améliorations prévues
- Évolution vers une API REST avec Spring Boot (authentification JWT, RBAC)