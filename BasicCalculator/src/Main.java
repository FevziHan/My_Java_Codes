import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("totaling:1, Removal:2, Multiply:3, Division:4");
        System.out.println("Pick one Operations:");
        Scanner choice = new Scanner(System.in);
        int inChoice = choice.nextInt();

        if (inChoice ==1){
            System.out.println("Totaling Operations.");
            System.out.println("Pleas Input Numbers(only two numbers)");
            Scanner inNumber1 = new Scanner(System.in);
            int number1 = inNumber1.nextInt();
            Scanner inNumber2 = new Scanner(System.in);
            int number2 = inNumber2.nextInt();
            FourOperations fourOperations =new FourOperations();
             int outCome = fourOperations.sum(number1,number2);
            System.out.println("Total:"+outCome);
        } else if (inChoice==2) {
            System.out.println("Removing Operations.");
            System.out.println("Pleas Input Numbers(only two numbers)");
            Scanner inNumber1 = new Scanner(System.in);
            int number1 = inNumber1.nextInt();
            Scanner inNumber2 = new Scanner(System.in);
            int number2 = inNumber2.nextInt();
            FourOperations fourOperations =new FourOperations();
            int outCome = fourOperations.removal(number1,number2);
            System.out.println("Total:"+outCome);
        }else if (inChoice==3) {
            System.out.println("Multiplying Operations.");
            System.out.println("Pleas Input Numbers(only two numbers)");
            Scanner inNumber1 = new Scanner(System.in);
            int number1 = inNumber1.nextInt();
            Scanner inNumber2 = new Scanner(System.in);
            int number2 = inNumber2.nextInt();
            FourOperations fourOperations =new FourOperations();
            int outCome = fourOperations.multiplaying(number1,number2);
            System.out.println("Total:"+outCome);
        }else if (inChoice==4) {
            System.out.println("Dividing Operations.");
            System.out.println("Pleas Input Numbers(only two numbers)");
            Scanner inNumber1 = new Scanner(System.in);
            int number1 = inNumber1.nextInt();
            Scanner inNumber2 = new Scanner(System.in);
            int number2 = inNumber2.nextInt();
            FourOperations fourOperations =new FourOperations();
            int outCome = fourOperations.division(number1,number2);
            System.out.println("Total:"+outCome);
        }


    }
}