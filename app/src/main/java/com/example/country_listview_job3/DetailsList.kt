package com.example.country_listview_job3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView

class DetailsList : AppCompatActivity() {
    private lateinit var resCountryImage: CircleImageView
    private lateinit var resCountryName: TextView
    private lateinit var resCountryDetails: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_list)

        resCountryImage = findViewById(R.id.countryImage)
        resCountryName = findViewById(R.id.countryName)
        resCountryDetails = findViewById(R.id.countryDetails)

        resCountryImage.setImageResource(intent.getIntExtra("countryImage", 0))
        resCountryName.text = intent.getStringExtra("countryName")
        resCountryDetails.setText(intent.getIntExtra("countryDetailsLong", 0))
    }
}
