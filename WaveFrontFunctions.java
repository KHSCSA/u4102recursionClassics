import java.io.File;
import java.util.Scanner;

public class WaveFrontFunctions {
    // walls and blocked spots are 999
    // open = 0
    // start = 888
    // finish = 1
    public static int[][] getData(String filename, int height, int width){
        int[][] data = new int[height][width];
        try {
            Scanner input = new Scanner(new File(filename));
            int rowNumber = 0;
            while(input.hasNextLine()){
                String line = input.nextLine();
                
                // convert row into array
                int[] row = new int[width];
                int colNumber = 0;
                for(int i=0; i<width; i++){
                    String tempItem = line.substring(i, i+1);
                    int item = 0;
                    if(tempItem.equals("#")) item = 999;
                    else if(tempItem.equals("E")) item = 1;
                    else if(tempItem.equals("S")) item = 888;
                    else item = 0;
                    row[colNumber] = item;
                    colNumber++;
                }              
                // add that row to the data
                // System.out.println("debugging: " + row);
                data[rowNumber] = row;
                rowNumber++;
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing " + filename);
        }
        return data;
    } // close getData()


    public static void showMaze(int[][] maze){
        System.out.println("\n");
        for(int[] row: maze){
            for(int item: row){
                if(item == 888) System.out.print("S\t");
                else if (item==0) System.out.print(" \t");
                else if (item==999) System.out.print("#\t");
                else System.out.print(item + "\t");
            }
            System.out.println();
        }
    } // close showMaze()


    public static int checkSpot(int[][] grid, int row, int col, int curWave){
        if(row>=0 && row<grid.length-1 && col>=0 && col<grid[0].length-1){
            if(grid[row][col]==999 || grid[row][col]==888) 
                return 0;
            // check if open or we have a better number
            if(grid[row][col]==0 || grid[row][col]>curWave){
                grid[row][col] = curWave;
                checkSpot(grid, row-1, col, curWave+1);
                checkSpot(grid, row, col+1, curWave+1);
                checkSpot(grid, row+1, col, curWave+1);
                checkSpot(grid, row, col-1, curWave+1);
            }
        }
        return 0;
    }



} // close class
