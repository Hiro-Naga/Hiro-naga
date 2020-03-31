package loop;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {

		//数字入力
		Scanner scInt = new Scanner(System.in);
		System.out.print("数字を入力してください： ");

		int num = scInt.nextInt();
		scInt.close();

		//桁数計算・表示
		int i = 0;
		while(num != 0) {
			num = num / 10;
			i++;
		}
		System.out.println("桁数： " + i);

	}

}
