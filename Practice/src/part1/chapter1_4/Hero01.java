package part1.chapter1_4;

//	HashSetの利用でremove()できない例
public class Hero01 {
	public String name;
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (!(o instanceof Hero01)) return false;
		Hero01 r = (Hero01)o;
		if (!this.name.trim().equals(r.name.trim())) {
			return false;
		}
		return true;
	}
}
