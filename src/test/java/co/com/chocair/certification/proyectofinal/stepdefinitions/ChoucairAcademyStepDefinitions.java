package co.com.chocair.certification.proyectofinal.stepdefinitions;
import co.com.chocair.certification.proyectofinal.model.UtestData;
import co.com.chocair.certification.proyectofinal.questions.Answer;
import co.com.chocair.certification.proyectofinal.tasks.Login;
import co.com.chocair.certification.proyectofinal.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Alejo wants to register on the uTest site$")
    public void alejoWantsToRegisterOnTheUTestSite() {
        OnStage.theActorCalled("Alejo").wasAbleTo(OpenUp.thePage());
    }

    @When("^he enters the data to register on the page$")
    public void heEntersTheDataToRegisterOnThePage(List<UtestData> utesdata) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.the(utesdata.get(0).getStrName(),utesdata.get(0).getStrLastName(),utesdata.get(0).getStrEmail(),utesdata.get(0).getStrCity(),
                utesdata.get(0).getStrZip(),utesdata.get(0).getStrPassword(),utesdata.get(0).getStrConfirmPassword()));
    }

    @Then("^successful registration$")
    public void successfulRegistration(List<UtestData> utesdata) throws Exception {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat((Answer.toThe(utesdata.get(0).getReference()))));
    }
}
