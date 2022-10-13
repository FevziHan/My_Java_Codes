import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input number:");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();
        int i;
        boolean isPrime = true;
        if (number < 2) {
            System.out.println("Invalid Number");
        }
            else {

                for (i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                    }
                }
            }
            if (isPrime) {
                System.out.println("This is prime number.");
            }
            else
                System.out.println("This isn't prime number");

    }

}