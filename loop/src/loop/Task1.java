package loop;

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {

		//数値入力
		Scanner scInt = new Scanner(System.in);
		System.out.print("数字を入力してください： ");

		int num = scInt.nextInt();
		scInt.close();

		System.out.print("1～" + num + "までの合計: ");

		//計算
		int sum = 0;
		do {
			sum = sum + num;
			num--;
		}while(num > 0);

		System.out.println(sum);
	}

}
