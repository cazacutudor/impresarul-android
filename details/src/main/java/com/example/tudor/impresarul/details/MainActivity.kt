package com.example.tudor.impresarul.details

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contact_button.setOnClickListener {
            val url = "http://www.impresarul.com/contact"

            val browse = Intent(ACTION_VIEW)
            browse.data = Uri.parse(url)
            startActivity(browse)
        }

        viewPager.adapter = TabPagerAdapter(supportFragmentManager).apply {
            addFragment(Details())
            addFragment(Talents())
        }

        tabs.setupWithViewPager(viewPager)
    }
}
