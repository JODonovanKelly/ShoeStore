package com.udacity.shoestore

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shoe_item)

        val listView = findViewById<ListView>(R.id.shoelistview)
        val arrShoe: ArrayList<Shoe> = ArrayList()
        arrShoe.add(Shoe("Gel Duramo", 10.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel Duram", 8.0, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel Dura", 9.0, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel Dur", 8.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel Du", 10.0, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel D", 9.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel", 11.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Ge", 10.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("G", 11.0, "Asics", "Gud Business"))

        listView.adapter = ListViewAdapter(applicationContext, arrShoe)
    }
}