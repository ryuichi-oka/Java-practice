package part1.chapter1_4;

import java.util.HashSet;
import java.util.Set;

//	HashSetの利用でremove()できない例
public class Main01 {
	public static void main(String[] args) {
		Set<Hero01> list = new HashSet<>();
		Hero01 h1 = new Hero01();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数：" + list.size());
		h1 = new Hero01();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数：" + list.size());
	}
}
