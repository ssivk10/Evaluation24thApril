package evaluationsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Question2DescFreq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Enter array");
		int[] a = new int[n];
		List<Integer> l = new ArrayList<>();
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
		}
		int[] b = new int[n];
		int i = 0;
		int k = 0;
		while (i < n) {
			if (!Arrays.toString(b).contains(a[i] + "")) {
				int x = hm.get(a[i]);
				while (x >= 0) {
					b[k++] = a[i];
					x--;
				}
			}
			i++;
		}
		System.out.println(Arrays.toString(b)+" ");

	}

}
