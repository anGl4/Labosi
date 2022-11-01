package labos3.zad2;

class SimpleQueue<T> {
	private int maxSize;
	private int counter = 0;
	T[] queue;

	@SuppressWarnings("unchecked")
	public SimpleQueue(int maxSize) {
		if (maxSize < 1) {
			throw new IllegalArgumentException();
		}
		this.maxSize = maxSize;
		queue = (T[]) new Object[maxSize];
	}

	public void enqueue(T element) {
		if (counter < maxSize) {
			queue[counter++] = element;
		} else {
			throw new RuntimeException();
		}
	}

	public T dequeue() {
		if (counter == 0 || queue == null) {
			throw new NullPointerException();
		}

		T firstInQueue = queue[0];
		for (int i = 0; i < queue.length - 1; i++) {
			queue[i] = queue[i + 1];
		}
		queue[counter - 1] = null;

		counter--;

		return firstInQueue;
	}

	public boolean isEmpty() {
		return (counter == 0 || queue == null);
	}

	public boolean isFull() {
		return (counter == maxSize);
	}

	public int getMaxSize() {
		return maxSize;
	}

	public int getNumberOfElements() {
		return counter;
	}

}
