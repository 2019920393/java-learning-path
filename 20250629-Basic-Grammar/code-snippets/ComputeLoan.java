import java.util.Scanner;

//计算贷款支付额
//程序要求输入利率，年数，以及贷款总额，并要求显示月付金额和总偿还金额   月付金额 = 贷款总额 * 月利率 * / [1-1/((1 + 月利率)的年数次方-12)]
public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter yearly interest rate, for example 8.25: ");
        double annualInterestRate = input.nextDouble();

        // 错误点修复：应该是 annualInterestRate / 1200 而不是再次使用 input.nextDouble()
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount, for example 120000.95: ");
        double loanAmount = input.nextDouble();

        // 计算公式优化：Math.pow(1 + monthlyInterestRate, numberOfYears * 12) 分母需要减1
        double monthlyPayment = loanAmount * monthlyInterestRate / 
            (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        // 四舍五入优化：使用 0.5 而不是仅截断
        double roundedMonthlyPayment = (int)(monthlyPayment * 100 + 0.5) / 100.0;
        double roundedTotalPayment = (int)(monthlyPayment * numberOfYears * 12 * 100 + 0.5) / 100.0;

        System.out.println("The monthly payment is " + roundedMonthlyPayment);
        System.out.println("The total payment is " + roundedTotalPayment);
    }
}
