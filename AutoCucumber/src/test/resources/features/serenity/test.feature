#language:fr


Fonctionnalité: : Test


  Plan du scénario: Un étudiant remplie et valide le formulaire d'inscription
    Soit un étudiant sur le site <url>
    Quand il saisit son username <username>
    Et il saisit sont password <password>
    Et il clique sur le bouton login
    Alors le message d'erreur <message> apparait en rouge
    Exemples:
      | url                        | username  | password  | message                           |
      | "https://demoqa.com/login" | "user"    | "Name"    | "Invalid username or password!"   |