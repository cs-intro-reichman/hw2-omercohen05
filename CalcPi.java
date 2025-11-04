// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		// Replace this comment with your code
		int amount = Integer.parseInt(args[0]);

		double pieApproximated = 0.0;

		double quarterPie = 0.0;

		int base = 1;
		for (int i = 0; i < amount; i++) {
			if (i % 2 == 0) {
				quarterPie += (1.0 / base);
			} else {
				quarterPie -= (1.0 / base);
			}
			base += 2;
		}

		pieApproximated = quarterPie * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pieApproximated);

	}
}
