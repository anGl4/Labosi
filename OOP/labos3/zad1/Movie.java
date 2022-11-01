package labos3.zad1;

abstract class Movie {

	protected String name;
	protected int runtime;
	protected int numberOfViews;
	protected double highestRating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getNumberOfViews() {
		return numberOfViews;
	}

	protected void setNumberOfViews(int numberOfViews) {
		this.numberOfViews = numberOfViews;
	}

	public double getHighestRating() {
		return highestRating;
	}

	protected void setHighestRating(double highestRating) {
		this.highestRating = highestRating;
	}

	public abstract void watch(double rating);
}
