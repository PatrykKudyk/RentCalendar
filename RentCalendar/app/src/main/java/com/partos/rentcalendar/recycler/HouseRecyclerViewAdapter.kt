package com.partos.rentcalendar.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.partos.rentcalendar.R
import kotlinx.android.synthetic.main.cell_month.view.*

class HouseRecyclerViewAdapter(val isBig: Boolean) : RecyclerView.Adapter<HouseViewHolder>() {
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
        if (isBig) {
            holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.july) +
                    holder.view.context.getString(R.string.house_big)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorMain))
        } else {
            holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.july) +
                    holder.view.context.getString(R.string.house_small)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorOrange))
            holder.view.cell_month_text_name.setTextColor(holder.view.context.getColor(R.color.colorBackground))
        }
        setJulyDates(holder)
        setJulyClickListeners(holder)
    }

    private fun setJulyDates(holder: HouseViewHolder) {
        holder.view.cell_month_text_02.text = "1"
        holder.view.cell_month_text_03.text = "2"
        holder.view.cell_month_text_04.text = "3"
        holder.view.cell_month_text_05.text = "4"
        holder.view.cell_month_text_06.text = "5"
        holder.view.cell_month_text_10.text = "6"
        holder.view.cell_month_text_11.text = "7"
        holder.view.cell_month_text_12.text = "8"
        holder.view.cell_month_text_13.text = "9"
        holder.view.cell_month_text_14.text = "10"
        holder.view.cell_month_text_15.text = "11"
        holder.view.cell_month_text_16.text = "12"
        holder.view.cell_month_text_20.text = "13"
        holder.view.cell_month_text_21.text = "14"
        holder.view.cell_month_text_22.text = "15"
        holder.view.cell_month_text_23.text = "16"
        holder.view.cell_month_text_24.text = "17"
        holder.view.cell_month_text_25.text = "18"
        holder.view.cell_month_text_26.text = "19"
        holder.view.cell_month_text_30.text = "20"
        holder.view.cell_month_text_31.text = "21"
        holder.view.cell_month_text_32.text = "22"
        holder.view.cell_month_text_33.text = "23"
        holder.view.cell_month_text_34.text = "24"
        holder.view.cell_month_text_35.text = "25"
        holder.view.cell_month_text_36.text = "26"
        holder.view.cell_month_text_40.text = "27"
        holder.view.cell_month_text_41.text = "28"
        holder.view.cell_month_text_42.text = "29"
        holder.view.cell_month_text_43.text = "30"
        holder.view.cell_month_text_44.text = "31"
    }

    private fun setJulyClickListeners(holder: HouseViewHolder) {
        holder.view.cell_month_text_02.text = "1"
        holder.view.cell_month_text_03.text = "2"
        holder.view.cell_month_text_04.text = "3"
        holder.view.cell_month_text_05.text = "4"
        holder.view.cell_month_text_06.text = "5"
        holder.view.cell_month_text_10.text = "6"
        holder.view.cell_month_text_11.text = "7"
        holder.view.cell_month_text_12.text = "8"
        holder.view.cell_month_text_13.text = "9"
        holder.view.cell_month_text_14.text = "10"
        holder.view.cell_month_text_15.text = "11"
        holder.view.cell_month_text_16.text = "12"
        holder.view.cell_month_text_20.text = "13"
        holder.view.cell_month_text_21.text = "14"
        holder.view.cell_month_text_22.text = "15"
        holder.view.cell_month_text_23.text = "16"
        holder.view.cell_month_text_24.text = "17"
        holder.view.cell_month_text_25.text = "18"
        holder.view.cell_month_text_26.text = "19"
        holder.view.cell_month_text_30.text = "20"
        holder.view.cell_month_text_31.text = "21"
        holder.view.cell_month_text_32.text = "22"
        holder.view.cell_month_text_33.text = "23"
        holder.view.cell_month_text_34.text = "24"
        holder.view.cell_month_text_35.text = "25"
        holder.view.cell_month_text_36.text = "26"
        holder.view.cell_month_text_40.text = "27"
        holder.view.cell_month_text_41.text = "28"
        holder.view.cell_month_text_42.text = "29"
        holder.view.cell_month_text_43.text = "30"
        holder.view.cell_month_text_44.text = "31"
    }

    private fun handleAugust(holder: HouseViewHolder, position: Int) {
        if (isBig) {
            holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.august) +
                    holder.view.context.getString(R.string.house_big)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorMain))
        } else {
            holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.august) +
                    holder.view.context.getString(R.string.house_small)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorOrange))
            holder.view.cell_month_text_name.setTextColor(holder.view.context.getColor(R.color.colorBackground))
        }
        setAugustDates(holder)
    }

    private fun setAugustDates(holder: HouseViewHolder){
        holder.view.cell_month_text_05.text = "1"
        holder.view.cell_month_text_06.text = "2"
        holder.view.cell_month_text_10.text = "3"
        holder.view.cell_month_text_11.text = "4"
        holder.view.cell_month_text_12.text = "5"
        holder.view.cell_month_text_13.text = "6"
        holder.view.cell_month_text_14.text = "7"
        holder.view.cell_month_text_15.text = "8"
        holder.view.cell_month_text_16.text = "9"
        holder.view.cell_month_text_20.text = "10"
        holder.view.cell_month_text_21.text = "11"
        holder.view.cell_month_text_22.text = "12"
        holder.view.cell_month_text_23.text = "13"
        holder.view.cell_month_text_24.text = "14"
        holder.view.cell_month_text_25.text = "15"
        holder.view.cell_month_text_25.setTextColor(holder.view.context.getColor(R.color.colorRed))
        holder.view.cell_month_text_26.text = "16"
        holder.view.cell_month_text_30.text = "17"
        holder.view.cell_month_text_31.text = "18"
        holder.view.cell_month_text_32.text = "19"
        holder.view.cell_month_text_33.text = "20"
        holder.view.cell_month_text_34.text = "21"
        holder.view.cell_month_text_35.text = "22"
        holder.view.cell_month_text_36.text = "23"
        holder.view.cell_month_text_40.text = "24"
        holder.view.cell_month_text_41.text = "25"
        holder.view.cell_month_text_42.text = "26"
        holder.view.cell_month_text_43.text = "27"
        holder.view.cell_month_text_44.text = "28"
        holder.view.cell_month_text_45.text = "29"
        holder.view.cell_month_text_46.text = "30"
        holder.view.cell_month_text_50.text = "31"
    }

    private fun handleSeptember(holder: HouseViewHolder, position: Int) {
        if (isBig) {
            holder.view.cell_month_text_name.text =
                holder.view.context.getString(R.string.september) +
                        holder.view.context.getString(R.string.house_big)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorMain))
        } else {
            holder.view.cell_month_text_name.text =
                holder.view.context.getString(R.string.september) +
                        holder.view.context.getString(R.string.house_small)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorOrange))
            holder.view.cell_month_text_name.setTextColor(holder.view.context.getColor(R.color.colorBackground))
        }
        setSeptemberDates(holder)
    }

    private fun setSeptemberDates(holder: HouseViewHolder){
        holder.view.cell_month_text_01.text = "1"
        holder.view.cell_month_text_02.text = "2"
        holder.view.cell_month_text_03.text = "3"
        holder.view.cell_month_text_04.text = "4"
        holder.view.cell_month_text_05.text = "5"
        holder.view.cell_month_text_06.text = "6"
        holder.view.cell_month_text_10.text = "7"
        holder.view.cell_month_text_11.text = "8"
        holder.view.cell_month_text_12.text = "9"
        holder.view.cell_month_text_13.text = "10"
        holder.view.cell_month_text_14.text = "11"
        holder.view.cell_month_text_15.text = "12"
        holder.view.cell_month_text_16.text = "13"
        holder.view.cell_month_text_20.text = "14"
        holder.view.cell_month_text_21.text = "15"
        holder.view.cell_month_text_22.text = "16"
        holder.view.cell_month_text_23.text = "17"
        holder.view.cell_month_text_24.text = "18"
        holder.view.cell_month_text_25.text = "19"
        holder.view.cell_month_text_26.text = "20"
        holder.view.cell_month_text_30.text = "21"
        holder.view.cell_month_text_31.text = "22"
        holder.view.cell_month_text_32.text = "23"
        holder.view.cell_month_text_33.text = "24"
        holder.view.cell_month_text_34.text = "25"
        holder.view.cell_month_text_35.text = "26"
        holder.view.cell_month_text_36.text = "26"
        holder.view.cell_month_text_40.text = "28"
        holder.view.cell_month_text_41.text = "29"
        holder.view.cell_month_text_42.text = "30"
    }
}

class HouseViewHolder(val view: View) : RecyclerView.ViewHolder(view)