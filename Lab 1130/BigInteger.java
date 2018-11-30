import java.util.ArrayList;
import java.lang.Integer;
import java.util.*;
/**
 *Veronica Pratt
 *11/30
 */
public class BigInteger
{
    // instance variables - replace the example below with your own
    private ArrayList <Integer> nums;

    /**
     * Constructor for objects of class BigInteger
     */
    public BigInteger()
    {
        nums = new ArrayList <Integer> ();
    }

    public void setListToNumber (int n)
    {
        while( n > 0){ 
            int numberInsert = n%10; //splits off the last digit of n
            Integer numberInsertInteger = new Integer(numberInsert); //turns that digit into an Integer object so it can go into the ArrayList
            nums.add(numberInsertInteger); //adds it to arraylist
            n=n/10; //strips off last digit
        }
    }

    public void addNumberToList(int n)
    {
        String list = "0";
        for(int i = 0; i<nums.size(); i++){
            list = nums.get(i).toString(); //turns digits in arraylist into string
        }
        nums.clear();
        int addList = Integer.parseInt(list); //turns that string into an int
        int numberToAdd = n+addList;  //adds that int to the number n you want to add
         while( numberToAdd > 0){ 
            int numberInsert = numberToAdd%10; //uses the same stuff as setListToNumber to add the new number
            Integer numberInsertInteger = new Integer(numberInsert);
            nums.add(numberInsertInteger);
            numberToAdd = numberToAdd/10;
        }
    }

    public void addNumbers(ArrayList<Integer> n1, ArrayList<Integer> n2){
        String list1 = "0";
        for(int i = 0; i<n1.size(); i++){
            list1 = n1.get(i).toString(); //turns digits in first arraylist into string
        }
        String list2 = "0";
        for(int i = 0; i<n2.size(); i++){
            list2 = n2.get(i).toString(); //turns digits in 2nd arraylist into string
        }
        int addList1 = Integer.parseInt(list1); //turns both strings into ints
        int addList2 = Integer.parseInt(list2);
        int numberToAdd = addList1 +addList2; //adds those ints together
        nums.clear();
         while( numberToAdd > 0){ 
            int numberInsert = numberToAdd%10; //uses the same stuff as setListNumber to add new number to arraylist
            Integer numberInsertInteger = new Integer(numberInsert);
            nums.add(numberInsertInteger);
            numberToAdd = numberToAdd/10;
        }
    }
}
