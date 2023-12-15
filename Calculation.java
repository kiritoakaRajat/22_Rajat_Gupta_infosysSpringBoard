public class Calculation{
   public static void main(String[] args){
System.out.println("explicit type conversion");
      double d = 234.04;
      long l = (long)d;   //explicit type casting
      int i = (int)l;     // explicit type casting
      System.out.println("double value :"+d);
      System.out.println("long value :"+l);
      System.out.println("int value :"+i);
	 System.out.println("Implicit type conversion");

      int y = 300;
      long m = y;       //no explicit type casting
      float f = m;     //no explicit type casting
      System.out.println("int value :"+y);
      System.out.println("long value :"+m);
      System.out.println("float value :"+f);
   }
}