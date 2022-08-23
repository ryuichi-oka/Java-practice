package part1.chapter1_3;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		Hero h1 = new Hero();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数 =" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";
		list.remove(h1); // Heroクラスでequals()をオーバーライドしていないため、正しく等価判定されておらず削除されていない
		System.out.println("要素数 =" + list.size());
	}
}
