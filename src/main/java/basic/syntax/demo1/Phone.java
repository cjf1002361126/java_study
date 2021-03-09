package basic.syntax.demo1;

public class Phone extends Device {

    private int age;

    static {
        System.out.println("static - Phone");
    }

    public Phone(){
        System.out.println("constructor - Phone");
    }

    public Phone(int age) {
        this.age = age;
        System.out.println("constructor - age - Phone");
    }

    {
        System.out.println("code - Phone");
    }
}