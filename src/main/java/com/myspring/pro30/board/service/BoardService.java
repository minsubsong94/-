package com.myspring.pro30.board.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro30.board.vo.ArticleVO;

public interface BoardService {
	
	public List<ArticleVO> listArticles() throws Exception;
}
