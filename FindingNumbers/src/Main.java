import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Input Number:");
        Scanner inputNumber= new Scanner(System.in);
        int findNumber= inputNumber.nextInt();
        int[] numbers = new int[]{1,3,5,6,8,9,10};
        boolean isInclude =false;

        for (int number : numbers){
            if (number ==findNumber){
                isInclude=true;
                break;
            }
        }
        if (isInclude){
            System.out.println("Your number exist in the data.");
        }
        else {
            System.out.println("Your number doesn't exist in the data.");
        }
    }
}