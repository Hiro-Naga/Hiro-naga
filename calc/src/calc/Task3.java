package calc;
import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {

		//数値入力受付
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		//各入力の確認
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		//計算結果出力
		System.out.println("合計: " + (num1 + num2 + num3));
		System.out.println("平均(3で割った時: )" + (num1 + num2 + num3) / 3);
		System.out.println("平均(3.0で割った時): " + (num1 + num2 + num3) / 3.0);

		sc.close();
	}

}
