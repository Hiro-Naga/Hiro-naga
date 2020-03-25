package vrietyArray;

import java.util.HashMap;

public class Task3 {
	public static void main(String args[]) {
		HashMap<String, Integer> fruits = new HashMap<>();
		fruits.put("りんご",130);
		fruits.put("みかん",120);
		fruits.put("バナナ",98);
		fruits.put("メロン",6000);


		for(HashMap.Entry<String, Integer> fruit: fruits.entrySet()) {
			System.out.println(fruit.getKey() + "：" + fruit.getValue() + "円");
		}
		
	}

}
