package calc;
import java.util.Scanner;

public class Task5 {
	public static void main(String args[]) {
		
		//変数設定
		String str = "ノートPCの値段: ";
		int num = 89800;
		char cha = '円';
		
		System.out.println(str + num + cha);
		
		//文字列の入力
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String str1 = sc1.nextLine();
		String str2 = sc2.nextLine();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 + str2);
		
		sc1.close();
		sc2.close();
	}

}
