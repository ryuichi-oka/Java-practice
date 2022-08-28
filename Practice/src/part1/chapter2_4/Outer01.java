package part1.chapter2_4;

// メンバクラス
// static付きメンバクラスの利用例
public class Outer01 {
	int outerField;
	static int outerStaticField;
	static class Inner {
		void innerMethod() {
			outerStaticField = 10;
		}
	}
	void outerMethod() {
		Inner ic = new Inner();
	}
}
