package com.movie.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.movie.dao.MovieinfoDAO;
import com.movie.entity.AbstractMovieinfo;

public class Service {
	private MovieinfoDAO movieinfodao;

	public void setMovieinfodao(MovieinfoDAO movieinfodao) {
		this.movieinfodao = movieinfodao;
	}

	@SuppressWarnings("unchecked")
	public void findMovie(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("titleï¿½ï¿½"+request.getParameter("title")+"  requestï¿½ï¿½"+request);
		List<AbstractMovieinfo> movielist = (List<AbstractMovieinfo>)movieinfodao
				.findByTitle(request.getParameter("title"));
		request.setAttribute("movielist", movielist);
		try {
			request.getRequestDispatcher("/show.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getCoor(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		String address = request.getParameter("address");
		System.out.println("address:"+address);
		String urlString = "http://api.map.baidu.com/geocoder/v2/?address="+address+"&output=json&ak=j57SOMl81fLsMAk2Wq6xYxGM&callback=showLocation";
		String result = HttpRequest.sendGet(urlString);
		String jsonstring = result.substring(result.indexOf("(")+1,result.lastIndexOf(")"));
		System.out.println("jsonString:"+jsonstring);
		JSONObject jsonObject = JSONObject.fromObject(jsonstring);
		if (jsonObject.getString("status").equals("0")) {
			JSONObject location = jsonObject.getJSONObject("result");
			String lng = location.getString("lng");
			String lat = location.getString("lat");
			request.setAttribute("error", "0");
			request.setAttribute("lng", lng);
			request.setAttribute("lat", lat);
		}else {
			request.setAttribute("error", "1");//errorï¿½ï¿½ÖµÎª1ï¿½ï¿½ï¿½Ð?Ã»ï¿½ï¿½ï¿½ï¿½ï¿?
		}
		try {
			request.getRequestDispatcher("map.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
