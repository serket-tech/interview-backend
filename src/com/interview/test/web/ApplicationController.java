package com.interview.test.web;

import java.util.List;

import com.interview.test.data.ArticleRepo;
import com.interview.test.data.model.Article;
import com.interview.test.service.ArticleService;

public class ApplicationController {

	private ArticleRepo articleRepo;
	private ArticleService articleService;

	public List<Article> getArticles() {
		return articleService.getArticles();
	}

	public Article getSingleArticleByUrl(String url) {
		return articleRepo.getArticle(url);
	}
}
