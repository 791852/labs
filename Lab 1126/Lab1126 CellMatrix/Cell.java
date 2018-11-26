
/**
 * @author Veronica Pratt 
 * @version (11/26/18)
 */
public class Cell
{
    private int x;
    private Cell[] neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4];// North, East, South, and West only 
    }

    /**
     * ++++++++++++++  methods
     */
    public int getInt(){
        return x;
    }
    public void addNeighbors(Cell cell){
        for(int i =0; i< neighbors.length; i++){ //traverses neighbors array
            if(neighbors[i] == null){
                neighbors[i] = cell; //adds the neighboring cell that is put in from the CellMatrix class
                i = neighbors.length; 
            }
        }
    }
    public int getSum(){
        int sum =0;
        for(int i =0; i< neighbors.length; i++){ //traverses the neighbors array
            if(neighbors [i] != null){ //makes sure there is a value in neighbors to add
                sum = sum + neighbors[i].getInt();   //adds the neighboring cell values
            }
        }
        return sum; //returns the sum
    }
}
