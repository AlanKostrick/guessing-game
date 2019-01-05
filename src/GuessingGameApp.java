import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);

		int secretNumber = (int) (Math.random() * 10 + 1);
		int numTries = 0;

		System.out.println("What is your name?");
		String name = input.nextLine();

		System.out.println("Welcome " + name + " to my guessing game!");

		System.out.println("Guess a number between 1 and 10");
		System.out.println("Press 0 for a hint");
		System.out.println(("Press -1 to quit"));
		int numberGuessed = input.nextInt();

		while (numberGuessed != -1) {
			while (numberGuessed == 0) {
				Thread.sleep(2000);
				System.out.println("Hmmm let me do some calculating...");
				if (secretNumber % 2 == 0) {
					Thread.sleep(2000);
					System.out.println("Secret number is even.");

				} else {
					Thread.sleep(2000);
					System.out.println("Secret number is odd.");
				}
				Thread.sleep(2000);
				System.out.println("Guess a number between 1 and 10");
				numberGuessed = input.nextInt();
			}

			if (secretNumber == numberGuessed) {
				System.out.println("You guessed it, congrats!");
				System.exit(0);
			}

			if (numberGuessed > secretNumber) {
				System.out.println("Too high");
				numTries = numTries + 1; // increment
			} else {
				System.out.println("Too low");
				numTries++; // increment
			}

			if (numTries == 3) {
				System.out.println("You have exceeded your 3 attempts");
				System.exit(0);
			}

			System.out.println("Guess a number between 1 and 10");
			numberGuessed = input.nextInt();
		} // end of while loop

		System.out.println("Thanks for playing");
		input.close();
	}

}
