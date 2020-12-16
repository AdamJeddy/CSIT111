package Week3;
import java.util.Scanner;

public class Lecture3 {

	public static void main(String[] args) {
		
		//Channel for console
		Scanner in = new Scanner(System.in);
			//For Start
			for (int i =1; i<=5; i++) {
			
			//Reading from the user
			System.out.println("Please Enter an Integer No. "+ i +" : ");
			int num = in.nextInt();
			
			//Checking if odd or even and displaying
			if (num%2 == 0) System.out.println("The Number is Even");
			else System.out.println("The number is Odd");
			}//For End
			
			//////////////////////////////////////////////////////////
//		//Adding 5 integers ---- computing their sum and average
//		Scanner in = new Scanner(System.in);//Channel for console
//		
//		int sum=0;
//		
//		for(int i=1; i<=5; i++){//for start
//			System.out.println("Please Enter Interger No. "+ i +":");
//			int num = in.nextInt();
//			sum = sum + sum;
//		}//for end
//		
//		double average = sum/5;//computing average
//		
//		System.out.println("Sum = " +sum);
//		System.out.println("Average = " +average);
			
			//Scanner in = new Scanner(System.in);
			
			int user_input;
			do {
				System.out.println("Enter a Number : ");
				user_input = in.nextInt();
			}while(user_input >=0);
		}
		
		//System.out.println("End of the Program. Thank You!");
		
	}//main method End

//}//main class End
