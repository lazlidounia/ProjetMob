package com.example.user.projetmob;

import java.io.Serializable;

/**
 * Created by Dounia
 */
public class Article implements Serializable {
    private int id;
    private String nom;
    private String couleur;
    private float prix;
    private int photo;
  //  private int iconPhoto;


    public Article(int id, String nom, String couleur, float prix, int photo) {
        this.id = id;
        this.nom = nom;
        this.couleur = couleur;
        this.prix = prix;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
/*
    public int getIconPhoto() {
        return iconPhoto;
    }

    public void setIconPhoto(int iconPhoto) {
        this.iconPhoto = iconPhoto;
    }*/
}
