package root.p01beforejava8.innerclassimplementation;

import root.p01beforejava8.myInterface;

public class Test {

	public static void main(String[] args) {
		myInterface mi = new myInterface() {
			public void myFunc(String str) {
				if(str != null) {
				   System.out.println(str + " length is " + str.length());			
				}
				else {
					   System.out.println("argument is null");				
				}
		    }
		};
		mi.myFunc("Nikola");
		
		 mi = new myInterface() {
			 public void myFunc(String str) {

				System.out.println("Hello, " + str);				
			 }
		};
		mi.myFunc("Nikola");		
	}

}
