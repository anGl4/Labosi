package labos3.zad1;

class InvalidRatingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidRatingException(String msg) {
		super(msg);
	}
}
