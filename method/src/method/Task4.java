package method;

public class Task4 {
	public static void main(String args[]) {
		String[] args1 = {"a", "b", "c"};
		String[] args2 = {"a", null, "c"};
		System.out.println("---配列にnullがない場合---");
		System.out.println(nullCheck(args1));
		System.out.println("---配列にnullがある場合---");
		System.out.println(nullCheck(args2));
	}

	//nullCheck
	public static boolean nullCheck(String[] args) {
		boolean ans = false;		//直接returnでtrueを返せなかったため変数設定
		for(String arg: args) {
			if(arg == null) {
				ans = true;
				break;
			}else {
				ans = false;
			}
		}
		return ans;
	}

}
