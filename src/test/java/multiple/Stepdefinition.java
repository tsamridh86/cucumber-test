package multiple;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefinition {

    private String currentDay;
 private String answer;

    
    @Given("today is {string}")
public void today_is(String day) { 
    currentDay = day;
}

@When("I ask whether it's Friday yet")
public void i_ask_whether_it_s_Friday_yet() {
   answer = "Nope";
    if(currentDay.equals("Friday")){
        answer = "TGIF";
   }

}

@Then("I should be told {string}")
public void i_should_be_told(String expectedAnswer) {
    assertEquals(expectedAnswer,answer);
}
}