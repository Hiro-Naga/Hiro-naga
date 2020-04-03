package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task7 {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();							//クラスの作成
		SimpleDateFormat sdf = new SimpleDateFormat("y年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("y年MM月dd日(E)");	//曜日のフォーマット：E

		System.out.println("現在日時: " + sdf.format(cal.getTime()));

		//一週間追加(add使用)
		cal.add(Calendar.WEEK_OF_MONTH, 1);
		System.out.println("一週間後: " + sdf.format(cal.getTime()));

		//一年後に設定(set使用)
		cal.set(2021, 4, 4);
		System.out.println("一年後: " + sdf2.format(cal.getTime()));
	}

}
