package calc;

public class Task2 {
	public static void main(String args[]) {
		//変数設定
		int a = 10;
		int b = 12;
		int c = 13;
		
		int sum = a + b + c;
		int ave = sum / 3;
		double aver = sum / 3.0;
		
		System.out.println("合計：" + sum);
		System.out.println("平均(3で割った時)：" + ave);
		System.out.println("平均(3.0で割った時)：" + aver);
		
	}

}
