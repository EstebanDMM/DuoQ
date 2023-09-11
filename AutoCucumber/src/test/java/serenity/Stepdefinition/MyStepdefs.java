package serenity.Stepdefinition;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;


public class MyStepdefs extends PageObject {
    @FindBy(id = "userName")
    WebElementFacade inputuserName;

    @FindBy(id = "password")
    WebElementFacade inputpassword;

    @FindBy(id = "login")
    WebElementFacade pressloginbutton;

    @FindBy(id = "name")
    WebElementFacade errormessage;

    @Soit("un étudiant sur le site {string}")
    public void unÉtudiantSurLeSite(String url) { openAt(url);
    }

    @Quand("il saisit son username {string}")
    public void ilSaisitSonUsername(String username) { inputuserName.sendKeys(username);
    }

    @Et("il saisit sont password {string}")
    public void ilSaisitSontPassword(String password) { inputpassword.sendKeys(password);
    }

    @Et("il clique sur le bouton login")
    public void ilCliqueSurLeBoutonLogin() { pressloginbutton.click();
    }

    @Alors("le message d'erreur {string} apparait en rouge")
    public void leMessageDErreurApparaitEnRouge(String message) {
        Assert.assertEquals(errormessage.getText(), message);
    }
}
