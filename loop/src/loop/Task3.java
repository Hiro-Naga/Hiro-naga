package loop;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		
		//数字入力
		Scanner scDouble = new Scanner(System.in);
		System.out.print("数字を入力してください： ");
		
		double num = scDouble.nextDouble();
		scDouble.close();
		
		//桁数計算・表示
		int i = 0;
		
		if(num > 0) {						//num>0の時
			while(num > 1) {
				num = num / 10;
				i++;
			}	
		}else {
			while(num < -1) {				//num<= 0の時
				num = num / 10;
				i++;
			}
		}
		
		System.out.println("桁数： " + i);
		
	}

}
