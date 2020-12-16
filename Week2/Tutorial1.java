import java.util.Scanner;

public class Tutorial1 {
public static void main(String[] args) {
//Take 2 numbers, sum them and print it 

//Part A
Scanner input = new Scanner (System.in);
System.out.println( "Please enter the first number" );
long X;
X = input.nextLong();

System.out.println( "Please enter the second number" );
long Y;
Y = input.nextLong();

System.out.println( "The sum is "+ (X + Y) );

//Question 7
boolean b1 = 5 > 6;
b1 = (5 > 6) || (6 < 5);
	System.out.println(b1);
b1 = (5 > 6) || (5 == 6);
	System.out.println(b1);
b1 = (5 > 6) && (5 ==6 );
	System.out.println(b1);
b1 = 'A' > 'B';
	System.out.println(b1);
b1 = (5 <= 7) && !(7 < 9);
	System.out.println(b1);

//Question 8
boolean A = (17 < (4 * 3) +5) || (8 * 2 == 4 * 4) && !(3 + 3 == 6);
System.out.println(A);

//Read 3 numbers and sort them by viewing them
//Part B
int num1, num2, num3, smallest = 0;
Scanner readinput = new Scanner(System.in);

System.out.print("Enter three integers: ");
	num1 = readinput.nextInt();
	num2 = readinput.nextInt();
	num3 = readinput.nextInt();
	
// num1 < (num2 and num3)
if((num1 < num2) && (num1 < num3)) {
	System.out.println("The smallest number amoung "+num1+","+num2+","+num3+" is "+num1);
}
// num2 < (num1 and num3)
else if{
	if((num2 < num1) && (num2 < num3)) {
		System.out.println("The smallest number amoung "+num1+","+num2+","+num3+" is "+num2);
	}
	else if((num3 < num1) && (num3 < num2)) {
		System.out.println("The smallest number amoung "+num1+","+num2+","+num3+" is "+num3);
	}
}//else if end
// num1 = num2 = num3
else ((num3 == num1) && (num3 == num2)) {
System.out.println("Not applicable, all inputs is similar");
}//else end

}}//main and class end