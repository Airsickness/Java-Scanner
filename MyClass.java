import java.util.Scanner;

public class MyClass {
    static void FullName(String name, String family) {
      System.out.println("Your full name is " + name + " " + family);
    }
    static String input(String promt) {
      Scanner myObj = new Scanner(System.in);
      System.out.println(promt);
      String inputFromUser = myObj.nextLine();
    }
    public static void main(String args[]) {
    String answer = input("What is your name?");
    if (inputFromUser == "Rosti") {
      System.out.println("Hi friend!");
    } else {
      System.out.println("Hello " + inputFromUser);
    }

    
    }
}