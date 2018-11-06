
/**
 *Veronica Pratt
 *11/06/18
 */
public class GridTester
{
    public static void loadArray(){
        int [][] gridFun = new int[10][10]; //this creates a 10 by 10 2D array
        for(int r = 0; r<gridFun.length; r++){ //these for loops go through all the boxes in the aray
            for(int c = 0; c<gridFun[r].length; c++){
                gridFun [r][c] = (int)(Math.random()*100)+1; //and in all these boxes there is a random int from 1 to 100
            }
        }
        System.out.println(sumAll(gridFun)); //this puts the grid I created into the methods
        System.out.println(findGreatest(gridFun));
        System.out.println(numberOfGreatest(gridFun));
        System.out.println(findAvg(gridFun));
    }
    //all of these methods take in an int 2D array and do stuff with it
    public static int sumAll(int [][] grid){
        int sum = 0;
        for(int r = 0; r<grid.length; r++){ //this adds up all the different values at the different points in the array
            for(int c = 0; c<grid[r].length; c++){
                sum = sum + grid[r][c];
            }
        }
        return sum;
    }
    public static int findGreatest(int [][] grid){
        int greatest = 0;
        for(int r = 0; r<grid.length; r++){ //this finds out which value of the array is the greatest
            for(int c = 0; c<grid[r].length; c++){
                if(grid[r][c]>= greatest){
                    greatest = grid [r][c];
                }
            }
        }
        return greatest;
    }
    public static int numberOfGreatest(int [] [] grid){
        int count = 0;
        int greatest = 0;
        for(int r = 0; r<grid.length; r++){ //this finds the greatest value in the array
            for(int c = 0; c<grid[r].length; c++){
                if(grid[r][c]>= greatest){
                    greatest = grid [r][c];
                }
            }
        }
        for(int r = 0; r<grid.length; r++){ //this then counts out how many indeces of the grid have the greatest value
            for(int c = 0; c<grid[r].length; c++){
                if(greatest == grid[r][c]){
                    count = count +1;
                }
            }
        }
        return count;
    }
    public static double findAvg(int [] [] grid){
        double average = 0.0;
        int sum = 0;
        for(int r = 0; r<grid.length; r++){ //this finds the sum of the array 
            for(int c = 0; c<grid[r].length; c++){
                sum = sum + grid[r][c];
            }
        }
        average = sum/100; //then, because the grid in this example has 100 boxes, I divided it by 100 as that is simpler
        return average;
    }
}
