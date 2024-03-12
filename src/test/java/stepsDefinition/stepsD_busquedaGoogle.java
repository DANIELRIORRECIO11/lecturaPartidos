package stepsDefinition;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class stepsD_busquedaGoogle {
    @Given("^Abrir Google")
    public void abrirGoogle(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Daniel");
        theActorInTheSpotlight().attemptsTo(Open.url("https://www.google.com/"));
    }
}
