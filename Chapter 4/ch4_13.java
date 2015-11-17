//Jerry Huang
//Period 4
//Project 4.13
public class ch4_13 {
	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n,3) < 12000) {
			n += 1;
		}
		n -= 1;
		System.out.println("The largest n such n cubed < 12,000 is " + n);
	}
}