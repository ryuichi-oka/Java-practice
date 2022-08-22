package lambda;

public class SayHello {
	public static void main(String[] args) {
		Greeting greeting = (String word) -> {
			System.out.println("こんばんは");
			return word;
		};
		System.out.println(greeting.hello("こんにちは"));
	}
}
