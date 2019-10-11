package root.p04methodReference.p02instanceMethodReference.bound;

import java.util.function.Supplier;

public class Ex1 {

		  public static void main(String[] argv){
			String myString = "Hello";		  
		    Supplier<Integer> supplier  = () ->  myString.length(); 
		    System.out.println(supplier.get());
		    
		    Supplier<Integer> supplier1  = "Hello"::length; 
		    System.out.println(supplier1.get());
		  }
}
