package standardClass;

public class Task1 {
	public static void main(String args[]) {
		String str = " tech-compass ";
		System.out.println("変更前: " + str);
		
		//周囲の半角スペースを除く
		String str2 = str.trim();
		
		//大文字にして表示
		System.out.println("変更後: " + str2.toUpperCase());
	}

}
