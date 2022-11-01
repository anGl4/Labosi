package labos5.zad2;

import java.util.function.Predicate;

class Filter {

	public static Predicate<MovieInfo> olderThan(int year) {
		return (MovieInfo movie) -> movie.getYear() < year;
	}

	public static Predicate<MovieInfo> byDirectorAndYear(int year, String director) {
		return (MovieInfo movie) -> movie.getYear() > year && movie.getDirector().equals(director);
	}

	public static Predicate<MovieInfo> byRating(int score) {
		return (MovieInfo movie) -> movie.getIMDBRating() >= score && movie.getRottenTomatoesRating() >= score;
	}

}
