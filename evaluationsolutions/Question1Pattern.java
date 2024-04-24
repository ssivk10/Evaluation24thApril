package evaluationsolutions;

import java.util.Scanner;

public class Question1Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		char ch = sc.nextLine().charAt(0);
		char c = 'A';
		int n = ch-'A'+1;
		System.out.println("n: "+n);
		int i=0;
		for(i=0;i<n;i++) {
			System.out.println();
			for(int j=0;j<2*n;j++) {
				if(j==n-i-1 || j == n+i-1)
					System.out.print(c);
				else System.out.print(" ");
			}
			c++;
		}
		c-=2;
		for(;i<2*n-1;i++) {
			
			System.out.println();
			System.out.print(" ");
			for(int j=1;j<2*n;j++) {
				
				if(j==i-n+1 || j==2*n-i+1)
					System.out.print(c);
				else System.out.print(" ");
			}
			
			c--;
		}
	}

}
