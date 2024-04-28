// Java1711.java
// Recursive solution to the black/white "Grid" problem


import java.util.*;


public class Grid{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter row value  ===>>  ");
		int row = input.nextInt();
		System.out.print("Enter col value  ===>>  ");
		int col = input.nextInt();
		boolean grid[][] = new boolean[10][10];

		create(grid);
		display(grid);
		alter(grid,row,col);
		display(grid);
	} // close main

	public static void create(boolean grid[][]){
		Random rand = new Random(12345); // seed for same grid each run
		for (int r = 0; r < 10; r++){
			for (int c = 0; c < 10; c++){
				int rndInt = rand.nextInt(2);
				if (rndInt == 1)
					grid[r][c] = true;
				else
					grid[r][c] = false;
			}
		}
	}

	public static void display(boolean grid[][]){
		System.out.println();
		for (int r = 0; r < 10; r++){
			for (int c = 0; c < 10; c++){
				if (grid[r][c])
					System.out.print("X  ");
				else
					System.out.print("O  ");
			}
			System.out.println();
		}
	}

	public static void alter(boolean grid[][], int r, int c){
		if ((r >= 0) && (r <= 9) && (c >= 0) && (c <= 9)){
			if (grid[r][c]){
				grid[r][c] = false;
				alter(grid,r-1,c);
				alter(grid,r+1,c);
				alter(grid,r,c-1);
				alter(grid,r,c+1);
			}
		}
	}

}

