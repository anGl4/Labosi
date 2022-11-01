package labos3.zad2;

public class Main {
	public static void main(String[] args) {
		SimpleQueue<Integer> q = new SimpleQueue<Integer>(4);
		int i = 0;
		while (!q.isFull())
			q.enqueue(i++);
		while (!q.isEmpty())
			System.out.print(q.dequeue());
	}
}
