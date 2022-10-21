import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       process();
        }
        public static int process(){
            System.out.println("totaling:1, Removal:2, Multiply:3, Division:4");
            System.out.println("Pick one Operations:");
            Scanner choice = new Scanner(System.in);
            int inChoice = choice.nextInt();
            System.out.println("Pleas Input Numbers(only two numbers)");
            Scanner inNumber1 = new Scanner(System.in);
            int number1 = inNumber1.nextInt();
            Scanner inNumber2 = new Scanner(System.in);
            int number2 = inNumber2.nextInt();
            FourOperations fourOperations = new FourOperations();
            int outCome;

            switch (inChoice) {
                case 1 :
                    System.out.println("Totaling Operations.");
                    outCome = fourOperations.sum(number1, number2);
                    System.out.println("Total:" + outCome);
                    break;

                case 2 :

                    outCome = fourOperations.removal(number1, number2);
                    System.out.println("Removing Operations.");
                    System.out.println("Total:" + outCome);
                    break;

                case 3 :

                    outCome = fourOperations.multiplaying(number1, number2);
                    System.out.println("Multiplying Operations.");
                    System.out.println("Total:" + outCome);
                    break;

                case 4 :

                    outCome = fourOperations.division(number1, number2);
                    System.out.println("Dividing Operations.");
                    System.out.println("Total:" + outCome);
                    break;
                default:
                    System.out.println("Unexpected Token");
                    break;

            }

            return process();

        }

    }
