package Java.Practice.Bilkent;
public class JavaPractice004 {
public static void main(String[] args) {
		/*Soru1) What output is produced by the following statement? What is produced if the inner parentheses are removed? (pg 91 questions 2.6)
System.out.println("It is good to be " + (5 + 5));
*/
	//--->it is good to be 10
int a=5;int b=5;
System.out.println("it is goog to be"+(a+b));
System.out.println("it is goog to be"+a+b);
/*Soru 2) What value is contained in the integer variable sum after the following statements are executed?
sum = 15;
sum = sum % 3;--->0
sum += 500;---->500
sum *= 2; --->1000       */
 
/*Soru3) What output is produced by the following statement?Explain.
System.out.println("50 plus 25 is " + 50 + 25);
 * --->50 plus 25 is 5025           */

/*Soru4) What value is contained in the integer variable count after the following statements are executed?
count = 4;
count = count % 4;--->0
count = count * 10;--->0
count = count + 10;--->10           */

/*Soru5) What value is contained in the floating point variable area after the following statements are executed?
area = 3.14;
area = area / 10;---------->0.314
area = area * 0.5;----->0.157                */
float x=3.14f;
float y=x/10;
 y*=0.5;
System.out.println(y);
}
}
