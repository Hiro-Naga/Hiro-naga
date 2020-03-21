package variable;

public class Task3 {
	public static void main(String args[]) {
		
		int intNum = 219;
		double doubleNum = 364.2;
		long longNum = 123456L;
		
		System.out.println("変換前");					//各数字の表記確認表示
		System.out.println(intNum);	
		System.out.println(doubleNum);
		System.out.println(longNum);
		
		long intNum_long = intNum;					//int→long変換
		float doubleNum_float = (float)doubleNum;	//double→floatへ変換、容量が小さいものへの変換
		double longNum_double = longNum;				//long→double変換
		
		System.out.println("変換後");					//変換後の各数字の表記確認表示
		System.out.println(intNum_long);	
		System.out.println(doubleNum_float);
		System.out.println(longNum_double);
	}

}
