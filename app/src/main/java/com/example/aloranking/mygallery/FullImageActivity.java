package com.example.aloranking.mygallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.aloranking.mygallery.data.PhotoImageAssest;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        Intent i = getIntent();

        int position =i.getExtras().getInt("id");
        ImageView imageView =(ImageView) findViewById(R.id.full_image);

       // ImageAdapter imageAdapter = new ImageAdapter(this, PhotoImageAssest.getBodyParts());
        PhotoImageAssest photo = new PhotoImageAssest();
        imageView.setImageResource(photo.bodyParts.get(position));
    }
}
