package part1.chapter1_4;

import java.util.Objects;

//	Hero02クラスでhashCode()をオーバーライド
public class Hero02 {
	String name;
	int hp;
	
	public int hashCode() {
		return Objects.hash(this.name, this.hp);
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (!(o instanceof Hero02)) return false;
		Hero02 r = (Hero02)o;
		if (!this.name.trim().equals(r.name.trim())) {
			return false;
		}
		return true;
	}
}
