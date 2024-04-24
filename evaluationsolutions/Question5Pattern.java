package evaluationsolutions;

import java.util.Scanner;

public class Question5Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println();
			if(i==0 || i==n-1) {
				for(int j=0;j<n;j++)
					System.out.print(1+" ");
			}
			else {
				if(i==1 || i==n-2) {
					for(int j=0;j<n;j++) {
						if(j>1 && j<n-2) {
							System.out.print(0+" ");
						}
						else System.out.print(1+" ");
					}
				}
				else {
					for(int j=0;j<n;j++) {
						System.out.print(1+" ");
					}
				}
			}
		}

	}

}
