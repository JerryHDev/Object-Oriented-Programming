import javax.swing.JOptionPane;

//Jerry Huang
//Period 4
//Project 2.27

public class ch2_27 {
	public static void main(String[] args) {
		//This program gets necessary input from a user and prints a payroll statement
		
		//Get inputs
		String employeeNameString = JOptionPane.showInputDialog(null, "Enter employee's name:", "Enter Name", JOptionPane.QUESTION_MESSAGE);
		
		String hoursAWeekString = JOptionPane.showInputDialog(null, "Enter number of hours worked in a week:", "Hours Worked", JOptionPane.QUESTION_MESSAGE);
		int hoursAWeek = Integer.parseInt(hoursAWeekString);
		
		String hourlyPayString = JOptionPane.showInputDialog(null, "Enter hourly pay rate (e.g., 6.75):", "Hourly Rate", JOptionPane.QUESTION_MESSAGE);
		double hourlyPay = Double.parseDouble(hourlyPayString);
		
		String federalTaxString = JOptionPane.showInputDialog(null, "Enter federal tax withholding rate (in percentage):", "Federal Tax", JOptionPane.QUESTION_MESSAGE);
		double federalTax = (Double.parseDouble(federalTaxString))/100.0;
		
		String stateTaxString = JOptionPane.showInputDialog(null, "Enter state tax withholding rate (in percentage):", "State Tax", JOptionPane.QUESTION_MESSAGE);
		double stateTax = (Double.parseDouble(stateTaxString))/100.0;
		
		//Calculates
		double grossPay = hourlyPay * hoursAWeek;
		double federalWithholding = federalTax * grossPay;
		double stateWithholding = ((int)((stateTax * grossPay)*100))/100.0;
		double totalDeduction = ((int)((federalWithholding + stateWithholding)*100))/100.0;
		double netPay = ((int)((grossPay - totalDeduction)*100))/100.0;
		
		//Print payroll statement
		System.out.println("Employee Name: " + employeeNameString);
		System.out.println("Hours Worked: " + hoursAWeek);
		System.out.println("Pay Rate: $" + hourlyPay);
		System.out.println("Gross pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding (" + federalTaxString + "%): $" + federalWithholding);
		System.out.println("  State Withholding (" + stateTaxString + "%): $" + stateWithholding);
		System.out.println("  Total Deduction: $" + totalDeduction);
		System.out.println("Net Pay: $" + netPay);
		
	}
}