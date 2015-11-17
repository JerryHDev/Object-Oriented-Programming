//Jerry Huang
//Period 4
//Project 5.9

/**This program converts between feet and meters*/
public class ch5_9 {
	
	public static void main(String[] args) {
		//prints header
		System.out.printf("%-8s %10s       |   %10s %12s\n", "Feet", "Meters", "Meters", "Feet");
		System.out.println("-----------------------------------------------------");
		
		//prints table
		for (double feet = 1, meters = 20; feet <= 10.0 && meters <= 65.0; feet++, meters += 5) {
			double meter = footToMeter(feet);
			double foot = meterToFoot(meters);
			System.out.printf("%4.1f %14.3f       |   %10.1f %12.3f\n", feet, meter, meters, foot);
		}
	}
	
	
	/**Convert from feet to meters*/
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}
	
	
	/**Convert from meters to feet*/
	public static double meterToFoot(double meter) {
		double feet = meter / 0.305;
		return feet;
	}
}