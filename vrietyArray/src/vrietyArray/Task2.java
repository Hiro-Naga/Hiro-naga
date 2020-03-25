package vrietyArray;

import java.util.ArrayList;

public class Task2 {
	public static void main(String args[]) {
		int[] num = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		//各数値の格納
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 1) {
				odd.add(num[i]);
			}else {
				even.add(num[i]);
			}
			
		}
		
		//表示
		/* 末尾だけ表記を変えたい
		 * 改行・コンマを除く
		 * 拡張for文では場合分けできないため要素数を参照して回数を指定
		 */
		System.out.print("奇数： [");
		for(int i = 0; i < odd.size(); i++) {
			if(i == odd.size() - 1) {
				System.out.println(odd.get(i) + "]");
			}else {
				System.out.print(odd.get(i) + ", ");
			}
		}
		System.out.print("偶数： [");
		for(int i = 0; i < even.size(); i++) {
			if(i == even.size() - 1) {
				System.out.println(even.get(i) + "]");
			}else {
				System.out.print(even.get(i) + ", ");
			}
		}
	}

}
