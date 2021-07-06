package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before("@Mobiletest")
	public void before() {
		System.out.println("the before validation part");
	}
	
	
	@After("@Mobiletest")
	public void after() {
		
		System.out.println("the after validation part ");
	}
	
	@Before("@ahmad")
	
	public void before_ahmad(){
		System.out.println("before ahmad");
	}
	
	@After("@ahmad")
	
	public void after_ahmad(){
		System.out.println("after ahmad");
	}
	
	
}
