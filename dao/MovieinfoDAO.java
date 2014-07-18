package com.movie.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.movie.entity.AbstractMovieinfo;
import com.movie.entity.Movieinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Movieinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.movie.entity.Movieinfo
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class MovieinfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MovieinfoDAO.class);
	// property constants
	public static final String MOVIEID = "movieid";
	public static final String TITLE = "title";
	public static final String ACTORS = "actors";
	public static final String ALSO_KNOWN_AS = "alsoKnownAs";
	public static final String COUNTRY = "country";
	public static final String DIRECTORS = "directors";
	public static final String FILM_LOCATIONS = "filmLocations";
	public static final String GENRES = "genres";
	public static final String LANGUAGE = "language";
	public static final String PLOT_SIMPLE = "plotSimple";
	public static final String POSTER = "poster";
	public static final String RATING = "rating";
	public static final String RATING_COUNT = "ratingCount";
	public static final String RELEASE_DATE = "releaseDate";
	public static final String RUNTIME = "runtime";
	public static final String TYPE = "type";
	public static final String WRITERS = "writers";
	public static final String YEAR = "year";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Movieinfo transientInstance) {
		log.debug("saving Movieinfo instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Movieinfo persistentInstance) {
		log.debug("deleting Movieinfo instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Movieinfo findById(java.lang.Integer id) {
		log.debug("getting Movieinfo instance with id: " + id);
		try {
			Movieinfo instance = (Movieinfo) getCurrentSession().get(
					"com.movie.entity.Movieinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Movieinfo instance) {
		log.debug("finding Movieinfo instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.movie.entity.Movieinfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Movieinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Movieinfo as model where model."
					+ propertyName + " like ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, "%"+value+"%");
			System.out.println(queryObject.list()+"   "+queryObject.list().size());
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMovieid(Object movieid) {
		return findByProperty(MOVIEID, movieid);
	}

	public List findByTitle(Object title) {
		
		return findByProperty(TITLE, title);
	}

	public List findByActors(Object actors) {
		return findByProperty(ACTORS, actors);
	}

	public List findByAlsoKnownAs(Object alsoKnownAs) {
		return findByProperty(ALSO_KNOWN_AS, alsoKnownAs);
	}

	public List findByCountry(Object country) {
		return findByProperty(COUNTRY, country);
	}

	public List findByDirectors(Object directors) {
		return findByProperty(DIRECTORS, directors);
	}

	public List findByFilmLocations(Object filmLocations) {
		return findByProperty(FILM_LOCATIONS, filmLocations);
	}

	public List findByGenres(Object genres) {
		return findByProperty(GENRES, genres);
	}

	public List findByLanguage(Object language) {
		return findByProperty(LANGUAGE, language);
	}

	public List findByPlotSimple(Object plotSimple) {
		return findByProperty(PLOT_SIMPLE, plotSimple);
	}

	public List findByPoster(Object poster) {
		return findByProperty(POSTER, poster);
	}

	public List findByRating(Object rating) {
		return findByProperty(RATING, rating);
	}

	public List findByRatingCount(Object ratingCount) {
		return findByProperty(RATING_COUNT, ratingCount);
	}

	public List findByReleaseDate(Object releaseDate) {
		return findByProperty(RELEASE_DATE, releaseDate);
	}

	public List findByRuntime(Object runtime) {
		return findByProperty(RUNTIME, runtime);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByWriters(Object writers) {
		return findByProperty(WRITERS, writers);
	}

	public List findByYear(Object year) {
		return findByProperty(YEAR, year);
	}

	public List findAll() {
		log.debug("finding all Movieinfo instances");
		try {
			String queryString = "from Movieinfo";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Movieinfo merge(Movieinfo detachedInstance) {
		log.debug("merging Movieinfo instance");
		try {
			Movieinfo result = (Movieinfo) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Movieinfo instance) {
		log.debug("attaching dirty Movieinfo instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Movieinfo instance) {
		log.debug("attaching clean Movieinfo instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MovieinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MovieinfoDAO) ctx.getBean("MovieinfoDAO");
	}
}