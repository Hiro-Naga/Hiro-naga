package standardClass;

public class Task5 {
	public static void main(String args[]) {
		String str = "cat_mouse_mouse_cat_cat";
		String[] words = str.split("_");				//単語単語で分離
		
		//回数計測
		int i = 0;										//回数確認用。i > jならばwords[0]の方が多い
		int j = 0;
		for(String word: words) {
			if(word.equals(words[0])) {
				i++;
			}else if(word.equals(words[1])){
				j++;
			}
		}

		
		if(i > j) {
			System.out.println(words[0] + "の方が多い");
		}else if(i == j) {
			System.out.println("同数");
		}else {
			System.out.println(words[1] + "の方が多い");
		}
		
	}

}
