import java.util.Scanner;

public class numgame {

    public void guessNumber() {

        Scanner s = new Scanner(System.in);

        int num = 1 + (int) (1000 * Math.random());

        int trials = 7;

        int i, guess;

        System.out.println("A number has been selected between 100 - 1000");
        System.out.println("Guess the number in " + trials + " tries!!");

        for (i = 1; i <= trials; i++) {

            System.out.println("Guess the Number: ");

            guess = s.nextInt();

            if (guess < 100 || guess > 1000) {
                System.out.println("Your Guess is Out of Range!! Thankfully I saved your Trials ^.^");
                i--;
                continue;
            }

            if (guess == num) {
                System.out.println("Bravo! You Got it Right!!!");
                break;
            } else if(i == trials){
                System.out.println("Oops! You are Out of trials:(");
                System.out.println("The Number is: " + num);
                System.out.println("Better Luck next time:)");
            }else if (num > guess) {
                System.out.println("Think bigger! The Number is Greater than " + guess);
            } else if (num < guess) {
                System.out.println("Take a look behind! The Number is smaller than " + guess);
            }      

        }

        s.close();

    }

    public static void main(String[] args) {
        numgame t = new numgame();
        t.guessNumber();
    }
}
