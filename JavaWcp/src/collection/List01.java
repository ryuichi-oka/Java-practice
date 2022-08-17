package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		list1.add("りんご");
		list1.add("みかん");
		list1.add(1, "バナナ");
		
		list1.remove("バナナ");
		list1.remove(0);
		
		System.out.println(list1);
		
//		拡張for文
		List<String> prefectures = new ArrayList<>();
		prefectures.add("北海道");
		prefectures.add("青森県");
		prefectures.add("秋田県");
		
		for (String prefecture : prefectures) {
			System.out.println(prefecture);
		}
	}

}
