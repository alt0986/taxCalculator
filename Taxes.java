package assignment1;

import java.util.Scanner;
public class Taxes {
	public static void main(String[] args) {
	//2020 Tax Calculator

	//Create income variables
		double monthlySalary;
		double annualSalary;
		double annualTax = 0;
		double annualIncome;
		
	//Create input scanner
		Scanner inputDevice = new Scanner(System.in);
		
	//Ask for and accept user monthly income
		System.out.print("Plese enter your monthly income >> ");
		monthlySalary = inputDevice.nextInt();
		
	//Multiply by 12 to find annual income
	annualSalary = monthlySalary * 12;
		
		//If over $518,400 calculate 37% tax
		if (annualSalary>518400) {
			annualTax = (annualSalary - 518400) * 0.37 + 156307;
		}
		
		//If $207,351 to $518,400 calculate 35% tax
		else if (annualSalary>=207351) 
		 {
			annualTax = (annualSalary - 207350) * 0.35 + 47439.5;
		}
		
		//If $163,301 to $207,350 calculate 32% tax
		else if (annualSalary>=163301) {
			annualTax = (annualSalary - 163300) * 0.32 + 33343.5;
		}
		
		//If $85,526 to $163,300 calculate 24% tax
		else if (annualSalary>=85526) {
			annualTax = (annualSalary - 85525) * 0.24 + 14605.5;
		}
		
		//If $40,126 to $85,525 calculate 22% tax
		else if (annualSalary>=40126) {
			annualTax =  (annualSalary - 40125) * 0.22 + 4617.5;
		}
		
		//If $9,876 to $40,125 calculate 12% tax
		else if (annualSalary>=9876) {
			annualTax = (annualSalary - 9875) * 0.12 + 987.5;
		}
		
		//If <= $9875 calculate 10% tax
		else {
			annualTax = annualSalary*0.1;
		
		}
		

	//Display annual salary, tax, and gross income
	annualIncome = annualSalary - annualTax;
	System.out.println("Annual salary: "+annualSalary);
	System.out.println("Annual tax: "+annualTax);
	System.out.println("Annual gross income: "+annualIncome);
}
}