import java.util.Scanner; //importing a Library

public class Lecture2 {

	public static void main(String[] args) {
	//Arithmetic Operators
		int k=5; //"=" is called an assignment
		int j=k+7;
			System.out.println("(j)  5+7 = "+j);
		k=30%4; //Reminder
			System.out.println("(k)  30%4 = " +k);
	//Relational Operators
		boolean b=5>7;
			System.out.println("(b)  5>7 = "+b);
		b=6!=5;
			System.out.println("(b)  6!=5 = "+b);
		b= k==2;
			System.out.println("(b)  k==2 = "+b);

	//Logical Operators [&&(And) ||(Or)]
   		//              True    True
		boolean b1= (5!=6)&&(6>3);
			System.out.println("(b1) 5!=6 And 6>3 = "+b1);
		//              False   True
		boolean b2= (5==6)&&(6>3);
			System.out.println("(b2) 5==6 And 6>3 = "+b2);
		//              False   True
		boolean b3= (5!=6)||(6>3);
			System.out.println("(b3) 5!=6 Or 6>3 = "+b3);
		//             False   False
		boolean b4= (5==6)||(6>3);
			System.out.println("(b4) 5==6 Or 6>3 = "+b4);
		//  	     False   False
		//boolean b5= (5!=5)||(-5> 0);
		//	System.out.println("(b5) 5!=5 Or -5>0 = "+b5);

	//Use a function from the Library
   	    //  2 to the power 3
		int k2=(int)Math.pow(2, 3);
			System.out.println("(k2) 2^3 = "+k2);

	//Getting an Input
		Scanner in= new Scanner(System.in);

			System.out.println(" enter a double number");
		double d1=in.nextDouble();
			System.out.println("(d1) you entered = "+d1);

	//Concatenating 2 Strings
		String s1="Hello how are you";
		String s2=" Pls be Quite if you want to learn well";
		s1=s1.concat(", "+s2);
			System.out.println("(s1) "+s1);

	//Number of characters in s1
		long number=s1.length();
			System.out.println("(s1) No. of characters in ^ = "+number);

	//Locating characters at X postion
		char firstone=s1.charAt(0);
			System.out.println("(s1) First letter = "+firstone);
		char lastone=s1.charAt(55);
			System.out.println("(s1) Last letter = "+lastone);

	//Comparing Strings
		s1="HELLO";
		s2="hello";
			System.out.println("Hello compared to hello = "+s1.equals(s2));
			System.out.println("Hello compared to hello (ignore case) = "+s1.equalsIgnoreCase(s2));

	//Converting String to Int
		String s3="123";
		number = Integer.parseInt(s3);
			System.out.println("(s3) Converting String to Int = "+s3);

	//Size of the DataType e.g. Double or Integer
		System.out.println("size of DataType: int = "+Integer.SIZE);

	//Size of DataType
		System.out.println(double.SIZE);
	}//method end
}//class end
