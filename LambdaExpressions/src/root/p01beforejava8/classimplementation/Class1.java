package root.p01beforejava8.classimplementation;

import root.p01beforejava8.myInterface;

public class Class1 implements myInterface {
	public void myFunc(String str) {
		if(str != null) {
		   System.out.println(str + " length is " + str.length());			
		}
		else {
			   System.out.println("argument is null");				
		}
	}
}
