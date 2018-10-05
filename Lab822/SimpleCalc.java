
/**
 * class SimpleCalc for Lab 822
 * 
 * @VeronicaPratt
 * @822
 */
public class SimpleCalc
{
    // instance variables
    private int n1;
    private int n2;

    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc(int x, int y)
    {
        // initialise instance variables
        n1 = x;
        n2 = y;
    }

    /**
     * SimpleCalc Method
     */
    public double add(int x, int y) {
        return x + y;
    }
    public double subtract(int x, int y) {
        return x - y;
    }
    public double multiply(int x, int y){
        return x*y;
    }
    public double divide (int x, int y){
        if(y!=0) return x/y;
        
        return 0;
     }
    public int modulodivide (int x, int y) {
        return x%y;
    }
}
