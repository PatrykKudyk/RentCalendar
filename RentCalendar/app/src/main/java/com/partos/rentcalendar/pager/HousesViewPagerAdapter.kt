package com.partos.rentcalendar.pager

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.partos.rentcalendar.R
import com.partos.rentcalendar.recycler.MarginItemDecoration
import kotlinx.android.synthetic.main.view_pager_cell.view.*

class HousesViewPagerAdapter : PagerAdapter {

    var context: Context
    var recyclerViews: Array<RecyclerView>
    lateinit var inflater: LayoutInflater

    constructor(context: Context, recyclerViews: Array<RecyclerView>) : super() {
        this.context = context
        this.recyclerViews = recyclerViews
    }


    override fun getCount(): Int = recyclerViews.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean =
        view == `object` as LinearLayout

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var recyclerView: RecyclerView
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view: View = inflater.inflate(R.layout.view_pager_cell, container, false)
        recyclerView = view.month_recycler_view

        val mLayoutManager: LinearLayoutManager = LinearLayoutManager(this.context)
        recyclerView.layoutManager = mLayoutManager

        recyclerView.addItemDecoration(
            MarginItemDecoration(
                12
            )
        )

        container!!.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container!!.removeView(`object` as LinearLayout)
    }
}