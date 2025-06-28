public class Main {
    public static void main(String[] args) {

        Main.output();
        Main.showpicture();
    }
    //1.1 显示三条消息
    public static void output() {
        System.out.println("Welcome to java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }
    //1.2 显示图案
    public static void showpicture(){
        System.out.println("     J");
        System.out.println("     J");
        System.out.println("J    J");
        System.out.println(" J  J ");

        //计算表达式
        System.out.println((9.5*4.5 - 2.5*3)/(45.5-3.5));
        //数列求和
        int sum = 0 ;
        for (int i = 0 ; i < 10 ; i ++ ) {
            sum += i;
        }
        System.out.println(sum);
        //近似求π
        double pai = 0;
        int j = 1;
        for(double i = 1.0 ; i < 90000000; i += 2) {
            pai = pai + j * 1/i;
            j = -j;
        }
        pai = pai * 4;
        System.out.println(pai);
    }


}