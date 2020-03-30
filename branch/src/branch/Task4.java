package branch;

import java.util.Scanner;

public class Task4 {
	public static void main(String args[]) {

		//数値入力
		Scanner scNum = new Scanner(System.in);

		System.out.println("numA: ");
		int numA = scNum.nextInt();
		System.out.println("numB: ");
		int numB = scNum.nextInt();
		scNum.close();

		//条件分岐
		if(numA > 0 && numB > 0) {						//どちらも正の数である場合
			if(numA % numB == 0){
				System.out.println("numBはnumAの約数です");
			}else {
				System.out.println("numBはnumAの約数ではありません");
			}
		}else {												//負の数が入力された場合
			System.out.println("正の数を入力してください");
		}

	}

}
