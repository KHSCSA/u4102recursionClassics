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
        WaveFrontFunctions.showMaze(maze);

        // it would be better to search the grid for the start
        // but we'll hard code it
        int row = 20;
        int col = 11;
        
        // ready now...
        // call the function, sending neighbors to start position
        int curWave = 1;
        WaveFrontFunctions.checkSpot(maze, row-1, col, curWave+1);
        WaveFrontFunctions.checkSpot(maze, row, col+1, curWave+1);
        WaveFrontFunctions.checkSpot(maze, row+1, col, curWave+1);
        WaveFrontFunctions.checkSpot(maze, row, col-1, curWave+1);

        WaveFrontFunctions.showMaze(maze);

        
    } // close main
    
} // close class
