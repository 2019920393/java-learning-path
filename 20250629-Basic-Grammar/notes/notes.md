## java中转义序列总览

| 转义序列 | Unicode 表示 | 描述                       | 示例代码                                 |
| :------- | :----------- | :------------------------- | :--------------------------------------- |
| `\t`     | `\u0009`     | 制表符 (Tab)               | `System.out.println("Hello\tWorld");`    |
| `\b`     | `\u0008`     | 退格符 (Backspace)         | `System.out.println("Hello\bWorld");`    |
| `\n`     | `\u000A`     | 换行符 (Newline)           | `System.out.println("Line1\nLine2");`    |
| `\r`     | `\u000D`     | 回车符 (Carriage Return)   | `System.out.println("Hello\rWorld");`    |
| `\f`     | `\u000C`     | 换页符 (Form Feed)         | `System.out.println("Page1\fPage2");`    |
| `\'`     | `\u0027`     | 单引号 (Single Quote)      | `char c = '\'';`                         |
| `\"`     | `\u0022`     | 双引号 (Double Quote)      | `String s = "\"Quoted Text\"";`          |
| `\\`     | `\u005C`     | 反斜杠 (Backslash)         | `String path = "C:\\Windows\\System32";` |
| `\0`     | `\u0000`     | 空字符 (Null)              | `char nullChar = '\0';`                  |
| `\uXXXX` | -            | Unicode 字符               | `char euro = '\u20AC'; // € 符号`        |
| `\u{X}`  | -            | Unicode 补充字符 (Java 7+) | `String emoji = "\uD83D\uDE00"; // 😀`    |

总结：就是在要转义的地方加上\

next()方法读取以空白字符结束的字符串(‘’ , '\t’   ,'\f', '\r', '\r')

```java
int intValue = Integer.parseInt(intString);//将字符串转换成数值
```



# 编程设计风格

### 适当的注释和注释风格

在程序的开头写一个摘要，解释一下这个程序是做什么的，其主要特点以及所用到的独特技术

### 命名习惯

1)使用小写字母命名变量和方法。如果一个名字包含多个单词，就将他们连在一起，第一个单词字母小写，而后面的都每个单词首字母都大写

2)类名的每个单词首字母大写

3)大写常量中的所有字母，两个单词间用下划线连接

### 适当的缩进与空白

二元运算法的两边应该各加一个空格，空行把代码分段 ，以便程序的阅读

