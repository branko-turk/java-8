package book1createstreams.p05fromRegex;

import java.util.regex.Pattern;

public class Example1 {
	  public static void main(String[] args) {
		    String str = "XML,CSS,HTML"; 
		    Pattern.compile(",")
		    .splitAsStream(str)
		    .forEach(System.out::println);

		  }
}
