import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase amout: ");
        double purchaseAmout = input.nextDouble();

        double tax = purchaseAmout * 0.06;
        //通过乘以100取整再除以100.0 来保留2位小数。
        System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
    }
}
