package array;

public class Task1 {
	public static void main(String args[]) {
		int[] array = {4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};

		//配列表示しつつ合計を計算
		int sum = 0;

		System.out.print("配列：[");
		for(int i = 0; i < array.length; i++ ) {
			if(i == array.length - 1) {
				System.out.println(array[i] + "]");
			}else {
				System.out.print(array[i] + ",");
			}
		}

		//合計計算のみ拡張for文に
		for(int ele: array) {
			sum = sum + ele;
		}

		System.out.println("合計：" + sum);
	}

}
