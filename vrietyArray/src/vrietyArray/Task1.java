package vrietyArray;

import java.util.ArrayList;

public class Task1 {
	public static void main(String args[]) {
		
		ArrayList<String> areas = new ArrayList<>();
		areas.add("北海道");
		areas.add("東北");
		areas.add("関東");
		areas.add("中部");
		areas.add("近畿");
		areas.add("中国");
		areas.add("九州");
		
		for(String area: areas ) {
			System.out.println(area);
		}
		
	}

}
