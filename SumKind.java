import java.util.*;

public class SumKind {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int numSets = in.nextInt();
		for(int i = 1; i<= numSets; ++i) {
			int dataNum = in.nextInt();
			int n = in.nextInt();
			int posSum = n*(n+1)/2;
			int oddSum = n*n;
			int evenSum = n*(n+1);
			System.out.println(dataNum+" "+posSum +" "+ oddSum+" "+ evenSum);
		}
	}
	/*public static int posSum(int n) {
		if(n ==1) 
			return 1;
		int sum =0;
		for(int i =1; i <= n; ++i) {
			sum += i;
		}
		return sum;
	}
	public static int oddSum(int n) {
		if(n ==1) 
			return 1;
		int sum =0;
		for(int i =1; i <=2*n; i+=2) {
			sum += i;
		}
		return sum;
	}
	public static int evenSum(int n) {
		if(n ==1) 
			return 2;
		int sum =0;
		for(int i=2; i <=2*n+1; i+=2) {
			sum += i;
		}
		return sum;
	}*/
}

// sum = N*(N+1)/2
//oddSum = N^2
//evenSum= N(N+1)