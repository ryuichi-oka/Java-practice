package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map01 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();
		
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		System.out.println(map1);

		map1.put(0, "マスカット");
		System.out.println(map1);
		
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));

		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ぶどう"));
		
		System.out.println(map1.size());

		map1.remove(0);
		map1.remove(1); //キー1の要素がないため何もしない
		
		map1.remove(3, "もも");
		map1.remove(3, "なし"); //一致する要素が無いため何もしない
		
		System.out.println(map1);
		
//		拡張for文
		Map<Integer, String> classmates = new HashMap<>();
		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");
		
//		キーのみ
		for (Integer key : classmates.keySet()) {
			System.out.println(key);
		}
		
//		値のみ
		for (String name : classmates.values()) {
			System.out.println(name);
		}
		
//		キーと値のペア
		for (Map.Entry<Integer, String> classmate : classmates.entrySet()) {
			System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん");
		}
	}
}
