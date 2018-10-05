
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
private boolean stuActive;
private double stuGPA;
private String stuName;
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        studNumber = 0;
        stuActive = false;
        stuGPA = 0.0;
        stuName = "Bob";
    }

    /**
     * Student Methods
     */
    public void setStudNumber(int sn) 
    {
        studNumber = sn;
    }
    public void setstuActive (boolean sn)
    {
        stuActive = sn;
    }
    public void setstuGPA (double sn)
    {
        stuGPA = sn;
    }
    public void setstuName (String sn)
    {
        stuName = sn;
    }
    public int getStudNumber () {
        return studNumber;
    }
    public boolean getstuActive () {
        return stuActive;
    }
    public double getstuGPA () {
        return stuGPA;
    }
    public String getstuName () {
        return stuName;
    }
}
