// This program solves the "Tower of Hanoi" puzzle.

import java.util.*;

public class Hanoi{
	static int numTimes = 0;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("\nHow many disks are in the tower  ===>>  ");
		int disks = input.nextInt();
		solveHanoi('A','B','C',disks);
		System.out.println("\n\nEXECUTION TERMINATED " + numTimes);
	} // close main


	public static void solveHanoi(char s, char t, char d, int n){
		// s - source peg
		// t - temporary peg
		// d - destination peg
		// n - number of disks
		numTimes++;
		if (n != 0){
			solveHanoi(s, d, t, n-1); // move n-1 disks from A to B
			System.out.println("Move Disk " + n + " From Peg " + s + " to Peg " + d);
			solveHanoi(t, s, d, n-1); // move n-1 disks from B to C
		}
	}

}
