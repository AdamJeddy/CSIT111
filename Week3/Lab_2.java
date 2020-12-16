package Week3;
import java.util.Scanner;

public class Lab_2 {

 public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); //Scanner to read the number

      System.out.println("Input a number: ");
      double num1 = scan.nextDouble();

      System.out.println("Input a number: ");
      double num111 = scan.nextDouble();
      System.out.println("Input another number: ");
      double radiant = scan.nextDouble();

      radiant = Math.toRadians(num111);

      double sine = Math.sin(radiant);
      double cos = Math.cos(radiant);

      System.out.println("Radiant is = "+ radiant);
      System.out.println("Sine is = "+ sine);
      System.out.println("Cosine is = "+ cos);


    // Task 2

        // Step 1 = Read an Input from the user
        // Step 2 = Store the Input
        // Step 3 = If Radius is >0 then go next step or else go to step 5
        // Step 4 = Use the users input to calculate the area & Display, Go to step 6
        // Step 5 = Display An Error message to the user
        // Step 6 = End

      System.out.println("Enter a Radius");
      double radius = scan.nextDouble();

      if (radius > 0) {
        System.out.println("Area of the circle is: "+ Math.PI* Math.pow(radius,2));
      } else {
        System.out.println("Invalid Input");
      }


    //Task 3
        //if the salary is 7000 or more print bonus which is 10% of the salary

      System.out.println("Enter a base salary: ");
      double salary = scan.nextDouble();

      if (salary <= 7000) {
       System.out.println("Sorry, you are not entitled to receive an end of year bonus");
      } else {
       System.out.println("You are entitled to recive an end of year bonus: "+ salary*0.1);
      }

      System.out.println("Thank You!");
 }//method end
}//class end