
/**
 * 
 * CellMatrix
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */
    
    private Cell[][] cells;

    /**
     * Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
       cells = new Cell[a][b];
    }

    /**
     * methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
       for(int r = 0; r < cells.length; r++){
           System.out.println(" ");
           for(int c = 0; c< cells[r].length; c++){
               System.out.print(cells[r][c].getInt() +" ");
          }
        }  
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
       for(int r = 0; r < cells.length; r++){
           for(int c = 0; c< cells[r].length; c++){
               cells[r][c] = new Cell((int)(Math.random()*10)+1);
            }
        }
    }
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
       for(int r = 0; r < cells.length; r++){
           for(int c = 0; c< cells[r].length; c++){ 
               Cell cell = cells[r][c];
               if(r >0){ //checks if there is a cell above and adds the cell value to neighbors
                   cell.addNeighbors(cells [r-1][c]);
               }
               if(c>0){ //checks if there is a cell to the left
                   cell.addNeighbors(cells [r][c-1]);
               }
               if(r< cells.length -1){ //checks if there is a cell below
                   cell.addNeighbors(cells [r+1][c]);
               }
               if(c< cells.length -1){ //checks if there is a cell to the right
                   cell.addNeighbors(cells [r][c+1]);
                }
            }
        }
    }
    //  Find the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int greatest = 0;
           for(int r = 0; r < cells.length; r++){
           for(int c = 0; c< cells[r].length; c++){ //traverses the 2D array
               Cell cell = cells[r][c];
               if(cell.getSum() >= greatest){ //checks the sum for each cell against the greatest value
                   greatest = cell.getSum(); //replaces the greatest value with the new sum if it's bigger
               }
            }
        }
        return greatest;
    }
    
    
}
