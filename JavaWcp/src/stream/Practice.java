package stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) throws Exception {
		List<List> list = new ArrayList<>();
		list.add(new List(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
		list.add(new List(LocalDate.of(2021, 9, 15), "〇〇社面接", false));
		list.add(new List(LocalDate.of(2021, 12, 4), "手帳を買う", true));
		list.add(new List(LocalDate.of(2021, 8, 10), "散髪に行く", false));
		list.add(new List(LocalDate.of(2021, 10, 9), "スクールの課題を解く", false));
		
		long count = list.stream()
			.filter(t -> !t.isDone())
			.count();
		System.out.println(count);
		
		List<List> newList = list.stream()
			.sorted()
			.collect(Collectors.toList());
		newList.forEach(System.out::println);
	}
}
