package root.p03functioninterface.p06biFunction.toDoubleBiFunction;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionEx1 {
	  public static void main(String[] args) {
		    
		  double lng = add( "3.2", "5.3", (x,y)-> Double.parseDouble(x) + Double.parseDouble(y) );
		    System.out.println(lng);
		  }
	  
		static double add(String s1, String s2, ToDoubleBiFunction<String, String>  toDoubleBiFunction){
			return toDoubleBiFunction.applyAsDouble(s1, s2);
		}
}
