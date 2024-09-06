import java.io.*;
import java.util.*;

public class Test {
	static int[][] oddDirections = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }, { 1, -1 }, { -1, -1 }, };
	static int[][] evenDirections = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }, { -1, 1 }, { 1, 1 } };

	public static void main(String[] args) throws IOException {

		for (int[] dir : oddDirections) {
			System.out.println(dir[0] + " " + dir[1]);
		}
		
		for (int i = 0 ; i<oddDirections.length ; i++) {
			System.out.println(oddDirections[i][0] + " " + oddDirections[i][1]);
		}

	}
}
