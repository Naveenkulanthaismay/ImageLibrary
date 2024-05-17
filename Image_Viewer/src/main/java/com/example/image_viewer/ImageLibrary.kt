package com.example.image_viewer

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object ImageLibrary {

    fun imageViewer(context: Context, url:Any, imageView: ImageView) {
        Glide.with(context)
            .load(url)
            .into(imageView)
    }
}