package com.este.conf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.este.conf.model.Article;

public interface DaoArticle extends JpaRepository<Article, Integer>  {

}
