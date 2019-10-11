package book2streamoperations.p10collectorsOperations.toMap;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapEx1 {

	    public static void main(String[] args) 
	    { 
	        Stream<String[]>  str = Stream 
	                      .of(new String[][] {
	                    	  					{ "GFG", "GeeksForGeeks" }, 
	                                            { "g", "geeks" }, 
	                                            { "G", "Geeks" } 
	                                         }); 
	        Map<String, String>   map = str.collect(Collectors.toMap(p -> p[0], p -> p[1]) ); 
	        System.out.println("Map:" + map); 
	    } 
}
