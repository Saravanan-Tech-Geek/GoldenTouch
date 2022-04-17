package aspire;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("please ener a number....:");
		int num = scan.nextInt();
		for(int i=2;i<=num/2;i++) { // loop decides how many iteration you need to iterate...
			if(num % i == 0 ) {
				System.out.println("this number is not an prime number");
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("The enter number"+"\t"+num+"\t"+"is a prime number");
		}
		
	}

}
