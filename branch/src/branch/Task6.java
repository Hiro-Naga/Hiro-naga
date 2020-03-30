package branch;

import java.util.Scanner;

public class Task6 {
	public static void main(String args[]) {
		Scanner scNum = new Scanner(System.in);
		
		//数値入力
		System.out.println("1から5の数字を入力してください");
		int num = scNum.nextInt();
		scNum.close();
		
		//条件分岐
		String number;
		switch(num) {
		
		case 1:
			number = "Ⅰ";
			break;
		case 2:
			number = "Ⅱ";
			break;
		case 3:
			number = "Ⅲ";
			break;
		case 4:
			number = "Ⅳ";
			break;
		case 5:
			number = "Ⅴ";
			break;
		default:
			number = "unknown";
			break;
		}
		
		System.out.println(num + "->" + number);
	}

}
