package root.p03functioninterface.p06biFunction.toLongBiFunction;

import java.util.function.ToLongBiFunction;

import root.p03functioninterface.classes.Person;

public class ToLongBiFunctionEx1 {
	  public static void main(String[] args) {
		    
		    long lng = add( "3", "5", (x,y)-> Long.parseLong(x) + Long.parseLong(y) );
		    System.out.println(lng);
		  }
	  
		static long add(String s1, String s2, ToLongBiFunction<String, String>  toLongBiFunction){
			return toLongBiFunction.applyAsLong(s1, s2);
		}
}
