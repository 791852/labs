
/**
 * @VeronicaPratt
 * @816
 */
public class Student extends Runner
{
    /**
     * Instance variables of class Student
     */
    private int studNumber;
    private String stuName;
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        studNumber = 0;
        stuName = "Bill";
    }

    /**
     * Student Methods
     */
    public void setStudNumber(int sn) 
    {
        studNumber = sn;
    }

    public int getStudNumber () {
        return studNumber;
    }

    public void setStuName(String sn)
    {
        stuName = sn;
    }

    public String getStuName(){
        return stuName; 
    }

}
