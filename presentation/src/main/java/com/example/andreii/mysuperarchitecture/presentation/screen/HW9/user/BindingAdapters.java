package com.example.andreii.mysuperarchitecture.presentation.screen.HW9.user;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class BindingAdapters {
    @BindingAdapter({"app:url"})
    public static void loadImage(ImageView imageView, String imageUrl){
        Picasso.get().load(imageUrl).into(imageView);
    }

}


