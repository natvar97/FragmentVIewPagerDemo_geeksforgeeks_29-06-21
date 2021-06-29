package com.indialone.fragmentviewpagerdemo

import android.app.Activity
import android.content.Context
import androidx.annotation.VisibleForTesting
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val fragments: ArrayList<Fragment>? = ArrayList()
    private val fragmentsTitle: ArrayList<String>? = ArrayList()

    fun add(fragment: Fragment , title : String) {
        fragments?.add(fragment)
        fragmentsTitle?.add(title)
    }

    override fun getCount(): Int {
        return fragments!!.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments!!.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentsTitle?.get(position)
    }

}