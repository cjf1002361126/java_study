package basic.syntax.demo1;
/**
* @description 先类加载后（类的static模块），父类的初始化块代码，父构造器 再 子类的初始化块代码，子构造器
* @author  cjf
* @create 2020-12-23 19:47
*/
public class Device {

    static {
        System.out.println("static - Device");
    }

    {
        System.out.println("code - Device");
    }

    public  Device(){
        System.out.println("constructor - Device");
    }

    public static void main(String[] args) {
        Device device = new Phone(1);
        /**
         * 错误猜测
         * 先Device - static -》 Phone - static -》
         * code - Device -》 code -Phone -》
         * constructor - Device -》 constructor - Phone
         */
        /**
         * 正确结果：先类加载后，父类的初始化块代码，父构造器 再 子类的初始化块代码，子构造器
         * static - Device
         * static - Phone
         * code - Device
         * constructor - Device
         * code - Phone
         * constructor - Phone
         */
    }
}
