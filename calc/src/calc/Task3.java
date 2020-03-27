package calc;
import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {

		//数値入力受付
		/*System.out.println("数字を3つ入力してください");	分かりにくかったので調整中1行入れました。問題があれば訂正します。*/
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		/*Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		int num3 = sc3.nextInt();

		*修正-複数定義している部分の消去、およびsc1→scに変数名変更
		*/
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
		//sc2.close();	scを一つしか用意していないことで残り二つを消去
		//sc3.close();
	}

}
