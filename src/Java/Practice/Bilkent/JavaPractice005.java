package Java.Practice.Bilkent;

public class JavaPractice005 {

	public static void main(String[] args) {
	/*
	 * Soru1: Print even numbers from 100 to 1 by using for loop.
Soru 2: Print odd numbers from 100 to 1 by using for loop.
Soru 3: Print numbers both divisible by 3 and 7 from 1 to 100.
Soru 4: print the powers of 2 till 256(2,4,8,16,32...)
Soru 5: Print numbers divisible by 5 from 1 to 100 .	
	 */
		System.out.println("--------1----------");
		for(int i=100;i>=1;i--) {
			if(i%2==0) {
				System.out.println(i);
			}	
		}
		System.out.println("--------2----------");
		for(int i=100;i>=1;i--) {
			if(i%2!=0) {
				System.out.println(i);
			}	
		}
		System.out.println("--------3----------");
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%7==0) {
				System.out.println(i);
			}	
		}
		System.out.println("--------4----------");
		
		int taban=2;
		int sonuc=1;
		for(int us=1;us<=8;us++) {
			sonuc=sonuc*taban;
				System.out.println(sonuc);	
				
	// uslu sayilar second way System.out.println(Int)Math.pow(2,i));
				
		}
		System.out.println("--------5----------");
	
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i);
			}	
		}
		
		
		
		
		
	}

}
