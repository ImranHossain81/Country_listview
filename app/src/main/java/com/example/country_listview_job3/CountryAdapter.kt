package com.example.country_listview_job3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class CountryAdapter(context: Context,countryList:ArrayList<Country>):ArrayAdapter<Country>(context,0,countryList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView=convertView
        if (listItemView==null){
            listItemView = LayoutInflater.from(context).inflate(R.layout.country_layout, parent, false)
        }
        var countryFlag=listItemView!!.findViewById<CircleImageView>(R.id.flagImg)
        var countryName=listItemView!!.findViewById<TextView>(R.id.CountryName)
        var countryDetails=listItemView!!.findViewById<TextView>(R.id.countryDetails)

        countryName.setText(getItem(position)!!.countryName)
        countryDetails.setText(getItem(position)!!.countryDetails)
        countryFlag.setImageResource(getItem(position)!!.countryImage)
        return listItemView
    }
}
