package part1.chapter1_3;

import java.util.Arrays;

//	配列をequals()で比較する
public class Main02 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		System.out.println("誤った判定：" + a.equals(b));
		System.out.println("正しい判定：" + Arrays.equals(a, b));
//	二次元以上の配列同士の場合は、等価判定に Arrays.deepEquals()を用いる
	}
}
