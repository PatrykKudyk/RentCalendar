package com.partos.rentcalendar.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.partos.rentcalendar.R

class HouseRecyclerViewAdapter() : RecyclerView.Adapter<HouseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HouseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val rowCell = layoutInflater.inflate(R.layout.cell_month, parent, false)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: HouseViewHolder, position: Int) {
        if (position == 0) {
            handleJuly()
        } else if (position == 1) {
            handleAugust()
        } else if (position == 2) {
            handleSeptember()
        }
    }

    private fun handleJuly() {
        
    }

    private fun handleAugust() {

    }

    private fun handleSeptember() {

    }

}

class HouseViewHolder(val view: View) : RecyclerView.ViewHolder(view)