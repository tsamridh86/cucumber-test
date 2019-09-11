package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {

    private String today;
    private String answer;

    @Given("today is {string}")
    public void today_is_day(String day) {
        today = day;
    }
    
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        if("Friday" == today){
            answer = "Yes!";
        }else{
            answer = "Nope";
        }
    }
    
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, answer);
    }
    
}
