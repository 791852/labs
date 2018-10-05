
/**
 *CalcRunner
 * 
 * @veronicaPratt
 * @822
 */
public class CalcRunner
{
   public static void main () {
    SimpleCalc object1 = new SimpleCalc(40, 5);
    System.out.println(object1.add(40,5));
    System.out.println(object1.subtract(40,5));
    System.out.println(object1.multiply(40,5));
    System.out.println(object1.divide(40,5));
    System.out.println(object1.modulodivide(40,5));
}
}

