package com.example.user.projetmob;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Dounia
 */
public class Panier implements Serializable {
    private List<Article> listArticles;

    public List<Article> getListArticles() {
        return listArticles;
    }

    public void setListArticles(List<Article> listArticles) {
        this.listArticles = listArticles;
    }

    public Panier(List<Article> listArticles) {

        this.listArticles = listArticles;
    }

    public void ajouterArticle (Article article)
    {
     listArticles.add(article);
    }
}
