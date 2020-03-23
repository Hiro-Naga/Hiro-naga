package branch;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		
		//数値入力受付
		Scanner scInt = new Scanner(System.in);

		int num = scInt.nextInt();
		scInt.close();
		
		//条件分岐
		if(num > 0) {
			System.out.println("入力された数字は正の数です。");
		}else if(num == 0){
			System.out.println("入力された数字は0です。");
		}else {
			System.out.println("入力された数字は負の数です。");
		}
		
	}

}
