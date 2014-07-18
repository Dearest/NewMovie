package com.movie.entity;

/**
 * AbstractMovieinfo entity provides the base persistence definition of the
 * Movieinfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMovieinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String movieid;
	private String title;
	private String actors;
	private String alsoKnownAs;
	private String country;
	private String directors;
	private String filmLocations;
	private String genres;
	private String language;
	private String plotSimple;
	private String poster;
	private String rating;
	private String ratingCount;
	private Integer releaseDate;
	private String runtime;
	private String type;
	private String writers;
	private Integer year;

	// Constructors

	/** default constructor */
	public AbstractMovieinfo() {
	}

	/** full constructor */
	public AbstractMovieinfo(String movieid, String title, String actors,
			String alsoKnownAs, String country, String directors,
			String filmLocations, String genres, String language,
			String plotSimple, String poster, String rating,
			String ratingCount, Integer releaseDate, String runtime,
			String type, String writers, Integer year) {
		this.movieid = movieid;
		this.title = title;
		this.actors = actors;
		this.alsoKnownAs = alsoKnownAs;
		this.country = country;
		this.directors = directors;
		this.filmLocations = filmLocations;
		this.genres = genres;
		this.language = language;
		this.plotSimple = plotSimple;
		this.poster = poster;
		this.rating = rating;
		this.ratingCount = ratingCount;
		this.releaseDate = releaseDate;
		this.runtime = runtime;
		this.type = type;
		this.writers = writers;
		this.year = year;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMovieid() {
		return this.movieid;
	}

	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActors() {
		return this.actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getAlsoKnownAs() {
		return this.alsoKnownAs;
	}

	public void setAlsoKnownAs(String alsoKnownAs) {
		this.alsoKnownAs = alsoKnownAs;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDirectors() {
		return this.directors;
	}

	public void setDirectors(String directors) {
		this.directors = directors;
	}

	public String getFilmLocations() {
		return this.filmLocations;
	}

	public void setFilmLocations(String filmLocations) {
		this.filmLocations = filmLocations;
	}

	public String getGenres() {
		return this.genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPlotSimple() {
		return this.plotSimple;
	}

	public void setPlotSimple(String plotSimple) {
		this.plotSimple = plotSimple;
	}

	public String getPoster() {
		return this.poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRatingCount() {
		return this.ratingCount;
	}

	public void setRatingCount(String ratingCount) {
		this.ratingCount = ratingCount;
	}

	public Integer getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Integer releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getRuntime() {
		return this.runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWriters() {
		return this.writers;
	}

	public void setWriters(String writers) {
		this.writers = writers;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}