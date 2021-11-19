package week4;

public class StringStuff {
  public static void main(String[] args) {
//    stringFun();
    
//    String name = "I am ";
//    addRob(name);
//    System.out.println(name); // I am
    
    StringBuilder name = new StringBuilder("I am ");
    addRob2(name);
    System.out.println("13: " + name); // I am Rob
  }

  private static void addRob2(StringBuilder name) {
    name.append("Rob");
    System.out.println("18: " + name); // I am Rob
  }

  private static void addRob(String name) {
    name += "Rob";
    System.out.println(name);  // I am Rob
  }

  private static void stringFun() {
    String s1 = "Java is fun";
    String s2 = "Java is fun";
    System.out.println("s1==s2=" + (s1 == s2));
    
    String s3 = new String("Java is fun");
    String s4 = new String("Java is fun");
    System.out.println("s3==s4: " + (s3 == s4));
    System.out.println("s3.equals(s4): " + (s3.equals(s4)));
    
    String s5 = "Java" + " is " + "fun";
    String s6 = "Java is ".concat("fun");
    System.out.println("s5==s6: " + (s5 == s6));
    System.out.println("s5.equals(s6): " + (s5.equals(s6)));
    
    Integer i5 = 5;
    int i6 = 5;
    System.out.println("i5==i6: " + (i5.equals(i5)));
  }
}
