package part1.chapter2_4;

// 匿名クラスの利用例
public class Main03 {
	public static void main(String[] args) {
		Pocket<Object> pocket = new Pocket<>();
		System.out.println("使い捨てのインスタンスを作りpocketに入れます");
		
		pocket.put(new Object() {
			String innerField;
			void innerMethod() {
				
			}
		});
	}
}
