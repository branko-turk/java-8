package root.p04methodReference.classes;

public class Util{
	  private int count=0;
	  public void print(String s){
	    System.out.println(s);
	    count++;
	  }
	  public void debug(){
	    System.out.println("count:" + count);
	  }

	public static String append(String s1, String s2) {
		return s1 + " " + s2;
	}  	  
	  
}
