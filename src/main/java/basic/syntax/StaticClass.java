package basic.syntax;
/**
* @description
 *
 * static 修饰代码块，修饰变量，修饰类，修饰方法
 *
* @author  cjf
* @create 2020-12-14 17:06
*/
public class StaticClass {
    static class Test {

       private static int age = 25;
       static {
           System.out.println("1 - 2 - 3");
       }
       public static void sayHello(){
           System.out.println("我是sayHello");
       }
    }

    public static void main(String[] args) {
         StaticClass.Test.sayHello();
    }
}


