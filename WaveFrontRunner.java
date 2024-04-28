// backlog:
// getData()
// showData()
// findStart()??
// checkSpot()
// call function in main (4 times)

public class WaveFrontRunner {
    public static void main(String[] args) {
        // test data is 21x21
        int[][] maze = WaveFrontFunctions.getData("WaveFrontSmall.txt", 21, 21);
        // WaveFrontFunctions.showMaze(maze);


        // it would be better to search the grid for the start
        // but we'll hard code it
        int row = 20;
        int col = 11;
        

        // ready now...
        // call the function 4 times, sending all 4 neighbors
        int curWave = 1;

        


        // WaveFrontFunctions.showMaze(maze);

        
    } // close main
    
} // close class
