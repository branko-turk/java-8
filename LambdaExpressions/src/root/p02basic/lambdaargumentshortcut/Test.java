package root.p02basic.lambdaargumentshortcut;

import root.p01beforejava8.myInterface;

public class Test {

	public static void main(String[] args) {

		myInterface mi  =  s -> System.out.println("Hello, " + s);
		process(mi);
		//shortcut
		process( s -> System.out.println("Hello, " + s) );		
	}
	
	public static void process(myInterface mi) {
		mi.myFunc("Nikola");
	}	

}
