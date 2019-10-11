package root.p04methodReference.p02instanceMethodReference.bound;

import java.util.function.Consumer;
import root.p04methodReference.classes.Util;

public class Ex2 {

	  public static void main(String[] argv){
		    Util util = new Util();
		    
		    Consumer<String> consumer  = str ->  util.print(str);
		    consumer.accept("Hello"); 

		    Consumer<String> consumer1  = util::print;
		    consumer1.accept("Hello");
		    
		    util.debug();
		  }
}
