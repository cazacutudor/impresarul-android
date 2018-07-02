package com.example.tudor.impresarul.details

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListViewAdapter(context: Context) : BaseAdapter() {

    private val mContext: Context = context
    private var talentList: MutableList<Talent> = mutableListOf()

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    fun addTalent(talent: Talent) {
        talentList.add(talent)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var item = getItem(position)

        var rowView = inflater.inflate(R.layout.talent, parent, false)

        var titleView = rowView.findViewById(R.id.title) as TextView
        var descriptionView = rowView.findViewById(R.id.description) as TextView
        var photoView = rowView.findViewById(R.id.photo) as ImageView


        titleView.text = item.name
        descriptionView.text = item.description
//        photoView.setImageURI(Uri.parse("www.google."))

        return rowView
    }

    override fun getItem(position: Int): Talent {
        return talentList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return talentList.count()
    }

}