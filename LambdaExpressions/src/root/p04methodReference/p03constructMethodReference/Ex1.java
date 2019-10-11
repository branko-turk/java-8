package root.p04methodReference.p03constructMethodReference;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex1 {

	  public static void main(String[] argv){
		    Supplier<String> func1  = () ->  new String();
		    System.out.println("Empty String :"+func1.get());
		    
		    Supplier<String> func2  = () ->  new String("Prvo");
		    System.out.println(func2.get());
		    
		    Function<String,String> func3  = str ->  new String(str);
		    System.out.println(func3.apply("Drugo"));

		    Supplier<String> func4  = String::new;
		    System.out.println("Empty String:"+func4.get());
		    
		    Function<String,String> func5  = String::new;
		    System.out.println(func5.apply("Trece"));
		  }
}
