package evaluationsolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Question3HugeNumbers {
	
	static int [] reverseArray(int [] a) {
		int n = a.length-1;
		if(a[n]==0)n--;
		for(int i=0;i<=n/2;i++) {
			int t = a[i];
			a[i] = a[n-i];
			a[n-i]=t;
		}
		System.out.println(Arrays.toString(a)+" --");
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of digits n1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number of digits n2: ");
		int n2 = sc.nextInt();
		int[] a = new int[n1];
		int[] b = new int[n2];
		int k = 0;
		int[] s = new int[Math.max(n1, n2) + 1];
		System.out.println("Enter a: ");
		for (int i = 0; i < n1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter b: ");
		for (int i = 0; i < n2; i++) {
			b[i] = sc.nextInt();
		}
		int j = n2 - 1;
		int carry = 0;
		int i = n1 - 1;
		for (; i >= 0 && j >= 0; i--, j--) {
			int sum = a[i] + b[j] + carry;
			if (sum > 9) {
				carry = sum / 10;
				sum = sum % 10;
			} else
				carry = 0;
			s[k++] = sum;
		}
		while (i >= 0) {
			int sum = a[i--] + carry;
			if (sum > 9) {
				carry = sum / 10;
				sum = sum % 10;
			} else
				carry = 0;
			s[k++] = sum;
		}
		while (j >= 0) {
			int sum = b[j--] + carry;
			if (sum > 9) {
				carry = sum / 10;
				sum = sum % 10;
			} else
				carry = 0;
			s[k++] = sum;
		}
		if(carry!=0)s[k++]=carry;
		s=reverseArray(s);
		
		System.out.println(Arrays.toString(s));
	}

}
