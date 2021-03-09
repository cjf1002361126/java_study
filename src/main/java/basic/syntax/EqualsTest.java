package basic.syntax;
/**
* @description 
* @author  cjf
* @create 2020-12-16 21:47
*/
public class EqualsTest {

    public static void main(String[] args) {
        EqualsTest equalsTest = new EqualsTest();
        EqualsTest equalsTest1 = new EqualsTest();
        System.out.println(equalsTest.equals(equalsTest1));
        System.out.println(equalsTest1 == equalsTest);
        final char[] a = new char[5];
//        a = new char[5];
        a[0] = '1';
        a[0] = 2;
    }

}
