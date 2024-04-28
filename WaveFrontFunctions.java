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

    } // close showMaze()


    public static int checkSpot(int[][] grid, int row, int col, int curWave){


        
        return 0;
    }



} // close class
