package com.example.aloranking.mygallery;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.List;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private List<Integer> mImageIds;

    public ImageAdapter(Context Context, List<Integer> ImageIds) {
        this.mContext = Context;
        this.mImageIds = ImageIds;
    }

    @Override
    public int getCount() {
        return mImageIds.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view == null) {
            // If the view is not recycled, this creates a new ImageView to hold an image
            imageView = new ImageView(mContext);
            // Define the layout parameters
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) view;
        }

        // Set the image resource and return the newly created ImageView
        imageView.setImageResource(mImageIds.get(position));
        return imageView;
    }
}
