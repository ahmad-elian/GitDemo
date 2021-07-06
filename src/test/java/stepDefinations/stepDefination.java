package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefination {

	
	 @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	       System.out.println("browser has been validated");
	    }

	    @When("^browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
		       System.out.println("browser has been triggered");
	    }

	    @Then("^check if browser has started$")
	    public void check_if_browser_has_started() throws Throwable {
		       System.out.println("browser has started");
	    }

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("Given is done");
    }

    
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("username is: "+strArg1+ " password is:" + strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Then is done");    
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
       
   List<String> obj=data.asList();
   System.out.println("the list resutlt is "+obj.get(1));
     	
    	
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
       System.out.println("card display status is: "+strArg1);
    }

 
    @When("^User login using (.+) and (.+)$")
    public void user_login_using_and(String username, String password) throws Throwable {
       
    	System.out.println(username);
    	System.out.println(password);
    }

	
}
