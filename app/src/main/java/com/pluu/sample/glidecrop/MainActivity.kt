package com.pluu.sample.glidecrop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.pluu.sample.glidecrop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this)
            .load(R.drawable.sample_vertical)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .circleCrop()
            .into(binding.sample1)

        Glide.with(this)
            .load(R.drawable.sample_vertical)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .optionalCircleCrop()
            .into(binding.sample1Modify)

        Glide.with(this)
            .load(R.drawable.sample_small_vertical)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .circleCrop()
            .into(binding.sample2)

        Glide.with(this)
            .load(R.drawable.sample_small_vertical)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .optionalCircleCrop()
            .into(binding.sample2Modify)

        Glide.with(this)
            .load(R.drawable.sample_horizontal)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .circleCrop()
            .into(binding.sample3)

        Glide.with(this)
            .load(R.drawable.sample_horizontal)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .optionalCircleCrop()
            .into(binding.sample3Modify)
    }
}