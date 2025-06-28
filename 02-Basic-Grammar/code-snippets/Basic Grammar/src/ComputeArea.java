import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        //通过scanner类来读取输入  Scanner对象有许多方法
        //nextByte()  读取一个byte类型的整数
        //nextShort() 读取一个short类型的整数
        //nextInt() 读取一个int类型的整数
        //nextLong() 读取一个long类型的整数
        //nextFloat  nextDouble
        //next() 读取一个字符串，该字符在一个空白符号之前结束
        //nextLine() 读取一行文本（即 以按下回车键为结束标志）
        Scanner scanner = new Scanner(System.in);  //要填写System.in
        /*String next =  scanner.next();
        System.out.println(next);
        System.out.println("-------------");
        String nextLine = scanner.nextLine();
        System.out.println(nextLine);*/
        /*
        * 1. 用户输入一个单词（比如"hello"）然后按回车。
         2. `scanner.next()`读取"hello"，但换行符（回车）仍然留在输入缓冲区中。
         3. 然后调用`scanner.nextLine()`，它读取输入缓冲区中直到下一个换行符的内容，也就是那个被剩下的换行符，因此它立即返回一个空字符串。
         解决方案：
         方法1：在`next()`和`nextLine()`之间加一个额外的`nextLine()`来消耗掉那个换行符。
         方法2：全部使用`nextLine()`来读取输入，然后对需要单词的地方进行拆分。*/
        //输入圆的半径 来计算圆的面积。
        radius = scanner.nextDouble();
        area = radius * radius * 3.14;
        System.out.println(area);
    }
}
