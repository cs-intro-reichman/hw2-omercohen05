// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args) {
		int maxSeed = Integer.parseInt(args[0]);
		String mode = args[1];

		for (int seed = 1; seed <= maxSeed; seed++) {
			int num = seed;
			int steps = 1;

			if (mode.equals("v")) {
				System.out.print(num + " ");
			}

			while (num != 1 || (seed == 1 && num == 1 && steps == 1)) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = num * 3 + 1;
				}

				if (mode.equals("v")) {
					System.out.print(num + " ");
				}

				steps++;
			}

			if (mode.equals("v")) {
				System.out.println("(" + steps + ")");
			}
		}

		System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
	}
}
