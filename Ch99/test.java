package Ch99;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력 : ");
		int n=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(i<n)
			{
				
				for(j=0;j<=(n-2)-i;j++) {
					System.out.print(" ");
				}
			
				for(k=0;k<=2*i;k++) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		

	}

}
