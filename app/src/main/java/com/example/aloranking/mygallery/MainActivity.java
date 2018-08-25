package com.example.aloranking.mygallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.aloranking.mygallery.data.PhotoImageAssest;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.images_grid_view);

        // Instance of ImageAdapter
        ImageAdapter imageAdapter = new ImageAdapter(this, PhotoImageAssest.getBodyParts());
        gridView.setAdapter(imageAdapter);

        /**
         * On Click event for Single Gridview Item
         * */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getApplicationContext(), FullImageActivity.class);
                intent.putExtra("id", position);
                startActivity(intent);
            }
        });

    }


}
