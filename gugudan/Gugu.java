package gugudan;

import java.util.Scanner;

import javax.xml.ws.AsyncHandler;

public class Gugu {

	public static void main(String[] args) {
		
		
		int j;
		int gob;
		System.out.println("2~9까지 원하는 구구단 : ");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();

		
			System.out.println();
			System.out.println(i+"단");
			
			if(i<2) {
				System.out.println("값을 잘못 입력");
			}else if(i>9){
				System.out.println("값을 잘못 입력");

			}else {
			for (j = 1; j <=9; j++) {
				gob=i*j;
				System.out.print(i+"*"+j+"="+gob+" ");
			}
			}    
		}
       
	}


