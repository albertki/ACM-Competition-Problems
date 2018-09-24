import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class PurpleRain {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
		while(in.hasNext()) {
			String section = in.nextLine();
			char[] arr = section.toCharArray();
			for(char c : arr)
				System.out.print(c + " ");
				System.out.println();
			int[] num = leastPR(arr);
			System.out.println(num[0] + " " + num[1]);
		}
	}

	public static int[] leastPR(char[] arr) {
		int biggestI = 0;
		int biggestJ = 0;
		int bestSoFar = arr[0];
		int bestCurrent = arr[0];
		for(int i=1; i<arr.length; ++i) {
			bestCurrent += arr[i]=='B' ? 1 : -1;
			for(int j=i+1; j<arr.length; ++j) {
				sum += arr[j]=='B' ? 1 : -1;
				if(bestCurrent >= bestSoFar)
					bestSoFar = bestCurrent;
					biggestI = i;
					biggestJ = j;
			}
		}
		int[] num = {biggestI, biggestJ};
		return num;

		int bestCurrent = max(a[i] + bestCurrent, 0);
		int bestSoFar = max(bestSoFar, bestCurrent);

	}
}