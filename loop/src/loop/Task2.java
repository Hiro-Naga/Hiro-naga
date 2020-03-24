package loop;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		
		//数字入力
		Scanner scInt = new Scanner(System.in);
		
		System.out.print("数字を入力してください： ");
		int num = scInt.nextInt();
		scInt.close();
		
		//計算表示
		int sum = 0;		//合計
		int i = 0;			//回数
		
		while(i < num) {
			i++;
			sum = sum + i;
			if(i == num) {
				break;
			}
			System.out.print(i + " + ");
		}
		System.out.println(i + " = " + sum);
	}

}
