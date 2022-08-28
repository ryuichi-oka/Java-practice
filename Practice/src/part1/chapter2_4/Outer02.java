package part1.chapter2_4;

// ローカルクラスの利用例
public class Outer02 {
	int outerMember = 2;
	void outerMethod() {
		int a = 10;
		class Inner {
			public void innerMethod() {
				System.out.println("InnerMethodです");
				System.out.println(outerMember + a);
			}
		}
		Inner ic = new Inner();
		ic.innerMethod();
	}
}
