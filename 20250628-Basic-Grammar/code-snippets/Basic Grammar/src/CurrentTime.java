//开发一个显示当前GMT(格林威治时间)的程序 格式为： 小时：分钟：秒
//System类中的方法currentTimeMillis返回从GMT 1970年1月1日00:00:00开始到当前时刻的毫秒数
public class CurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours % 24;
        /* 由于第一个操作数是字符串（"Current time is: "），所以后面的`+`都变成了字符串连接。
 因此，`"Current time is: " + currentHours` 会先将`currentHours`转换为字符串然后拼接。
 接着，这个结果（字符串）再和`8`连接，也就是在字符串后面追加字符"8"，而不是进行加法运算。
 如果你希望进行算术运算（例如将当前小时加上8小时，可能用于时区转换），那么你需要用括号将算术运算括起来，以确保先进行算术运算，然后再进行字符串连接。
         */
        System.out.println("Current time is: " + currentHours + 8   + ":" + currentMinutes + ":" + currentSeconds + "GMT");
    }
}
