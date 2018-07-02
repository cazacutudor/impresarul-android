package com.example.tudor.impresarul.details

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.talents.*

class Talents : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(R.layout.talents, container, false)
    }

    override fun onStart() {
        super.onStart()
        listView.adapter = ListViewAdapter(this.activity as Context).apply {
            addTalent(Talent("Ion", "Cantaret"))
            addTalent(Talent("Ionica", "Pictor"))
        }
    }

}

