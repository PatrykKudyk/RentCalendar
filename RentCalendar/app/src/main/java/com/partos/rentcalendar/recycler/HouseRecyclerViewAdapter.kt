package com.partos.rentcalendar.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.partos.rentcalendar.R
import kotlinx.android.synthetic.main.cell_month.view.*

class HouseRecyclerViewAdapter() : RecyclerView.Adapter<HouseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HouseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val rowCell = layoutInflater.inflate(R.layout.cell_month, parent, false)
        return HouseViewHolder(rowCell)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: HouseViewHolder, position: Int) {
        if (position == 0) {
            handleJuly(holder, position)
        } else if (position == 1) {
            handleAugust(holder, position)
        } else if (position == 2) {
            handleSeptember(holder, position)
        }
    }

    private fun handleJuly(holder: HouseViewHolder, position: Int) {
        holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.july)
    }

    private fun handleAugust(holder: HouseViewHolder, position: Int) {
        holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.august)
    }

    private fun handleSeptember(holder: HouseViewHolder, position: Int) {
        holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.september)
    }

}

class HouseViewHolder(val view: View) : RecyclerView.ViewHolder(view)