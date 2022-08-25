package part1.chapter1_5;

import java.util.Comparator;

public class ZandakaComparator implements Comparator<Account02> {
	public int compare(Account02 x, Account02 y) {
		return (x.zandaka - y.zandaka);
	}
}
