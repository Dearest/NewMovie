package com.movie.entity;

/**
 * Movieinfo entity. @author MyEclipse Persistence Tools
 */
public class Movieinfo extends AbstractMovieinfo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Movieinfo() {
	}

	/** full constructor */
	public Movieinfo(String movieid, String title, String actors,
			String alsoKnownAs, String country, String directors,
			String filmLocations, String genres, String language,
			String plotSimple, String poster, String rating,
			String ratingCount, Integer releaseDate, String runtime,
			String type, String writers, Integer year) {
		super(movieid, title, actors, alsoKnownAs, country, directors,
				filmLocations, genres, language, plotSimple, poster, rating,
				ratingCount, releaseDate, runtime, type, writers, year);
	}

}
