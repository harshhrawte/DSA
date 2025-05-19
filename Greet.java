public class Greet {
  public static void main(String[] args) {
    String personalized = myGreet("hii");
    System.out.println(personalized);
  }

  // Method definition outside the main method
  static String myGreet(String name) {
    String message = "Hello " + name;
    return message;
  }
}

