package com.nareshtechnologies.tabnavigation_lateralnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var viewpager:ViewPager2
    lateinit var tabLayout:TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager = findViewById(R.id.viewpager)
        tabLayout = findViewById(R.id.tabLayout)
        val vpa:ViewPagerAdapter = ViewPagerAdapter(this)
        viewpager.adapter = vpa
        TabLayoutMediator(tabLayout,viewpager){ tab, position ->
            when(position){
                0-> tab.setText("RED")
                1-> tab.setText("GREEN")
                2-> tab.setText("BLUE")
            }
        }.attach()
    }

    class ViewPagerAdapter(fa:FragmentActivity):FragmentStateAdapter(fa){
        override fun getItemCount(): Int {
            return 3
        }

        override fun createFragment(position: Int): Fragment {
            when(position){
                0-> return RedFragment()
                1 -> return GreenFragment()
                2 -> return BlueFragment()
            }
            return RedFragment()
        }

    }
}

// TODO 1: First, add ViewPager2 on the activity_main.xml
