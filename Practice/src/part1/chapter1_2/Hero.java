package part1.chapter1_2;

//	toString()のオーバーライド
public class Hero {
	private String name;
	private int hp, mp;
	
	public String toString() {
		return "勇者(名前 = " + this.name + "/HP =" + this.hp + "/MP =" + this.mp + ")";
	}
}
