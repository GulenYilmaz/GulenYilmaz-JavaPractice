package Java.Practice.Bilkent;

public class JavaPractice001 {
	public static void main(String[] args) {
	/* 	What is the result of 19%5 when evaluated in a Java expression?*/
	
	int a=19;
	int b=5;
	int c=a%b;
		System.out.println(c);
/*What is the result of 13/4 when evaluated in a Java expression? */
	int d=13;
	int e=4;
	int f=d/e;
	System.out.println(f);
	/*If an integer variable diameter currently holds the value 5, 
	 * what is its value after the following statement is executed?
diameter = diameter * 4;
	 */
	int diameter=5;
	diameter=diameter*4;
	System.out.println(diameter);
/*What is the value of each of the following expressions?
a. 15 + 7 * 3
b. (15 + 7) * 3
c. 3 * 6 + 10 / 5 + 5
d. 27 % 5 + 7 % 3
e. 100 / 2 / 2 / 2
f. 100 / ( 2 / 2) / 2
 	
 */
	int i=15 + 7 * 3;
	int j=(15 + 7) * 3;
	int k=3 * 6 + 10 / 5 + 5;
	int m=27 % 5 + 7 % 3;
	int n=100 / 2 / 2 / 2;
	int o=100 / ( 2 / 2) / 2;
	System.out.println(i); System.out.println(j);System.out.println(k);
	System.out.println(m); System.out.println(n); System.out.println(o);
	
	
	
	
}
}
