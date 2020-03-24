package loop;

import java.util.Scanner;

public class Task4 {
	public static void main(String args[]) {

		//数値入力
		Scanner scInt = new Scanner(System.in);

		System.out.print("正の整数を入力してください： ");
		int num = scInt.nextInt();
		scInt.close();

		//約数表示
		System.out.print(num + "の約数： ");
		for(int i = 1; i < num; i++) {				// (i = 0)から始めると(num / 0)となりエラー
			if(num % i == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println(num);
	}

}
