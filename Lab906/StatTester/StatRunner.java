
/**
 * Lab 906::Find Mean Median and Mode
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatRunner{
    
    
    public static void main(){
        StatTester st = new StatTester();
        st.loadArray();
        st.printArray();
        System.out.println("sum ="+ st.getSum());
        System.out.println("sum ="+ st.getMean());
        System.out.println("sum ="+ st.getMedian());
        System.out.println("sum ="+ st.getMode());
    }
}
