package array;

public class Task2 {
	public static void main(String args[]) {

		int[] array = new int[7];

		//配列に値を代入
		for(int i = 0; i < array.length; i++) {
			array[i] = 7 - i;
		}

		//配列の値をそのまま表示
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
		}
		//逆順表示
		for(int i = array.length -1; i > -1; i--) {		//i = 0まで回したい
			if(i == 0) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
		}
	}

}
