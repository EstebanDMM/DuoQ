#language:fr


Fonctionnalité: : Test2

  Règle: un utilisateur est déjà sur un page du webdriver
    Contexte:
      Soit un utilisateur sur le site web de selenium "https://selenium.dev"
      Quand il clique sur le bouton webdriver
      Alors il arrive sur la page webdriver "WebDriver"



    Scénario: un utilisateur surf sur le site web de selenium
      Quand il clique sur le lien Getting started
      Alors il arrive sur la page correspondante a "Getting started"
      Quand il clique sur le lien téléchargement
      Alors il arrive sur la page de telechargement
      Et il verifie que le titre est bien egale a "Downloads"