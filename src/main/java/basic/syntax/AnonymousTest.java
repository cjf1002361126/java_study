package basic.syntax;

interface Product2
{
   public double getPrice();
   public String getName();
}
public class AnonymousTest
{
   public void test(Product2 p)
   {
      System.out.println("购买了一个" + p.getName()
         + "，花掉了" + p.getPrice());
   }
   public static void main(String[] args)
   {
      AnonymousTest ta = new AnonymousTest();
      // 调用test()方法时，需要传入一个Product参数，
      // 此处传入其匿名内部类的实例
      ta.test(new Product2()
      {
         @Override
         public double getPrice()
         {
            return 567.8;
         }

         @Override
         public String getName()
         {
            return "AGP显卡";
         }
      });
   }
}