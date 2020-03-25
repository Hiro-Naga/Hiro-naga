package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {
	public static void main(String args[]) {
		
		//変数設定
		ArrayList<Integer> odds = new ArrayList<>();
		ArrayList<Integer> evens = new ArrayList<>();
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		
		//奇数偶数の振り分け
		int[] num = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				evens.add(num[i]);
			}else {
				odds.add(num[i]);
			}
		}
		
		//HashMap生成・表示
		map.put("奇数", odds);
		map.put("偶数",evens);
		
		System.out.println(map);
	}

}
