import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        boolean Flag = true;
        while (Flag == true) {
            try {
                final int votingAge = 18;
                Scanner myObj = new Scanner(System.in);
                System.out.println("Enter your age: ");
                int age = myObj.nextInt();
                if (age < votingAge && age > 0) {
                    System.out.println("You are not allowed to vote!");
                } else if (age >= votingAge) {
                    System.out.println("You are allowed to vote!");
                } else {
                    System.out.println("Enter an age above and not equal to zero!");
                }


            } catch (InputMismatchException se) {
                System.out.println("Please enter positive integers only!");
            } catch (Exception generic) {
                System.out.println("Something else went wrong. . . ");
            }
        }


    }
}