package part1.chapter1_5;

//	Account02クラスの自然順序付けを定義
public class Account02 implements Comparable<Account02> {
	int number;  // 口座番号
	int zandaka; // 残高
	
	public int compareTo(Account02 obj) {
		if (this.number < obj.number) {
			return -1;
		}
		if (this.number > obj.number) {
			return 1;
		}
		return 0;
	}
}
