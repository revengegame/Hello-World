package gugudan;

import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		
		
		int j;
		int gob;
		System.out.println("원하는 구구단 : ");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();

		
			System.out.println();
			System.out.println(i+"단");
			for (j = 1; j <=9; j++) {
				gob=i*j;
				System.out.print(i+"*"+j+"="+gob+" ");
			}
					    
		}
       
	}


