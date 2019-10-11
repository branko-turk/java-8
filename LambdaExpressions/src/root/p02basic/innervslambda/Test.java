package root.p02basic.innervslambda;

import root.p01beforejava8.myInterface;

public class Test {

	public static void main(String[] args) {
		//inner class
		myInterface mi = new myInterface() {
			 public void myFunc(String str) {

				System.out.println("Hello, " + str);				
			 }
		};
		mi.myFunc("Nikola");
		
		//lambda
		mi  =  s -> System.out.println("Hello, " + s);
		mi.myFunc("Nikola");
	}
}
