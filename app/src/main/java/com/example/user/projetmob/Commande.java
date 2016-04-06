package com.example.user.projetmob;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dounia
 */
public class Commande implements Serializable {
    //la commande comporte une liste de produits
    private List<Article> articles;

    public Commande() {
        this.articles= new ArrayList<Article>();
    }

    public List<Article> getProduits() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
