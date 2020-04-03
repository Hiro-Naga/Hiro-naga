package standardClass;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task6 {
	public static void main(String args[]) {
		Date now = new Date();							//Date型の現在時点データを取得
		SimpleDateFormat sdf = new SimpleDateFormat("y年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("y年MM月dd日HH時mm分");
		
		System.out.println(sdf.format(now));
		System.out.println(sdf2.format(now));
	}

}
