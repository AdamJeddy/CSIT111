package Week3;

import java.util.Scanner;

public class Tutorial_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Part A Question 1 
        System.out.println("Part A Question 1");
        int num1_1;
        int num2_1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1_1 = scn.nextInt();
        System.out.println("Enter Second Number: ");
        num2_1 = scn.nextInt();

        System.out.println("num1 + num2 : " + (num1_1 + num2_1));

        //Question 2		TO CHECK IF 2 NUMBERS ARE ODD OR EVEN
        System.out.println("Part A Question 2");
        float num1_2;
        float num2_2;
        
        System.out.println("Enter First Number: ");
        num1_2 = scn.nextFloat();
        System.out.println("Enter Second Number: ");
        num2_2 = scn.nextFloat();

        System.out.println("Average for num1 & num2 is: " + ((num1_2 + num2_2) / 2));

        //Part B	Practice of For and Switch Case Statements
        //Question 10		Changing numbers to Names of the Month
        System.out.println("Part B Question 10");
        System.out.println("Enter number between 1 and 12: ");
        int n = scn.nextInt();

        switch (n) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Please enter a valid number");
                break; // when no case is satisfied  
                								
    	
                
        }


    }

}