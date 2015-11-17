public class Test {
	
  public static void main(String[] args) {
    String s = new String("Welcome to Java");
    Object o = s;
    String d = (String)o;
    System.out.println(d);
  }
}