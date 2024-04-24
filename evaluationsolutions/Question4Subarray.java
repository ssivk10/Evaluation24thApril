package evaluationsolutions;

import java.util.Scanner;

public class Question4Subarray {

	/*
	 * static int [] recur(int [] a, int start) { int p=start; //if(a[p]==) }
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		int[] a = new int[n];
		int start = 0;
		int end = 0;
		int sum = 0;
		int cur = 0;
		int max = 0;
		/*
		 * for(int i=start;i<n;i++) { if(a[i]<start)start++; }
		 */
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		while (start < n) {
			sum=0;
			System.out.println("hello?");
			cur = start;
			while (cur < n) {
				if (a[cur] > 0) {
					sum += a[cur];

				}
				else {break;}
				cur++;
			}
			end = cur - 1;
			if (sum > max)
				max = sum;
			start++;
		}

		if (n == 1) {
			if (end < start)
				System.out.println("No valid subarray.");
		} else {
			System.out.println(max + " is max sum.");
			for (int i = start; i <= end; i++) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
