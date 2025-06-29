import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        //将磅转换为千克
        poundToKilogram();
        //财务应用程序 计算小费
        computeTip();
        //求一个整数的各位数的和
        sumDigits();
    }
    public static void poundToKilogram(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pound = input.nextDouble();
        System.out.println(pound + " pounds is " + pound * 0.45359237 + " kilograms");
    }
    //财务应用程序 计算小费

    public static void computeTip(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double billAmount = input.nextDouble();
        System.out.println("The gratuity is " + billAmount * 15.0 / 100 + " and total is " + (billAmount + billAmount * 15.0 / 100));
    }

    //求一个整数的各位数的和

    public static void sumDigits(){
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = number % 10 + number / 10 % 10 + number / 100;
        System.out.println("The sum of the digits is " + sum);
    }

}
