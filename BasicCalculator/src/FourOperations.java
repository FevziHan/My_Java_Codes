public class FourOperations {
    public int sum (int number1,int number2){
        return number1+number2;
    }
    public int removal (int number1,int number2){
        return number1-number2;
    }
    public int multiplaying (int number1,int number2){
        return number1*number2;
    }
    public int division (int number1,int number2){
        if(number2<=0){
            System.out.println("In division 0 cannot be used");
        }
        return number1/number2;
    }
}
