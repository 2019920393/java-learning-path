## 异常分类

| 类型                  | 特点         | 处理要求           | 典型代表                                        |
| :-------------------- | :----------- | :----------------- | :---------------------------------------------- |
| **Error**             | JVM 严重错误 | 不可恢复，不需捕获 | OutOfMemoryError, StackOverflowError            |
| **RuntimeException**  | 运行时异常   | 非强制处理         | NullPointerException, IndexOutOfBoundsException |
| **Checked Exception** | 检查型异常   | 必须处理           | IOException, SQLException                       |

![deepseek_mermaid_20250629_74b2c6](C:\Users\17697\Downloads\deepseek_mermaid_20250629_74b2c6.png)

## 注意

如果方法没有在父类声明异常，那么就不能在子类声明异常

声明异常的关键字是**throws**，抛出异常的关键字是**throw**

在catch块中异常被指定的顺序是非常重要的。如果父类出现在子类之前就会导致编译错误。

```java
//错误 因为RuntimeException 是Exception的一个子类应该在前面捕获
try{
	···
}
catch(Exception e)
{

}
catch(RuntimeException e)
{

}
```

Java强迫必须处理必检异常。

```java
void p1(){
	try{
		p2();
	}
	catch(IOException e) 
	{
	
	}
}
void p1() throws IOException {
	p2();
}
```

# 异常总结

1.异常处理使一个方法能够抛出一个异常给它的调用者。

2.Java异常是扩展自java.lang.Throwable的类的实例。Java提供大量预定义的异常类，例如,Error、Exception、RuntimeException、ClassNotFoundException、NullPointerException和 ArithmeticException。

也可以通过扩展 Exception 类来定义自己的异常类。

3.异常发生在一个方法的执行过程中。RuntimeException和Error都是免检异常，所有其他的异常都是必检的。

4.当声明一个方法时，如果这个方法可能抛出一个必检异常，则必须进行声明，从而告诉编译器可能会出现什么错误。
5.声明异常的关键字是throws，而抛出异常的关键字是throw。如果调用声明了必检异常的方法，必须将该方法调用放在try语句中。在方法执行过程中出现异常时，catch块会捕获并处理异常。

6.如果一个异常没有被当前方法捕获，则该异常被传给调用者。这个过程不断重复直到异常被捕获或者传递给 main 方法。

7.可以从一个共同的父类派生出各种不同的异常类。如果一个catch块捕获到父类的异常对象，它也能捕捉这个父类的子类的所有异常对象。

8.在catch块中，异常的指定顺序是非常重要的。如果在指定一个类的异常对象之前，指定了这个异常类的父类的异常对象，就会导致一个编译错误。

9.当方法中发生异常时，如果异常没有被捕获，方法将会立刻退出。如果想在方法退出前执行一些任务，可以在方法中捕获这个异常，然后再重新抛给它的调用者。

10.任何情况下都会执行finally块中的代码，不管try块中是否出现了异常，或者出现异常后是否捕获了该异常。

11.异常处理将错误处理代码从正常的程序设计任务中分离出来，这样，就会使得程序更易于阅读和修改。

12,不应该使用异常处理代替简单的测试。应该尽可能地使用if语句来进行简单的测试，将异常处理留作处理那些无法用if语句处理的场景。
