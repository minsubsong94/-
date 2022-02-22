package com.myspring.pro30.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



public interface BoardController {
   
   ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception;

}