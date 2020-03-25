package array;

public class Task2 {
	public static void main(String args[]) {

		int[] array = new int[7];

		//大→小
		for(int i = 0; i < array.length; i++) {
			array[i] = 7 - i;
			if(i == array.length - 1) {					//インデックスは0からカウント開始、入れたいのは1～のため調節
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
		}

		//小→大
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			if(i == array.length - 1) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
		}

	}

}
