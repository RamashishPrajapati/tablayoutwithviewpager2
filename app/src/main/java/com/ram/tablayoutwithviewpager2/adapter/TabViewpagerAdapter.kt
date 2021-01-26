package com.ram.tablayoutwithviewpager2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ram.tablayoutwithviewpager2.view.fragments.*

/**
 * Created by Ramashish Prajapati on 26,January,2021
 */
class TabViewpagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    size: Int
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private var numberOfFragment: Int = size

    override fun getItemCount(): Int {
        return numberOfFragment
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> {
                fragment = Tab1Fragment()
            }
            1 -> {
                fragment = Tab2Fragment()
            }
            2 -> {
                fragment = Tab3Fragment()
            }
            3-> {
                fragment = Tab4Fragment()
            }
            4 -> {
                fragment = Tab5Fragment()
            }
        }

        return fragment!!
    }
}