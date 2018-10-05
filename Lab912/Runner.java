
/**
 * Class Student Runner
 * 
 * @author (VeronicaPratt)
 * @version (816)
 */
public class Runner
{
   public static void main () {
      String [] names = {"Jack", "John", "Jill", "Jerry", "Joe"};
      int [] stuNums = {7, 5, 6, 5, 6};
      Student [] students = new Student [5]; 
      for(int i =0; i<students.length; i++){
         Student si = new Student ();
         si.setStudNumber(stuNums[i]); 
         si.setStuName(names [i]);
         students [i] = si; 
         System.out.print(students[i].getStuName());
         System.out.println(students[i].getStudNumber());
        }
    }
}
