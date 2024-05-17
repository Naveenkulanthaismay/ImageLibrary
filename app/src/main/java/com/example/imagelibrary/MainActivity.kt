package com.example.imagelibrary

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.image_viewer.ImageLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.image)
        ImageLibrary.imageViewer(this, "https://img.freepik.com/free-photo/glowing-spaceship-orbits-planet-starry-galaxy-generated-by-ai_188544-9655.jpg?w=1060&t=st=1715857790~exp=1715858390~hmac=08b070904adccaa85f01d4f7bc3d5c005943aebed9b2b1c1c608149f79e5a6a7", imageView)
    }
}