package Java.Practice.Bilkent;

import java.util.Scanner;

public class JavaPractice007 {

	public static void main(String[] args) {
/* Q1)  // Count off all the numbers  2, 3, 4, ..., 19, 20, but only print out the numbers that are even.*/
		for(int  i=2; i<=20; i++) {
		//	System.out.println(i);
		if(i%2==0) {
			System.out.println(i);}}

		/*Q2) Write a for loop that will print out all the multiples of 3 from 3 to 36, that is: 3 6 9 12 15 18 21 24 27 30 33 36.*/	
System.out.println("--------------");		
		 for(int k=3; k<=36;k++) {
			 if(k%3==0) {
				 System.out.println(k); }  }

/*Q3) Ask a user to enter an integer, read the user's response, and tell the user whether the number entered is even or odd.*/
System.out.println("--------------");		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter an integer number");
		int num=scan.nextInt();
		if (num%2==0) {     System.out.println(num+" is even number ");}
		else {              System.out.println(num+" is odd number ");}
						
System.out.println("--------------");
/*Q4) Show the exact output that would be produced by the following main() routine:
public static void main(String[] args) {*/
    int N;
    N = 1;
    while (N <= 32) {
       N = 2 * N;
       System.out.println(N); }

System.out.println("--------------");		
//Q5) Given the following declarations, what is the value of each of the listed boolean expressions?
int value1 = 5, value2 = 10;
boolean done = true;
//a. value1 <= value2      ----->true
//b. (value1 + 5) >= value2----->true
//c. value1 < value2 / 2   ----->false
//d. value2 != value1      ----->true
//e. !(value1 == value2)   ----->true
//f. (value1 < value2) || done  ----->true
//g. (value1 > value2) || done  ----->true
//h. (value1 < value2) && !done ----->false
//i. done || !done              ----->true
//j. ((value1 > value2) || done) && (!done || (value2 > value1))----->false
 	
}
}
