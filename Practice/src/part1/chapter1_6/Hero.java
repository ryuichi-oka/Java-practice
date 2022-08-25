package part1.chapter1_6;

// clone()による複製をサポートしたHeroクラス
public class Hero implements Cloneable {
	String name;
	int hp;
	Sword sword;
	
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword.clone();
		return result;
	}
	
	public Hero() {
		this.name = "";
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	public Sword getSword() {
		return this.sword;
	}
	
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
