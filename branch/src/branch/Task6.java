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
		String NUM;
		switch(num) {
		
		case 1:
			NUM = "Ⅰ";
			break;
		case 2:
			NUM = "Ⅱ";
			break;
		case 3:
			NUM = "Ⅲ";
			break;
		case 4:
			NUM = "Ⅳ";
			break;
		case 5:
			NUM = "Ⅴ";
			break;
		default:
			NUM = "unknown";
			break;
		}
		
		System.out.println(num + "->" + NUM);
	}

}
