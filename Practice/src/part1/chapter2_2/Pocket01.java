package part1.chapter2_2;

// ジェネリクスを使わないPocketクラス
public class Pocket01 {
	private Object data;
	
	public void put(Object d) {
		this.data = d;
	}
	
	public Object get() {
		return this.data;
	}
}
