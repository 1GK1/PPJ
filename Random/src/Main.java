import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int numberOfAttempts = 200;
		int numberOfBalls = 100;
		Random random = new Random();

		boolean[] arrayOfResults = new boolean[numberOfBalls];

		for (int i = 0; i < arrayOfResults.length; i++) {
			arrayOfResults[i] = false;
		}

		for (int i = 0; i < numberOfAttempts; i++) {
			int index = random.nextInt(100);
			arrayOfResults[index] = true;
		}

		int counterFalse = 0;
		int counterTrue = 0;
		for (int i = 0; i < arrayOfResults.length; i++) {
			if (arrayOfResults[i]) {
				counterTrue++;
			} else {
				counterFalse++;
			}
		}

		System.out.println("True: " + counterTrue);
		System.out.println("False: " + counterFalse);
		System.out.println("False percentage: " + counterFalse / 100.0);
	}
}
