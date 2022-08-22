package stream;

import java.time.LocalDate;

public class List implements Comparable<List> {
	private LocalDate date;
	private String list;
	private boolean done;
	public List(LocalDate date, String list, boolean done) {
		this.date = date;
		this.list = list;
		this.done = done;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getList() {
		return list;
	}
	
	public boolean isDone() {
		return done;
	}
	
	@Override
	public int compareTo(List t) {
		return date.compareTo(t.date);
	}
	
	@Override
	public String toString() {
		return date + ":" + list + ":" + done + "]";
	}
}
