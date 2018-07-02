package com.example.tudor.impresarul.details

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class TabPagerAdapter(manager: FragmentManager) :
        FragmentPagerAdapter(manager) {

    private val fragmentList : MutableList<Fragment> = mutableListOf()

    fun addFragment(fragment: Fragment) {
        fragmentList.add(fragment)
    }

    override fun getItem(position: Int): android.support.v4.app.Fragment {
        return fragmentList.get(position)
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Details"
            else -> "Talents"
        }
    }
}