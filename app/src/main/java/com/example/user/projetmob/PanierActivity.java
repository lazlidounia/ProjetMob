package com.example.user.projetmob;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dounia
 */

public class PanierActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panier);
        Intent intent =getIntent();
        List<Article> articleList= new ArrayList<Article>();
        Panier panier= new Panier(articleList);
    //    ImageView imageView = (ImageView) findViewById(R.id.imagepanier);


    }



}
