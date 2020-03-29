package Java.Practice.Bilkent;
public class JavaPractice002 {
public static void main(String[] args) {
/*Soru1)What value is contained in the integer variable result 
after the following sequence of statements is executed?
result = 27; result = result + 3; result = result / 7; result = result * 2; */
		int result = 27;
		result = result + 3;
		result = result / 7;
		result = result * 2; System.out.println(result);
	/*Soru2) What value is contained in the integer variable result after the following sequence of statements is executed?
int base; int result; base = 5; result = base + 3; base = 7; */
		int base;
		int result1;
		base = 5;
		result1 = base + 3;
		base = 7;
		System.out.println(result1);
/* If an integer variable weight currently holds the value 100,  what is its value after the following statement is executed? Explain.weight -= 17; */
	int weight=100;
	weight=17;System.out.println(weight);
	/*Soru4) Identify each of the following conversions as either a  widening conversion or a narrowing conversion.
a. int to long ---->W  b. int to byte----->N  c. byte to short---->W  d. byte to char---->N  e. short to double */
	/*Soru5) Assuming result is a float variable and value is an  int variable, what type of variable will value be after  *  
	 * the following assignment statement is executed? Explain. result = value;*/
float result2=1452f;System.out.println(result2);//---->1452.0


	}
}
