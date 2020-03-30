package branch;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		
		//数値入力受付
		Scanner scInt = new Scanner(System.in);
		
		System.out.println("数字を入力してください");
		int num = scInt.nextInt();
		scInt.close();
		
		//条件分岐
		if(num >= 10) {
			System.out.println("値: " + num);
		}else {
			System.out.println("値: 0" + num);
		}
				
	}

}
