package standardClass;
import java.util.Scanner;

public class Task4 {
	public static void main(String args[]) {
		String base = "ABCDGOPQRSYZ";

		//文字の入力
		System.out.println("探したい文字: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();				//scをStringに変換
		sc.close();

		//判別
		if(base.indexOf(str) >= 0) {
			System.out.println(base + "は" + str + "を含む");
		}else {
			System.out.println(base + "は" + str + "を含まない");
		}
	}

}
