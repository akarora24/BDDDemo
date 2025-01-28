package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("User should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {

        System.out.println("Given Executed Successfully");
    }

    @When("I type the message in the box")
    public void iTypeTheMessageInTheBox() {

        System.out.println("When Executed Successfully");
        System.out.println("This is Demo in 2025");
    }

    @And("Click on Post Button")
    public void clickOnPostButton() {

        System.out.println("And Executed Successfully");
    }

    @Then("the message should be posted")
    public void theMessageShouldBePosted() {
        System.out.println("Then Executed Successfully");
    }
}
