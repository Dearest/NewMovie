package com.movie.controller;


import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movie.service.Service;



/**
 * @author 603_02
 *
 */
@Controller
@RequestMapping("/movie")
public class MovieController {
	@Resource(name="service")
	private Service service;
	
	
	@RequestMapping("/findmovie")
	public void findMovie(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("findmovie request:"+request);
		service.findMovie(request,response);
	}
	
	@RequestMapping("/find")
	public String show(HttpServletRequest request,HttpServletResponse response){
		return "findmovie";
	}
	@RequestMapping("/getcoor")
	public void getCoor(HttpServletRequest request,HttpServletResponse response){
		
		
			service.getCoor(request, response);
		
		
	}
}
