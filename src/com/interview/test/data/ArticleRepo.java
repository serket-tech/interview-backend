package com.interview.test.data;

import java.util.ArrayList;
import java.util.List;

import com.interview.test.data.model.Article;

public class ArticleRepo {

	public List<Article> getArticles(String userId) {
		return new ArrayList<>();
	}

	public Article getArticle(String url) {
		return new Article();
	}
	
	public List<Article> getArticlesWithPngImages() {
		return new ArrayList<>();
	}
	
	public List<Article> getTechnicalArticles() {
		return new ArrayList<>();
	}
}
