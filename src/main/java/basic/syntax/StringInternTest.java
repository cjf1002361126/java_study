package basic.syntax;
/**
* @description 
* @author  cjf
* @create 2021-03-09 19:25
*/
public class StringInternTest {

    public static void main(String[] args) {
        String str = "abc";
        char[] array = {'a','b','c'};
        String str2 = new String(array);
        str2 = str2.intern();

        String str3 =  new String("abc");
        str3 = str3.intern();
        System.out.println(str == str2);
        System.out.println(str == str3);

//      String str5 = "abdefg";
        String str4 = new StringBuilder().append("abd").append("efg").toString();
//        System.out.println(str4.intern() == str5);
//        System.out.println(str4.intern() == str4);
//        System.out.println(str4.intern() == str4);

        String str6 = "abdefg";
        System.out.println(str4.intern() == str6);

        String str5 = new String("abdefg");
        System.out.println(str4.intern() == str5);

        // 使用这种方式，引用直接是常量池的引用，跟new有区别。
        String s = "abdeqqqq";
        String s1 = "abdeqqqq";

        System.out.println("s 是否等于 s1：" + (s == s1));

        String[] a = new String[4];
        int length = a.length;

    }

}
