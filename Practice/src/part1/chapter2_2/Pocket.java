package part1.chapter2_2;

//ジェネリクスを使ったクラス
public class Pocket<E> {
	private E data;
	public void put(E d) {
		this.data = d;
	}
	public E get() {
		return this.data;
	}
}
