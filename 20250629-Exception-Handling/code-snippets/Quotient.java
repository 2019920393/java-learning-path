import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers:");

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            if (number2 == 0)
                throw new ArithmeticException("Divisor cannot be zero");
            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        }catch (ArithmeticException ex){
            System.out.println("Exception: an integer cannot be divided by zero");
        }
        System.out.println("Execution continues...");
    }
}
