package branch;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[]) {
		
		Scanner scNumA = new Scanner(System.in);
		Scanner scNumB = new Scanner(System.in);
		Scanner scNumC = new Scanner(System.in);
		
		//数字入力
		System.out.println("numA: ");
		int numA = scNumA.nextInt();
		System.out.println("numB: ");
		int numB = scNumB.nextInt();
		System.out.println("numC: ");
		int numC = scNumC.nextInt();
		scNumA.close();
		scNumB.close();
		scNumC.close();
		
		//条件分岐
		if(numA >= numB && numA >= numC) {					//Aが一番大きい
			System.out.println("最大値: " + numA);
		}else if(numB >= numA && numB >= numC) {			//Bが一番大きい
			System.out.println("最大値: " + numB);
		}else {												//Cが一番大きい
			System.out.println("最大値: " + numC);
		}
		
	}

}
