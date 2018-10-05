
/**
 * 
 * @VeronicaPratt 
 * @906
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    private int[] nums;
    // Constructor
    public StatTester(){

    }
    //  Methods
    public void loadArray(){
        nums = new int [100];
        for (int i=0; i<nums.length; i++){
            nums[i] = (int) Math.random()*10 +1;
        }
    }
    public void printArray(){
        for (int i=0; i<nums.length; i++){
            if( i%10 ==0){
                System.out.println(nums);
            }
            System.out.println(nums[i]);
        }
    }
    public int getSum(){
        int sum = 0; 
        for (int i=0; i<nums.length; i++){
            sum = sum + nums [i];
        }
        return sum;
    }
    public double getMean(){
        double mean = 0;
        mean = getSum()/nums.length;
        return mean;
    }
    public double getMedian(){
        double median = 0; 
        Arrays.sort (nums); 
            median = nums[50] + nums [51];
            median = median/2;
        return median;
    }
    public int getMode(){
        int mode = 0;
        
        return mode;
    }
}
