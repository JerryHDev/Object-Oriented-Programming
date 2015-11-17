
public class ch1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creates variable for starting population
		int startPopulation = 312032486;
		System.out.println("This program displays the population for each of the next five years.");
		System.out.println("Starting population is " + startPopulation);
				
		//population after first year
		double firstYear = startPopulation + ((365 * 24 * 60 * 60)/7.0) - ((365 * 24 * 60 * 60)/13.0) + ((365 * 24 * 60 * 60)/45.0);
		System.out.println("The population after the first year is " + (int)(firstYear));
		
		//population after second year
		double secondYear = firstYear + ((365 * 24 * 60 * 60)/7.0) - ((365 * 24 * 60 * 60)/13.0) + ((365 * 24 * 60 * 60)/45.0);
		System.out.println("The population after the second year is " + (int)(secondYear));
				
		//population after third year
		double thirdYear = secondYear + ((365 * 24 * 60 * 60)/7.0) - ((365 * 24 * 60 * 60)/13.0) + ((365 * 24 * 60 * 60)/45.0);
		System.out.println("The population after the third year is " + (int)(thirdYear));
				
		//population after fourth year
		double fourthYear = thirdYear + ((365 * 24 * 60 * 60)/7.0) - ((365 * 24 * 60 * 60)/13.0) + ((365 * 24 * 60 * 60)/45.0);
		System.out.println("The population after the fourth year is " + (int)(fourthYear));
				
		//population after fifth year
		double fifthYear = fourthYear + ((365 * 24 * 60 * 60)/7.0) - ((365 * 24 * 60 * 60)/13.0) + ((365 * 24 * 60 * 60)/45.0);
		System.out.println("The population after the fifth year is " + (int)(fifthYear));
	}

}