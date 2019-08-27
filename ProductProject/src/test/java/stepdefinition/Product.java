package stepdefinition;

import java.util.Random;

import cucumber.api.java.en.Given;

public class Product {
	@Given("^generate a random product id$")
	public void generate_a_random_product_id() throws Throwable {
		Random rand = new Random();
        int productId = rand.nextInt(58976);
        System.out.println("Your generated productId "+productId);
	}

	@Given("^check quality range between (\\d+) and (\\d+) equals poor$")
	public void check_quality_range_between_and_equals_poor(int arg1, int arg2) throws Throwable {
		 if(arg1<=30 && arg2>=45) {
	            System.out.println("poor sales");
	        } 
	        else if(arg1<45 && arg2>=70) {
	            System.out.println("Good Sales");
	        }
	        else {
	            System.out.println("Outstanding");
	        }
	    }
	}
