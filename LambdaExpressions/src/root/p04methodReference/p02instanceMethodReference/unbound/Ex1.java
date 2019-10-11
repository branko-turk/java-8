package root.p04methodReference.p02instanceMethodReference.unbound;

import java.util.function.Function;

public class Ex1 {

	  public static void main(String[] argv){
		    Function<String,  Integer> strLengthFunc = String::length; 
		    String name ="ana";
		    int len   =  strLengthFunc.apply(name); 
		    System.out.println("name  = "  +  name + ", length = "  + len);
		    
		    name ="bane";
		    len   =  strLengthFunc.apply(name); 
		    System.out.println("name  = "  +  name + ", length = "  + len);

		  }
}
//An unbound receiver uses the following syntax
//ClassName::instanceMethod
//It is the same syntax we use to reference a static method.
//From the following code we can see that the input type is the type of ClassName.
//In the following code we use String:length so the functional interface input type is String.
//The lambda expression gets the input when it is being used.
//The following code uses the String length method as unbind instance method reference.
//The String length method is usually called on a string value instance and returns 
//the length of the string instance. Therefore the input is the String type and output is the int type, 
//which is matching the buildin Function functional interface.
//
//Each time we call strLengthFunc we pass in a string value and the 
//length method is called from the passed in string value.