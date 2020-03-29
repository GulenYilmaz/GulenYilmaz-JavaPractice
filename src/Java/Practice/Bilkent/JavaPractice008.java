package Java.Practice.Bilkent;
public class JavaPractice008 {
	public static void main(String[] args) {
/*Q1)  Based on the array shown in Figure 8.1, what are each of the following?
    a) height[1]                  -->61
    b) height[2] + height[5]      -->70+69
    c) height[2 + 5]              -->73
    d) the value stored at index 8-->79
    e) the fourth value           -->74
    f)height.length               -->11 */
		
/*Q2) Write an array declaration to represent the ages of all 100 children attending a summer camp.*/
        int[] age=new int[99];
		
/*Q3) Which of the following array statements are valid?
     a) int i = new int(30);        ---> unvalid
     b) double d[] = new double[30];--->valid
     c) char[] r = new char(1..30); --->unvalid
     d) int i[] = (3, 4, 3, 2);     --->unvalid
     e) float f[] = {2.3, 4.5, 6.6};--->valid
     f) char[] c = new char();      ---> unvalid   */   
		
 /*Q4) Write statements to do the following:
a. Create an array to hold 10 double values.
b. Assign the value 5.5 to the last element in the array.
c. Display the sum of the first two elements. */

	        double[] numbers= {1.02,1.12,1.22,1.32,1.42,1.52,1.62,1.72,1.82,5.5};
			double sum=numbers[0]+numbers[1];
			System.out.println(sum);
		
		
/*Q5) What is the output of the following code?
    public class Test {
    public static void main(String[] args) {*/
    int list[] = {1, 2, 3, 4, 5, 6};//--->no output
		
		
/*Q6) What output is produced by the following code fragment given the assumptions below?
if (num1 < num2)         System.out.print(" red ");
if ((num1 + 5) < num2)   System.out.print(" white ");
else                     System.out.print(" blue ");
                         System.out.println(" yellow ");
a. Assuming the value of num1 is 2 and the value of num2 is 10?-->redwhiteyellow
b. Assuming the value of num1 is 10 and the value of num2 is 2?-->blueyellow
c. Assuming the value of num1 is 2 and the value of num2 is 2? -->blueyellow     */
		
/*Q7) For each assumption, what output is produced by the following code fragment?
if (num1 >= num2) {
System.out.print(" red ");
System.out.print(" orange ");
}
if ((num1 + 5) >= num2)
System.out.print(" white ");
else
if ((num1 + 10) >= num2) {
System.out.print(" black ");
System.out.print(" blue ");
}
else
System.out.print(" yellow ");
System.out.println(" green ");
a. Assuming the value of num1 is 5 and the value of num2 is 4?--->redorangewhite
b. Assuming the value of num1 is 5 and the value of num2 is 12? --->yellowgreen*/
 
    
/*Q8) Write an expression that will print a message based on the value of the int variable named temperature.  If temperature is equal to or less than 50,  it prints “It is cool.” on one line and “Dress warmly.” on the next.  If temperature is greater than 80, it prints “It is warm.”  on one line and “Dress coolly.” on the next. If temperature is in between 50 and 80,  it prints “It is pleasant.” on one line and “Dress pleasantly.” on the next.*/
		int tem=75;
		if(tem<=50) {
			System.out.print("It is cool.");System.out.println("Dress warmly");
		}else if (tem>80) {
			System.out.print("It is warm.");System.out.println("Dress coolly");
		}else if (tem>50 && tem < 80) {
			System.out.print("It is pleasant.");System.out.println("Dress pleasantly.");
		}
		
		
}
}
