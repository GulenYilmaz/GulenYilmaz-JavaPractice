package Java.Practice.Bilkent;
import java.util.Scanner;
public class JavaPractice003 {
	public static void main(String[] args) {
	/* 1) Assuming result is a float variable that contains the value 27.32 and value is an int variable that contains the value 15, what are the values of each of the variables after the following  assignment statement is executed? Explain.
value = (int) result; */
	float result=27.32f;
	int value=15;
	value=(int)result;
	System.out.println(value);//---> 27
	/*2) Given the following declarations, what result is stored by each of the following assignment statements.
int iResult, num1 = 17, num2 = 5;
double fResult, val1 = 12.0, val2 = 2.34;
a. iResult = num1 / num2;
b. fResult = num1 / num2;
c. fResult = val1 / num2;
d. fResult = (double) num1 / num2;
e. iResult = (int) val1 / num2; */
	int num1=17;
	int num2=5;
	double val1=12.0;
	double val2=2.34;
	int iResult=num1/num2;//--->3
	double fResult=num1/num2;//--->3.0
	 fResult= val1/num2;//--->2.4
//fResult=(double)num1/num2;//-->3.4--->17/5
	//Result1=(int)val1/num2;//--->2
	/* 3) Assume you already have instantiated a Scanner object named myScanner and an int variable named value as follows in your program:
		 Scanner myScanner = new Scanner(System.in);
		 int value = 0;
		 Write program statements that will ask the user to enter their age, and store their response in value */
	Scanner myScanner=new Scanner(System.in);
	int value1=0;
	System.out.println("Enter your age Please?");
	int age=myScanner.nextInt();
	System.out.println("Your age is "+age);// --->your age is age
	/*
	 * Soru4) What output is produced by the following code fragment?
System.out.println("One ");
System.out.print("Two ");
System.out.println("Three ");
--->one
TwoThree
	 */
	/*5) What output is produced by the following code fragment?
System.out.print("Ready ");
System.out.println();
System.out.println("Set ");
System.out.println();
System.out.println("Go "); (edited) 
	 * Ready
	 * Set 
	 * 
	 * Go
	 */
	
	}
}