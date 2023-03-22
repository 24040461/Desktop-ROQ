package steps;

import driverFactory.driverFactory;
import elementsFactory.mainNotepadElements;
import elementsFactory.printElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class helpSteps {
    private mainNotepadElements main = new mainNotepadElements(driverFactory.getdriver());

    private printElements printPage = new printElements(driverFactory.getdriver());
    @When("user clicks on help")
    public void userClicksOnHelp() {
        main.help.click();
        main.aboutNotepad.click();
    }

    @Then("user will see winver")
    public void userWillSeeWinver() {
        main.microsoftTerms.click();
        main.OK.click();
    }
}
