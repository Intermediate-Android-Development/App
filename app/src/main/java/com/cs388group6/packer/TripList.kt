package com.cs388group6.packer

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class TripList: AppCompatActivity() {
    private lateinit var database: DatabaseReference
    private lateinit var adapter: TripListAdapter
//    private val trips = java.util.ArrayList<Trip>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trips_list_screen)
        database = FirebaseDatabase.getInstance().reference
        val recyclerView = findViewById<RecyclerView>(R.id.tripsListRV)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = TripListAdapter(ArrayList())
        recyclerView.adapter = adapter

        //Add trip button
        findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener {
            val intent = Intent(this, TripListAdd::class.java)
            startActivity(intent)
////            setContentView(R.layout.trips_list_screen)
        }


        //Set default selection
        val bottomNavigationView1: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView1.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_login -> { true }
                R.id.nav_logout -> {true }
                R.id.nav_home -> { true }
                R.id.nav_list -> { true }
            }
            true
        }
        bottomNavigationView1.selectedItemId = R.id.nav_home
        // Bottom Navigation Selection
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_login -> {
                    startActivity(Intent(this, MainActivity::class.java))
                }
                R.id.nav_logout -> {
                    startActivity(Intent(this, MainActivity::class.java))
                }
                R.id.nav_home -> {
                    startActivity(Intent(this, TripList::class.java))
                }
                R.id.nav_list -> {
                    startActivity(Intent(this, MyItemList::class.java))
                }
            }
            true
        }
    }
}


