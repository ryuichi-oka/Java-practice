package inner_class_sample;

public class Human {
	public class HumanLeg {
		public void kick() {
			System.out.println("蹴る");
		}
	}
	public static void main(String[] args) {
		Human human = new Human();
		Human.HumanLeg leg = human.new HumanLeg();
		leg.kick();
	}
}
