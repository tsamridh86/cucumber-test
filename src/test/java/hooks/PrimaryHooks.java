package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class PrimaryHooks{
    @Before("@FailureTest")
    public void beforeCall(){
        System.out.println("called before");
    }
    

    @After
    public void afterCall(){
        System.out.println("called after");
    }
}