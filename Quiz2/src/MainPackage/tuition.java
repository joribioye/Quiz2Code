package MainPackage;

import java.util.Scanner;

public class tuition {

	public static void main(String[] args) {
		
		double total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much is the initial tuition ?");
		total = input.nextInt();
		
		int ct = 4;
		
		while(ct>0){
			
			double interest;
			
			System.out.println("How much is the interest for this term?");
			interest = input.nextDouble();
			
			double Extra = total*interest;
			total =+ Extra + total;
			
			System.out.println("Your Tuition for this year comes to : $ " + total);
			
			ct--;
			
			total = total;
		}

	}

}
