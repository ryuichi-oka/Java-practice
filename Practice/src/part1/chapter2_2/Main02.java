package part1.chapter2_2;

// Pocket02クラスを利用するプログラム
public class Main02 {
	public static void main(String[] args) {
		Pocket02<String> p = new Pocket02<>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
	}
}
