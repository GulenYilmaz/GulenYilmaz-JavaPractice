package Java.Practice.Bilkent;

import java.util.Scanner;

public class JavaPractice006 {
public static void main(String[] args) {
	/*Given the following declarations,
	 *  what is the value of each of the listed boolean expressions?

	int value1 = 5, value2 = 10;
    boolean done = true;
a. value1 <= value2        --->true     
b. (value1 + 5) >= value2  --->true
c. value1 < value2 / 2     --->false
d. value2 != value1        --->true
e. !(value1 == value2)     --->true
f. (value1 < value2) || done --->true
g. (value1 > value2) || done --->true
h. (value1 < value2) && !done--->true
i. done || !done             --->true
j. ((value1 > value2) || done) && (!done || (value2 > value1))--->true*/
	
	
	
/* What output is produced by the following code fragment given 
 * the assumptions below?
if (num1 < num2)
System.out.print(" red ");
if ((num1 + 5) < num2)
System.out.print(" white ");
else
System.out.print(" blue ");
System.out.println(" yellow ");
a. Assuming the value of num1 is 2 and the value of num2 is 10?--->  redwhite
b. Assuming the value of num1 is 10 and the value of num2 is 2?--->  blueyellow
c. Assuming the value of num1 is 2 and the value of num2 is 2? --->  blueyellow*/
	
	/*3) For each assumption, what output is produced by the following code fragment?
if (num1 >= num2){
System.out.print(" red ");
System.out.print(" orange ");}
if ((num1 + 5) >= num2)
System.out.print(" white ");
else
if ((num1 + 10) >= num2){
System.out.print(" black ");
System.out.print(" blue ");}
else
System.out.print(" yellow ");
System.out.println(" green ");
a. Assuming the value of num1 is 5 and the value of num2 is 4?--> red  orange  white  black  blue 
b. Assuming the value of num1 is 5 and the value of num2 is 12?-->  black  blue 
c. Assuming the value of num1 is 5 and the value of num2 is 27?--> yellow  green  */
	
	/*4)   Write an expression that will print a message based on the value of  the int variable named temperature.
	 * If temperature is equal to or less than 50, it prints “It is cool.” on one line and “Dress warmly.” 
	 * on the next. If temperature is greater than 80, it prints “It is warm.” on one line and “Dress coolly.” on the next. 
	 *  If temperature is in between 50 and 80,  it prints “It is pleasant.” on one line and “Dress pleasantly.” on the next.*/
	Scanner scan=new Scanner(System.in);
	System.out.println("What is the temperature today?");
	int tem=scan.nextInt();
	
	if(tem<=50) {
		System.out.print("It is cool.");System.out.println("Dress warmly.");
	}else if(tem>50 && tem<80) {
		System.out.print("It is pleasant.");System.out.println("Dress pleasantly.");
	}else if(tem>=80) {
		System.out.print("It is warm.");System.out.println("Dress coolly.");
	}
	
	 // What output is produced by the following code fragment?
        int low = 0, high = 10;
        while (low < high){
               System.out.println(low);
               low++;
               }//----->0 1 2 3 4 5 6 7 8 9
}
}
