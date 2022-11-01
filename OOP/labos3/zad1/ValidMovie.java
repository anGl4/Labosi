package labos3.zad1;

class ValidMovie extends Movie {

	public ValidMovie(String name, int runtime) throws InvalidMovieDefinitionException {
		if (name.length() < 1 || name.length() > 70) {
			throw new InvalidMovieDefinitionException(
					"Invalid name, valid names must contain between 1 and 70 characters!");
		}
		if (!(runtime >= 1 && runtime <= 300)) {
			throw new InvalidMovieDefinitionException("Invalid runtime, valid runtimes are values between 1 and 300!");
		}
		setName(name);
		setRuntime(runtime);
		setHighestRating(0);
		setNumberOfViews(0);
	}

	@Override
	public void watch(double rating) {
		setNumberOfViews(getNumberOfViews() + 1);
		if (!(rating >= 0 && rating <= 10)) {
			throw new InvalidRatingException("Invalid rating, valid ratings have values between 0 and 10!");
		}
		if (rating > getHighestRating()) {
			setHighestRating(rating);
		}
	}

}
