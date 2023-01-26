package com.udacity.shoestore

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.databinding.ActivityMainBinding
import com.udacity.shoestore.models.Shoe
import timber.log.Timber


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        Timber.plant(Timber.DebugTree())
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}
