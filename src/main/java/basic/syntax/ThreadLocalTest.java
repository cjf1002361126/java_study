package basic.syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* @description 
* @author  cjf
* @create 2020-12-23 18:20
*/
public class ThreadLocalTest extends Thread{

    private ThreadLocal<Integer> age = ThreadLocal.withInitial(() -> new Integer(0));

    private ThreadLocal<String> name = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "cjf";
        }
    };

    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {

        }
    });
    private List<Integer> list = new ArrayList(5);

    @Override
    public void run() {
       try {
           age.set(age.get()+1);
           System.out.println(Thread.currentThread().getName() + " " + age.get());
       }  catch (Exception e) {

       } finally {
           // 这涉及到value是强引用，而
           age.remove();
       }
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("xxx","yyy","zzz"));
        name.add("dddd");
        name.forEach(System.out::println);
        System.out.println(1 > 2);
//        for (int i = 0; i < 1000; i++) {
//            ThreadLocalTest threadLocalTest = new ThreadLocalTest();
//            threadLocalTest.setName("线程" + i);
//            threadLocalTest.start();
//        }
    }
}
