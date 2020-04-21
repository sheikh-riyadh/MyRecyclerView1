package com.example.myrecyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerID.layoutManager = layoutManager


        val adapter = MyAdapter(this,Hobby.Supplier.hobbies,this)
        recyclerID.adapter = adapter





    }

    override fun onItemClick(item: Hobby, position: Int) {
        Toast.makeText(this, item.title,Toast.LENGTH_SHORT).show()
    }
}
