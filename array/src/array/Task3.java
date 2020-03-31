package array;

import java.util.Random;

public class Task3 {
	public static void main(String args[]) {

		//変数設定・乱数生成
		Random rand = new Random();
		int[] array = new int[6];							//実行結果例が6つの配列だったので6で設定しました。
		int max = 0;
		int min = 10;										//最大・最小用に設定。0～9の範囲で乱数生成しているため。

		System.out.print("[");
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			if(i == array.length - 1) {
				System.out.println(array[i] + "]");
			}else {
				System.out.print(array[i] + ",");
			}
		}

		//最大最小計算・表示

		for(int ele: array) {
			if(ele > max) {
				max = ele;
			}
			if(ele < min) {
				min = ele;
			}
		}

		System.out.println("最大値： " + max);
		System.out.println("最小値： " + min);
	}

}
