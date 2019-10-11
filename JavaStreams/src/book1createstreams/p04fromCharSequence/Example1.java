package book1createstreams.p04fromCharSequence;

public class Example1 {
	  public static void main(String[] args) {
		    String str = "5 123,123,qwe,1,123, 25";
		    str.chars()
		    .filter(n ->  !Character.isDigit((char)n) &&   !Character.isWhitespace((char)n))
		    .forEach(n ->  System.out.print((char)n));

		  }
}
//chars() from the CharSequence interface returns an IntStream
//whose elements are int values representing the characters.
//
//We can use chars() method on a String, a StringBuilder, and a StringBuffer.