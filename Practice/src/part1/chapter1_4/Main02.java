package part1.chapter1_4;

import java.util.HashSet;
import java.util.Set;

public class Main02 {
	public static void main(String[] args) {
		Set<Hero02> list = new HashSet<>();
		Hero02 h1 = new Hero02();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数：" + list.size());
		h1 = new Hero02();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数：" + list.size());
	}
}
