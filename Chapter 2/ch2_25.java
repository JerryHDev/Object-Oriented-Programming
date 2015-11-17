import java.util.Scanner;

//Jerry Huang
//Period 4
//Project 2.25

public class ch2_25 {
	public static void main(String[] args) {
		//This program gets necessary input from a user and prints a payroll statement
		
		//Get inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String employeeName = input.next();
		
		System.out.println("Enter number of hours worked in a week: ");
		int hoursAWeek = input.nextInt();
		
		System.out.println("Enter hourly pay rate (e.g., 6.75): ");
		double hourlyPay = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate (in percentage): ");
		double federalTax = input.nextDouble()/100.0;
		
		System.out.println("Enter state tax withholding rate (in percentage): ");
		double stateTax = input.nextDouble()/100.0;
		
		//Calculates
		double grossPay = hourlyPay * hoursAWeek;
		double federalWithholding = federalTax * grossPay;
		double stateWithholding = ((int)((stateTax * grossPay)*100))/100.0;
		double totalDeduction = ((int)((federalWithholding + stateWithholding)*100))/100.0;
		double netPay = ((int)((grossPay - totalDeduction)*100))/100.0;
		
		//Print payroll statement
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Hours Worked: " + hoursAWeek);
		System.out.println("Pay Rate: $" + hourlyPay);
		System.out.println("Gross pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding: $" + federalWithholding);
		System.out.println("  State Withholding: $" + stateWithholding);
		System.out.println("  Total Deduction: $" + totalDeduction);
		System.out.println("Net Pay: $" + netPay);
	}
}