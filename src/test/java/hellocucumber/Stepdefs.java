package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {

    private String today;
    private String answer;

    @Given("I am logged in")
    public void loggedIn(){
        System.out.println("background task");
    }




    @Given("today is {string}")
    public void today_is_day(String day) {
        System.out.println("step1");
        today = day;
    }
    
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        System.out.println("step2");
        if("Friday".equals(today)){
            answer = "Yes";
        }else{
            answer = "Nope";
        }
    }
    
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        System.out.println("step3");
        assertEquals(string, answer);
    }
    
}
