package standardClass;

public class Task3 {
	public static void main(String args[]) {
		String str = "ABCDEFG";
		
		// "文字列: "も配列に含めると判断しました。
		// 文字列: ABC…の表示
		str = "文字列: " + str;
		String[] str2 = str.split("");
		System.out.println(str);
		
		//配列の逆順表示
		for(int i = str2.length - 1; i > -1; i--) {		// 末尾から先頭(i = 0)まで繰り返す
			System.out.print(str2[i]);
		}
		
	}

}
