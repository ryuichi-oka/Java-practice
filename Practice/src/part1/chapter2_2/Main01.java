package part1.chapter2_2;

// Pockst01クラスを利用するプログラム
public class Main01 {
	public static void main(String[] args) {
		Pocket01 p = new Pocket01();
		p.put("1192");
		String s = (String)p.get();
		System.out.println(s);
	}
}
