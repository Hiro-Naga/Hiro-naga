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
		/* まずarray[1]に関して最大か判別
		 * 次にarray[2]、array[3]、…と判別
		 *
		 * array[1]に関してarray[2]～array[6]に関して判別したいため
		 * ループ内部にもう一つループを設定した。
		 */

		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] >= array[j]) {					//最大値計算
					if(array[i] > max) {
						max = array[i];
					}else{
						if(array[j] > max) {
							max = array[j];
						}
					}
				}else {										//最小値計算
					if(array[i] <= min) {
						min = array[i];
					}else {
						if(array[i] < min) {
							min = array[j];
						}
					}
				}
			}
		}
		System.out.println("最大値： " + max);
		System.out.println("最小値： " + min);
	}

}
