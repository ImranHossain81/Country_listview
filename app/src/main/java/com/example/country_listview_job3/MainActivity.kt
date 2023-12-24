package com.example.country_listview_job3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val countryList: ArrayList<Country> = ArrayList<Country>()
        countryList.add(Country(R.drawable.bangla, "Bangldesh", "Dhaka is the big city in Bangladesh",R.string.BD))
        countryList.add(Country(R.drawable.palestine, "Palestin", "Palestin is the capital of country",R.string.BD))
        countryList.add(Country(R.drawable.pkistan, "Pakistan", "Islamabad is the capital of Pakistan",R.string.BD))
        countryList.add(Country(R.drawable.saudi, "Saudi Arub", "Saudi Arubu is the capital of musliem country",R.string.BD))
        countryList.add(Country(R.drawable.qatar, "Qatar", "Qatar is the capital city",R.string.BD))
        countryList.add(Country(
            R.drawable.canada,
            "Canada",
            "Canada is the capital of world",R.string.BD
        )
        )
        countryList.add(Country(R.drawable.afghanistan, "Afganistan", "Kabul is the capital of Afganistan",R.string.BD))
        countryList.add(Country(R.drawable.malaysia, "Malaysia", "Malaysia is the capital this country",R.string.BD))
        val countryAdapter = CountryAdapter(this, countryList)
        listView.adapter = countryAdapter

        listView.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this, DetailsList::class.java)
            intent.putExtra("countryName", countryList[position].countryName)
            intent.putExtra("countryDetails", countryList[position].countryDetails)
            intent.putExtra("countryImage", countryList[position].countryImage)
            intent.putExtra("countryDetailsLong", countryList[position].countryDetailsLong)

            startActivity(intent)
        }



    }
}