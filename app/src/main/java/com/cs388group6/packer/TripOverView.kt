package com.cs388group6.packer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class TripOverView : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    private lateinit var titleView: TextView
    private lateinit var weightView: TextView
    private lateinit var itemCountView: TextView
    private lateinit var dateView: TextView
    private lateinit var addressView: TextView
    private lateinit var descView: TextView
    private lateinit var editButton: FloatingActionButton
    private lateinit var deleteButton: FloatingActionButton
    private lateinit var addItemButton: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trip_overview_screen)
        database = FirebaseDatabase.getInstance().reference

        titleView = findViewById(R.id.tripOverviewTitleLabel)
        weightView = findViewById(R.id.tripOverviewWeightLabel)
        itemCountView = findViewById(R.id.tripOverviewNumItemsLabel)
        dateView = findViewById(R.id.tripOverviewDateLabel)
        addressView = findViewById(R.id.tripOverviewAddressLabel)
        descView = findViewById(R.id.tripOverviewDescriptionLabel)
        editButton = findViewById(R.id.tripOverviewEditButton)
        deleteButton = findViewById(R.id.tripOverviewDeleteButton)
        addItemButton = findViewById(R.id.tripOverviewAddItemButton)


        val tripID = intent.getStringExtra("trip")
        if (tripID != null) {
            database.child("Trips").child(tripID).addValueEventListener(object :ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.exists()){
                        val trip = snapshot.getValue(Trip::class.java)


                        titleView.text = trip!!.title
                        weightView.text = "TODO"
                        itemCountView.text = trip!!.items?.size.toString()
                        dateView.text = trip!!.date
                        addressView.text = trip!!.location
                        descView.text = trip!!.description
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    Log.w( "loadPost:onCancelled", error.toException())
                }

            })
        }

        editButton.setOnClickListener {
            //TODO: send to TripListAdd activity and modify it to handle edits
        }

        deleteButton.setOnClickListener {
            //TODO: delete Trip Functionality
        }

        addItemButton.setOnClickListener {
            //TODO: add items to trip functionality
        }

    }
}