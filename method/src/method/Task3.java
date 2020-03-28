package method;

public class Task3 {
	public static void main(String args[]) {
		
		System.out.println("--①文字列だけの場合---");
		System.out.println(add("文字列1", "文字列2"));
		System.out.println("---②整数だけの場合---");
		System.out.println(add(3, 5));
		System.out.println("---③少数だけの場合---");
		System.out.println(add(3.5, 5.5));
	}
	
	//文字列＋文字列
	public static String add(String arg1, String arg2) {
		String ans = arg1 + arg2;
		return ans;
	}
	
	//整数＋整数
	public static int add(int num1, int num2) {
		int ans = num1 + num2;
		return ans;
	}
	
	//少数＋少数
	public static double add(double num1, double num2) {
		double ans = num1 + num2;
		return ans;
	}

}
