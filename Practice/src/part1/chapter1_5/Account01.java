package part1.chapter1_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//	口座インスタンスの並び替え（エラー）
public class Account01 {
	public static void main(String[] args) {
		List<Account01> list = new ArrayList<>();
		/* ： */
		Collections.sort(list);
//	自然順序付けがされていないためどの要素を基準に並び替えるか分からず、エラーが起きてしまう
	}
}
