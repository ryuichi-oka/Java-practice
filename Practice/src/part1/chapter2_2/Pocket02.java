package part1.chapter2_2;

// Pocketクラスから作られるクラス
public class Pocket02<String> {
	private String data;
	
	public void put(String d) {
		this.data = d;
	}
	
	public String get() {
		return this.data;
	}
}
