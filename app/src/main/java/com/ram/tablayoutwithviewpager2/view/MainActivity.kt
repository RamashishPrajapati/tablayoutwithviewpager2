package com.ram.tablayoutwithviewpager2.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.ram.tablayoutwithviewpager2.R
import com.ram.tablayoutwithviewpager2.adapter.TabViewpagerAdapter
import com.ram.tablayoutwithviewpager2.utility.DemoList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var tabViewpagerAdapter: TabViewpagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initTabAndViewpager()

    }

    /*Idealizing Tab layout and viewpager2*/
    private fun initTabAndViewpager() {
        /*If using tab layout and viewpagr2 in fragment then instant of  supportFragmentManager use
         childFragmentManager and in place of lifecycle use  viewLifecycleOwner.lifecycle, example below

          tabViewpagerAdapter =
            TabViewpagerAdapter(
                childFragmentManager,
                viewLifecycleOwner.lifecycle,
                DemoList.tabTextList.size
            )*/

        tabViewpagerAdapter =
            TabViewpagerAdapter(
                supportFragmentManager,
                lifecycle,
                DemoList.tabTextList.size
            )
        viewpager.adapter = tabViewpagerAdapter

        TabLayoutMediator(tablayout, viewpager) { tab, position ->
            /*for showing the text in tab layout*/
            tab.text = DemoList.tabTextList[position]
            /*for showing the image icon in tab lauoyt */
            //tab.setIcon(DemoList.tabImageList[position])

        }.attach()
    }
}