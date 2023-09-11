package serenity.Stepdefinition;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;

import net.serenitybdd.annotations.Title;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class MyStepdefs2 extends PageObject {

    @FindBy(xpath = "//*[@class=\"selenium-button selenium-webdriver text-uppercase fw-bold\"]")
    WebElementFacade bouttonwebdriver;

    @FindBy(xpath = "//*[@id=\"main_navbar\"]//span[text()=\"Downloads\"]")
    WebElementFacade ecritdownload;

    @FindBy(id = "m-documentationwebdrivergetting_started")
    WebElementFacade gettingstarted;




    //background

    @Soit("un utilisateur sur le site web de selenium {string}")
    public void unUtilisateurSurLeSiteWebDeSelenium(String arg0) { openAt(arg0);
    }

    @Quand("il clique sur le bouton webdriver")
    public void ilCliqueSurLeBoutonWebdriver() {    bouttonwebdriver.click();
    }

    @Alors("il arrive sur la page webdriver {string}")
    public void ilArriveSurLaPageWebdriver(String arg0) {
        Assert.assertEquals(getTitle(),arg0+" | Selenium");
    }

    //Test

    @Quand("il clique sur le lien Getting started")
    public void ilCliqueSurLeLienGettingStarted() {  gettingstarted.click();
    }

    @Alors("il arrive sur la page correspondante a {string}")
    public void ilArriveSurLaPageCorrespondanteA(String arg0) {
        Assert.assertEquals(getTitle(),arg0+" | Selenium");
    }

    @Quand("il clique sur le lien téléchargement")
    public void ilCliqueSurLeLienTéléchargement() {  ecritdownload.click();
    }

    @Alors("il arrive sur la page de telechargement")
    public void ilArriveSurLaPageDeTelechargement() {
    }

    @Et("il verifie que le titre est bien egale a {string}")
    public void ilVerifieQueLeTitreEstBienEgaleA(String arg0) {
        Assert.assertEquals(getTitle(),arg0+" | Selenium");
    }



}
