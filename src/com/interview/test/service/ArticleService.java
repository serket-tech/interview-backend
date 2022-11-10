package com.interview.test.service;

import java.util.List;

import com.interview.test.data.ArticleRepo;
import com.interview.test.data.model.Article;

public class ArticleService extends SecurityService {

	private ArticleRepo articleRepo;

	public List<Article> getArticles() {
		authorize();

		List<Article> articles = articleRepo.getArticles(getUserId());
		return process(articles);
	}

	private List<Article> process(List<Article> articles) {
		//TRANSLATE ARTICLE TITLES
		return articles;
	}
}
