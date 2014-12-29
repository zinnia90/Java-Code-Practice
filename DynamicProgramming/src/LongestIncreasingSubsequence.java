import java.util.Scanner;


public class LongestIncreasingSubsequence {

	public static int[] inputArr = new int[10];
	public static int[] LIS = new int[10];
	public int UN = -18282;
	
	public LongestIncreasingSubsequence() {
		for (int i = 0; i< 10; i++) {
			LIS[i] = UN;
		}
	}
	
	public int findLeastSubsequence(int j) {
		if (LIS[j] != UN) {
			return LIS[j];
		}
		if (j == 0) {
			LIS[j] = 1;
			System.out.println(LIS[j]);
			return LIS[j];
		}
		int maxLength = 1;
		for (int x = 0; x < j; x++) {
			int temp = findLeastSubsequence(x);
			if ( temp >= maxLength &&
					inputArr[x] < inputArr[j]) {
				maxLength = temp+1;
			}
		}
		LIS[j] = maxLength;
		System.out.println(LIS[j]);
		return LIS[j];
	}

	public static void main(String[] args) {
		LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the number");
			obj.inputArr[i] = input.nextInt();
		}
		obj.findLeastSubsequence(9);
		int max = 0;
		for (int i = 0; i < 10; i++) {
			if (LIS[i] > max) {
				max = LIS[i];
			} 
		}
		System.out.println("The number of elements in the least "
				+ "increasing subsequence is:" + max);
	}

}
