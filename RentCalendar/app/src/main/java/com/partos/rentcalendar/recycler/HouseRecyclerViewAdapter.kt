package com.partos.rentcalendar.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.partos.rentcalendar.R
import com.partos.rentcalendar.db.DataBaseHelper
import com.partos.rentcalendar.models.Day
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
            handleJuly(holder)
        } else if (position == 1) {
            handleAugust(holder)
        } else if (position == 2) {
            handleSeptember(holder)
        }
    }

    private fun handleJuly(holder: HouseViewHolder) {
        if (isBig) {
            holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.july) +
                    holder.view.context.getString(R.string.house_big)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorMain))
            setJulyDatesBig(holder)
            setJulyClickListenersBig(holder)
        } else {
            holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.july) +
                    holder.view.context.getString(R.string.house_small)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorOrange))
            holder.view.cell_month_text_name.setTextColor(holder.view.context.getColor(R.color.colorBackground))
            setJulyDatesSmall(holder)
            setJulyClickListenersSmall(holder)
        }
    }


    private fun setSmall(view: View, day: Day) {
        if (day.status == 0) {
            view.background = null
        } else if (day.status == 1) {
            view.background = view.context.getDrawable(R.drawable.small_start)
        } else if (day.status == 2) {
            view.background = view.context.getDrawable(R.drawable.small_normal)
        } else if (day.status == 3) {
            view.background = view.context.getDrawable(R.drawable.small_end)
        }
    }

    private fun setSmallListener(view: View, day: Day) {
        val dbHelper = DataBaseHelper(view.context)
        if (day.status == 0) {
            view.background = view.context.getDrawable(R.drawable.small_start)
            dbHelper.updateSmall(Day(day.id, day.day, day.month, 1))
        } else if (day.status == 1) {
            view.background = view.context.getDrawable(R.drawable.small_normal)
            dbHelper.updateSmall(Day(day.id, day.day, day.month, 2))
        } else if (day.status == 2) {
            view.background = view.context.getDrawable(R.drawable.small_end)
            dbHelper.updateSmall(Day(day.id, day.day, day.month, 3))
        } else if (day.status == 3) {
            view.background = null
            dbHelper.updateSmall(Day(day.id, day.day, day.month, 0))
        }
    }

    private fun setBig(view: View, day: Day) {
        if (day.status == 0) {
            view.background = null
        } else if (day.status == 1) {
            view.background = view.context.getDrawable(R.drawable.big_start)
        } else if (day.status == 2) {
            view.background = view.context.getDrawable(R.drawable.big_normal)
        } else if (day.status == 3) {
            view.background = view.context.getDrawable(R.drawable.big_end)
        }
    }

    private fun setBigListener(view: View, day: Day) {
        val dbHelper = DataBaseHelper(view.context)
        if (day.status == 0) {
            view.background = view.context.getDrawable(R.drawable.big_start)
            dbHelper.updateBig(Day(day.id, day.day, day.month, 1))
        } else if (day.status == 1) {
            view.background = view.context.getDrawable(R.drawable.big_normal)
            dbHelper.updateBig(Day(day.id, day.day, day.month, 2))
        } else if (day.status == 2) {
            view.background = view.context.getDrawable(R.drawable.big_end)
            dbHelper.updateBig(Day(day.id, day.day, day.month, 3))
        } else if (day.status == 3) {
            view.background = null
            dbHelper.updateBig(Day(day.id, day.day, day.month, 0))
        }
    }

    private fun setJulyDatesSmall(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_02.text = "1"
        setSmall(holder.view.cell_month_text_02, dbHelper.getSmall(1, 1))
        holder.view.cell_month_text_03.text = "2"
        setSmall(holder.view.cell_month_text_03, dbHelper.getSmall(2, 1))
        holder.view.cell_month_text_04.text = "3"
        setSmall(holder.view.cell_month_text_04, dbHelper.getSmall(3, 1))
        holder.view.cell_month_text_05.text = "4"
        setSmall(holder.view.cell_month_text_05, dbHelper.getSmall(4, 1))
        holder.view.cell_month_text_06.text = "5"
        setSmall(holder.view.cell_month_text_06, dbHelper.getSmall(5, 1))
        holder.view.cell_month_text_10.text = "6"
        setSmall(holder.view.cell_month_text_10, dbHelper.getSmall(6, 1))
        holder.view.cell_month_text_11.text = "7"
        setSmall(holder.view.cell_month_text_11, dbHelper.getSmall(7, 1))
        holder.view.cell_month_text_12.text = "8"
        setSmall(holder.view.cell_month_text_12, dbHelper.getSmall(8, 1))
        holder.view.cell_month_text_13.text = "9"
        setSmall(holder.view.cell_month_text_13, dbHelper.getSmall(9, 1))
        holder.view.cell_month_text_14.text = "10"
        setSmall(holder.view.cell_month_text_14, dbHelper.getSmall(10, 1))
        holder.view.cell_month_text_15.text = "11"
        setSmall(holder.view.cell_month_text_15, dbHelper.getSmall(11, 1))
        holder.view.cell_month_text_16.text = "12"
        setSmall(holder.view.cell_month_text_16, dbHelper.getSmall(12, 1))
        holder.view.cell_month_text_20.text = "13"
        setSmall(holder.view.cell_month_text_20, dbHelper.getSmall(13, 1))
        holder.view.cell_month_text_21.text = "14"
        setSmall(holder.view.cell_month_text_21, dbHelper.getSmall(14, 1))
        holder.view.cell_month_text_22.text = "15"
        setSmall(holder.view.cell_month_text_22, dbHelper.getSmall(15, 1))
        holder.view.cell_month_text_23.text = "16"
        setSmall(holder.view.cell_month_text_23, dbHelper.getSmall(16, 1))
        holder.view.cell_month_text_24.text = "17"
        setSmall(holder.view.cell_month_text_24, dbHelper.getSmall(17, 1))
        holder.view.cell_month_text_25.text = "18"
        setSmall(holder.view.cell_month_text_25, dbHelper.getSmall(18, 1))
        holder.view.cell_month_text_26.text = "19"
        setSmall(holder.view.cell_month_text_26, dbHelper.getSmall(19, 1))
        holder.view.cell_month_text_30.text = "20"
        setSmall(holder.view.cell_month_text_30, dbHelper.getSmall(20, 1))
        holder.view.cell_month_text_31.text = "21"
        setSmall(holder.view.cell_month_text_31, dbHelper.getSmall(21, 1))
        holder.view.cell_month_text_32.text = "22"
        setSmall(holder.view.cell_month_text_32, dbHelper.getSmall(22, 1))
        holder.view.cell_month_text_33.text = "23"
        setSmall(holder.view.cell_month_text_33, dbHelper.getSmall(23, 1))
        holder.view.cell_month_text_34.text = "24"
        setSmall(holder.view.cell_month_text_34, dbHelper.getSmall(24, 1))
        holder.view.cell_month_text_35.text = "25"
        setSmall(holder.view.cell_month_text_35, dbHelper.getSmall(25, 1))
        holder.view.cell_month_text_36.text = "26"
        setSmall(holder.view.cell_month_text_36, dbHelper.getSmall(26, 1))
        holder.view.cell_month_text_40.text = "27"
        setSmall(holder.view.cell_month_text_40, dbHelper.getSmall(27, 1))
        holder.view.cell_month_text_41.text = "28"
        setSmall(holder.view.cell_month_text_41, dbHelper.getSmall(28, 1))
        holder.view.cell_month_text_42.text = "29"
        setSmall(holder.view.cell_month_text_42, dbHelper.getSmall(29, 1))
        holder.view.cell_month_text_43.text = "30"
        setSmall(holder.view.cell_month_text_43, dbHelper.getSmall(30, 1))
        holder.view.cell_month_text_44.text = "31"
        setSmall(holder.view.cell_month_text_44, dbHelper.getSmall(31, 1))
    }

    private fun setJulyClickListenersSmall(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_02.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_02, dbHelper.getSmall(1, 1))
        }
        holder.view.cell_month_text_03.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_03, dbHelper.getSmall(2, 1))
        }
        holder.view.cell_month_text_04.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_04, dbHelper.getSmall(3, 1))
        }
        holder.view.cell_month_text_05.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_05, dbHelper.getSmall(4, 1))
        }
        holder.view.cell_month_text_06.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_06, dbHelper.getSmall(5, 1))
        }
        holder.view.cell_month_text_10.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_10, dbHelper.getSmall(6, 1))
        }
        holder.view.cell_month_text_11.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_11, dbHelper.getSmall(7, 1))
        }
        holder.view.cell_month_text_12.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_12, dbHelper.getSmall(8, 1))
        }
        holder.view.cell_month_text_13.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_13, dbHelper.getSmall(9, 1))
        }
        holder.view.cell_month_text_14.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_14, dbHelper.getSmall(10, 1))
        }
        holder.view.cell_month_text_15.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_15, dbHelper.getSmall(11, 1))
        }
        holder.view.cell_month_text_16.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_16, dbHelper.getSmall(12, 1))
        }
        holder.view.cell_month_text_20.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_20, dbHelper.getSmall(13, 1))
        }
        holder.view.cell_month_text_21.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_21, dbHelper.getSmall(14, 1))
        }
        holder.view.cell_month_text_22.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_22, dbHelper.getSmall(15, 1))
        }
        holder.view.cell_month_text_23.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_23, dbHelper.getSmall(16, 1))
        }
        holder.view.cell_month_text_24.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_24, dbHelper.getSmall(17, 1))
        }
        holder.view.cell_month_text_25.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_25, dbHelper.getSmall(18, 1))
        }
        holder.view.cell_month_text_26.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_26, dbHelper.getSmall(19, 1))
        }
        holder.view.cell_month_text_30.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_30, dbHelper.getSmall(20, 1))
        }
        holder.view.cell_month_text_31.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_31, dbHelper.getSmall(21, 1))
        }
        holder.view.cell_month_text_32.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_32, dbHelper.getSmall(22, 1))
        }
        holder.view.cell_month_text_33.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_33, dbHelper.getSmall(23, 1))
        }
        holder.view.cell_month_text_34.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_34, dbHelper.getSmall(24, 1))
        }
        holder.view.cell_month_text_35.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_35, dbHelper.getSmall(25, 1))
        }
        holder.view.cell_month_text_36.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_36, dbHelper.getSmall(26, 1))
        }
        holder.view.cell_month_text_40.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_40, dbHelper.getSmall(27, 1))
        }
        holder.view.cell_month_text_41.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_41, dbHelper.getSmall(28, 1))
        }
        holder.view.cell_month_text_42.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_42, dbHelper.getSmall(29, 1))
        }
        holder.view.cell_month_text_43.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_43, dbHelper.getSmall(30, 1))
        }
        holder.view.cell_month_text_44.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_44, dbHelper.getSmall(31, 1))
        }
    }

    private fun setJulyDatesBig(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_02.text = "1"
        setBig(holder.view.cell_month_text_02, dbHelper.getBig(1, 1))
        holder.view.cell_month_text_03.text = "2"
        setBig(holder.view.cell_month_text_03, dbHelper.getBig(2, 1))
        holder.view.cell_month_text_04.text = "3"
        setBig(holder.view.cell_month_text_04, dbHelper.getBig(3, 1))
        holder.view.cell_month_text_05.text = "4"
        setBig(holder.view.cell_month_text_05, dbHelper.getBig(4, 1))
        holder.view.cell_month_text_06.text = "5"
        setBig(holder.view.cell_month_text_06, dbHelper.getBig(5, 1))
        holder.view.cell_month_text_10.text = "6"
        setBig(holder.view.cell_month_text_10, dbHelper.getBig(6, 1))
        holder.view.cell_month_text_11.text = "7"
        setBig(holder.view.cell_month_text_11, dbHelper.getBig(7, 1))
        holder.view.cell_month_text_12.text = "8"
        setBig(holder.view.cell_month_text_12, dbHelper.getBig(8, 1))
        holder.view.cell_month_text_13.text = "9"
        setBig(holder.view.cell_month_text_13, dbHelper.getBig(9, 1))
        holder.view.cell_month_text_14.text = "10"
        setBig(holder.view.cell_month_text_14, dbHelper.getBig(10, 1))
        holder.view.cell_month_text_15.text = "11"
        setBig(holder.view.cell_month_text_15, dbHelper.getBig(11, 1))
        holder.view.cell_month_text_16.text = "12"
        setBig(holder.view.cell_month_text_16, dbHelper.getBig(12, 1))
        holder.view.cell_month_text_20.text = "13"
        setBig(holder.view.cell_month_text_20, dbHelper.getBig(13, 1))
        holder.view.cell_month_text_21.text = "14"
        setBig(holder.view.cell_month_text_21, dbHelper.getBig(14, 1))
        holder.view.cell_month_text_22.text = "15"
        setBig(holder.view.cell_month_text_22, dbHelper.getBig(15, 1))
        holder.view.cell_month_text_23.text = "16"
        setBig(holder.view.cell_month_text_23, dbHelper.getBig(16, 1))
        holder.view.cell_month_text_24.text = "17"
        setBig(holder.view.cell_month_text_24, dbHelper.getBig(17, 1))
        holder.view.cell_month_text_25.text = "18"
        setBig(holder.view.cell_month_text_25, dbHelper.getBig(18, 1))
        holder.view.cell_month_text_26.text = "19"
        setBig(holder.view.cell_month_text_26, dbHelper.getBig(19, 1))
        holder.view.cell_month_text_30.text = "20"
        setBig(holder.view.cell_month_text_30, dbHelper.getBig(20, 1))
        holder.view.cell_month_text_31.text = "21"
        setBig(holder.view.cell_month_text_31, dbHelper.getBig(21, 1))
        holder.view.cell_month_text_32.text = "22"
        setBig(holder.view.cell_month_text_32, dbHelper.getBig(22, 1))
        holder.view.cell_month_text_33.text = "23"
        setBig(holder.view.cell_month_text_33, dbHelper.getBig(23, 1))
        holder.view.cell_month_text_34.text = "24"
        setBig(holder.view.cell_month_text_34, dbHelper.getBig(24, 1))
        holder.view.cell_month_text_35.text = "25"
        setBig(holder.view.cell_month_text_35, dbHelper.getBig(25, 1))
        holder.view.cell_month_text_36.text = "26"
        setBig(holder.view.cell_month_text_36, dbHelper.getBig(26, 1))
        holder.view.cell_month_text_40.text = "27"
        setBig(holder.view.cell_month_text_40, dbHelper.getBig(27, 1))
        holder.view.cell_month_text_41.text = "28"
        setBig(holder.view.cell_month_text_41, dbHelper.getBig(28, 1))
        holder.view.cell_month_text_42.text = "29"
        setBig(holder.view.cell_month_text_42, dbHelper.getBig(29, 1))
        holder.view.cell_month_text_43.text = "30"
        setBig(holder.view.cell_month_text_43, dbHelper.getBig(30, 1))
        holder.view.cell_month_text_44.text = "31"
        setBig(holder.view.cell_month_text_44, dbHelper.getBig(31, 1))
    }

    private fun setJulyClickListenersBig(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_02.setOnClickListener {
            setBigListener(holder.view.cell_month_text_02, dbHelper.getBig(1, 1))
        }
        holder.view.cell_month_text_03.setOnClickListener {
            setBigListener(holder.view.cell_month_text_03, dbHelper.getBig(2, 1))
        }
        holder.view.cell_month_text_04.setOnClickListener {
            setBigListener(holder.view.cell_month_text_04, dbHelper.getBig(3, 1))
        }
        holder.view.cell_month_text_05.setOnClickListener {
            setBigListener(holder.view.cell_month_text_05, dbHelper.getBig(4, 1))
        }
        holder.view.cell_month_text_06.setOnClickListener {
            setBigListener(holder.view.cell_month_text_06, dbHelper.getBig(5, 1))
        }
        holder.view.cell_month_text_10.setOnClickListener {
            setBigListener(holder.view.cell_month_text_10, dbHelper.getBig(6, 1))
        }
        holder.view.cell_month_text_11.setOnClickListener {
            setBigListener(holder.view.cell_month_text_11, dbHelper.getBig(7, 1))
        }
        holder.view.cell_month_text_12.setOnClickListener {
            setBigListener(holder.view.cell_month_text_12, dbHelper.getBig(8, 1))
        }
        holder.view.cell_month_text_13.setOnClickListener {
            setBigListener(holder.view.cell_month_text_13, dbHelper.getBig(9, 1))
        }
        holder.view.cell_month_text_14.setOnClickListener {
            setBigListener(holder.view.cell_month_text_14, dbHelper.getBig(10, 1))
        }
        holder.view.cell_month_text_15.setOnClickListener {
            setBigListener(holder.view.cell_month_text_15, dbHelper.getBig(11, 1))
        }
        holder.view.cell_month_text_16.setOnClickListener {
            setBigListener(holder.view.cell_month_text_16, dbHelper.getBig(12, 1))
        }
        holder.view.cell_month_text_20.setOnClickListener {
            setBigListener(holder.view.cell_month_text_20, dbHelper.getBig(13, 1))
        }
        holder.view.cell_month_text_21.setOnClickListener {
            setBigListener(holder.view.cell_month_text_21, dbHelper.getBig(14, 1))
        }
        holder.view.cell_month_text_22.setOnClickListener {
            setBigListener(holder.view.cell_month_text_22, dbHelper.getBig(15, 1))
        }
        holder.view.cell_month_text_23.setOnClickListener {
            setBigListener(holder.view.cell_month_text_23, dbHelper.getBig(16, 1))
        }
        holder.view.cell_month_text_24.setOnClickListener {
            setBigListener(holder.view.cell_month_text_24, dbHelper.getBig(17, 1))
        }
        holder.view.cell_month_text_25.setOnClickListener {
            setBigListener(holder.view.cell_month_text_25, dbHelper.getBig(18, 1))
        }
        holder.view.cell_month_text_26.setOnClickListener {
            setBigListener(holder.view.cell_month_text_26, dbHelper.getBig(19, 1))
        }
        holder.view.cell_month_text_30.setOnClickListener {
            setBigListener(holder.view.cell_month_text_30, dbHelper.getBig(20, 1))
        }
        holder.view.cell_month_text_31.setOnClickListener {
            setBigListener(holder.view.cell_month_text_31, dbHelper.getBig(21, 1))
        }
        holder.view.cell_month_text_32.setOnClickListener {
            setBigListener(holder.view.cell_month_text_32, dbHelper.getBig(22, 1))
        }
        holder.view.cell_month_text_33.setOnClickListener {
            setBigListener(holder.view.cell_month_text_33, dbHelper.getBig(23, 1))
        }
        holder.view.cell_month_text_34.setOnClickListener {
            setBigListener(holder.view.cell_month_text_34, dbHelper.getBig(24, 1))
        }
        holder.view.cell_month_text_35.setOnClickListener {
            setBigListener(holder.view.cell_month_text_35, dbHelper.getBig(25, 1))
        }
        holder.view.cell_month_text_36.setOnClickListener {
            setBigListener(holder.view.cell_month_text_36, dbHelper.getBig(26, 1))
        }
        holder.view.cell_month_text_40.setOnClickListener {
            setBigListener(holder.view.cell_month_text_40, dbHelper.getBig(27, 1))
        }
        holder.view.cell_month_text_41.setOnClickListener {
            setBigListener(holder.view.cell_month_text_41, dbHelper.getBig(28, 1))
        }
        holder.view.cell_month_text_42.setOnClickListener {
            setBigListener(holder.view.cell_month_text_42, dbHelper.getBig(29, 1))
        }
        holder.view.cell_month_text_43.setOnClickListener {
            setBigListener(holder.view.cell_month_text_43, dbHelper.getBig(30, 1))
        }
        holder.view.cell_month_text_44.setOnClickListener {
            setBigListener(holder.view.cell_month_text_44, dbHelper.getBig(31, 1))
        }
    }

    private fun handleAugust(holder: HouseViewHolder) {
        if (isBig) {
            holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.august) +
                    holder.view.context.getString(R.string.house_big)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorMain))
            setAugustDatesBig(holder)
            setAugustClickListenersBig(holder)
        } else {
            holder.view.cell_month_text_name.text = holder.view.context.getString(R.string.august) +
                    holder.view.context.getString(R.string.house_small)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorOrange))
            holder.view.cell_month_text_name.setTextColor(holder.view.context.getColor(R.color.colorBackground))
            setAugustDatesSmall(holder)
            setAugustClickListenersSmall(holder)
        }
    }

    private fun setAugustDatesSmall(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_05.text = "1"
        setSmall(holder.view.cell_month_text_05, dbHelper.getSmall(1, 2))
        holder.view.cell_month_text_06.text = "2"
        setSmall(holder.view.cell_month_text_06, dbHelper.getSmall(2, 2))
        holder.view.cell_month_text_10.text = "3"
        setSmall(holder.view.cell_month_text_10, dbHelper.getSmall(3, 2))
        holder.view.cell_month_text_11.text = "4"
        setSmall(holder.view.cell_month_text_11, dbHelper.getSmall(4, 2))
        holder.view.cell_month_text_12.text = "5"
        setSmall(holder.view.cell_month_text_12, dbHelper.getSmall(5, 2))
        holder.view.cell_month_text_13.text = "6"
        setSmall(holder.view.cell_month_text_13, dbHelper.getSmall(6, 2))
        holder.view.cell_month_text_14.text = "7"
        setSmall(holder.view.cell_month_text_14, dbHelper.getSmall(7, 2))
        holder.view.cell_month_text_15.text = "8"
        setSmall(holder.view.cell_month_text_15, dbHelper.getSmall(8, 2))
        holder.view.cell_month_text_16.text = "9"
        setSmall(holder.view.cell_month_text_16, dbHelper.getSmall(9, 2))
        holder.view.cell_month_text_20.text = "10"
        setSmall(holder.view.cell_month_text_20, dbHelper.getSmall(10, 2))
        holder.view.cell_month_text_21.text = "11"
        setSmall(holder.view.cell_month_text_21, dbHelper.getSmall(11, 2))
        holder.view.cell_month_text_22.text = "12"
        setSmall(holder.view.cell_month_text_22, dbHelper.getSmall(12, 2))
        holder.view.cell_month_text_23.text = "13"
        setSmall(holder.view.cell_month_text_23, dbHelper.getSmall(13, 2))
        holder.view.cell_month_text_24.text = "14"
        setSmall(holder.view.cell_month_text_24, dbHelper.getSmall(14, 2))
        holder.view.cell_month_text_25.text = "15"
        setSmall(holder.view.cell_month_text_25, dbHelper.getSmall(15, 2))
        holder.view.cell_month_text_25.setTextColor(holder.view.context.getColor(R.color.colorRed))
        holder.view.cell_month_text_26.text = "16"
        setSmall(holder.view.cell_month_text_26, dbHelper.getSmall(16, 2))
        holder.view.cell_month_text_30.text = "17"
        setSmall(holder.view.cell_month_text_30, dbHelper.getSmall(17, 2))
        holder.view.cell_month_text_31.text = "18"
        setSmall(holder.view.cell_month_text_31, dbHelper.getSmall(18, 2))
        holder.view.cell_month_text_32.text = "19"
        setSmall(holder.view.cell_month_text_32, dbHelper.getSmall(19, 2))
        holder.view.cell_month_text_33.text = "20"
        setSmall(holder.view.cell_month_text_33, dbHelper.getSmall(20, 2))
        holder.view.cell_month_text_34.text = "21"
        setSmall(holder.view.cell_month_text_34, dbHelper.getSmall(21, 2))
        holder.view.cell_month_text_35.text = "22"
        setSmall(holder.view.cell_month_text_35, dbHelper.getSmall(22, 2))
        holder.view.cell_month_text_36.text = "23"
        setSmall(holder.view.cell_month_text_36, dbHelper.getSmall(23, 2))
        holder.view.cell_month_text_40.text = "24"
        setSmall(holder.view.cell_month_text_40, dbHelper.getSmall(24, 2))
        holder.view.cell_month_text_41.text = "25"
        setSmall(holder.view.cell_month_text_41, dbHelper.getSmall(25, 2))
        holder.view.cell_month_text_42.text = "26"
        setSmall(holder.view.cell_month_text_42, dbHelper.getSmall(26, 2))
        holder.view.cell_month_text_43.text = "27"
        setSmall(holder.view.cell_month_text_43, dbHelper.getSmall(27, 2))
        holder.view.cell_month_text_44.text = "28"
        setSmall(holder.view.cell_month_text_44, dbHelper.getSmall(28, 2))
        holder.view.cell_month_text_45.text = "29"
        setSmall(holder.view.cell_month_text_45, dbHelper.getSmall(29, 2))
        holder.view.cell_month_text_46.text = "30"
        setSmall(holder.view.cell_month_text_46, dbHelper.getSmall(30, 2))
        holder.view.cell_month_text_50.text = "31"
        setSmall(holder.view.cell_month_text_50, dbHelper.getSmall(31, 2))
    }

    private fun setAugustClickListenersSmall(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_05.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_05, dbHelper.getSmall(1, 2))
        }
        holder.view.cell_month_text_06.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_06, dbHelper.getSmall(2, 2))
        }
        holder.view.cell_month_text_10.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_10, dbHelper.getSmall(3, 2))
        }
        holder.view.cell_month_text_11.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_11, dbHelper.getSmall(4, 2))
        }
        holder.view.cell_month_text_12.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_12, dbHelper.getSmall(5, 2))
        }
        holder.view.cell_month_text_13.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_13, dbHelper.getSmall(6, 2))
        }
        holder.view.cell_month_text_14.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_14, dbHelper.getSmall(7, 2))
        }
        holder.view.cell_month_text_15.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_15, dbHelper.getSmall(8, 2))
        }
        holder.view.cell_month_text_16.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_16, dbHelper.getSmall(9, 2))
        }
        holder.view.cell_month_text_20.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_20, dbHelper.getSmall(10, 2))
        }
        holder.view.cell_month_text_21.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_21, dbHelper.getSmall(11, 2))
        }
        holder.view.cell_month_text_22.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_22, dbHelper.getSmall(12, 2))
        }
        holder.view.cell_month_text_23.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_23, dbHelper.getSmall(13, 2))
        }
        holder.view.cell_month_text_24.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_24, dbHelper.getSmall(14, 2))
        }
        holder.view.cell_month_text_25.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_25, dbHelper.getSmall(15, 2))
        }
        holder.view.cell_month_text_26.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_26, dbHelper.getSmall(16, 2))
        }
        holder.view.cell_month_text_30.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_30, dbHelper.getSmall(17, 2))
        }
        holder.view.cell_month_text_31.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_31, dbHelper.getSmall(18, 2))
        }
        holder.view.cell_month_text_32.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_32, dbHelper.getSmall(19, 2))
        }
        holder.view.cell_month_text_33.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_33, dbHelper.getSmall(20, 2))
        }
        holder.view.cell_month_text_34.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_34, dbHelper.getSmall(21, 2))
        }
        holder.view.cell_month_text_35.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_35, dbHelper.getSmall(22, 2))
        }
        holder.view.cell_month_text_36.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_36, dbHelper.getSmall(23, 2))
        }
        holder.view.cell_month_text_40.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_40, dbHelper.getSmall(24, 2))
        }
        holder.view.cell_month_text_41.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_41, dbHelper.getSmall(25, 2))
        }
        holder.view.cell_month_text_42.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_42, dbHelper.getSmall(26, 2))
        }
        holder.view.cell_month_text_43.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_43, dbHelper.getSmall(27, 2))
        }
        holder.view.cell_month_text_44.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_44, dbHelper.getSmall(28, 2))
        }
        holder.view.cell_month_text_45.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_45, dbHelper.getSmall(29, 2))
        }
        holder.view.cell_month_text_46.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_46, dbHelper.getSmall(30, 2))
        }
        holder.view.cell_month_text_50.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_50, dbHelper.getSmall(31, 2))
        }
    }

    private fun setAugustDatesBig(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_05.text = "1"
        setBig(holder.view.cell_month_text_05, dbHelper.getBig(1, 2))
        holder.view.cell_month_text_06.text = "2"
        setBig(holder.view.cell_month_text_06, dbHelper.getBig(2, 2))
        holder.view.cell_month_text_10.text = "3"
        setBig(holder.view.cell_month_text_10, dbHelper.getBig(3, 2))
        holder.view.cell_month_text_11.text = "4"
        setBig(holder.view.cell_month_text_11, dbHelper.getBig(4, 2))
        holder.view.cell_month_text_12.text = "5"
        setBig(holder.view.cell_month_text_12, dbHelper.getBig(5, 2))
        holder.view.cell_month_text_13.text = "6"
        setBig(holder.view.cell_month_text_13, dbHelper.getBig(6, 2))
        holder.view.cell_month_text_14.text = "7"
        setBig(holder.view.cell_month_text_14, dbHelper.getBig(7, 2))
        holder.view.cell_month_text_15.text = "8"
        setBig(holder.view.cell_month_text_15, dbHelper.getBig(8, 2))
        holder.view.cell_month_text_16.text = "9"
        setBig(holder.view.cell_month_text_16, dbHelper.getBig(9, 2))
        holder.view.cell_month_text_20.text = "10"
        setBig(holder.view.cell_month_text_20, dbHelper.getBig(10, 2))
        holder.view.cell_month_text_21.text = "11"
        setBig(holder.view.cell_month_text_21, dbHelper.getBig(11, 2))
        holder.view.cell_month_text_22.text = "12"
        setBig(holder.view.cell_month_text_22, dbHelper.getBig(12, 2))
        holder.view.cell_month_text_23.text = "13"
        setBig(holder.view.cell_month_text_23, dbHelper.getBig(13, 2))
        holder.view.cell_month_text_24.text = "14"
        setBig(holder.view.cell_month_text_24, dbHelper.getBig(14, 2))
        holder.view.cell_month_text_25.text = "15"
        setBig(holder.view.cell_month_text_25, dbHelper.getBig(15, 2))
        holder.view.cell_month_text_25.setTextColor(holder.view.context.getColor(R.color.colorRed))
        holder.view.cell_month_text_26.text = "16"
        setBig(holder.view.cell_month_text_26, dbHelper.getBig(16, 2))
        holder.view.cell_month_text_30.text = "17"
        setBig(holder.view.cell_month_text_30, dbHelper.getBig(17, 2))
        holder.view.cell_month_text_31.text = "18"
        setBig(holder.view.cell_month_text_31, dbHelper.getBig(18, 2))
        holder.view.cell_month_text_32.text = "19"
        setBig(holder.view.cell_month_text_32, dbHelper.getBig(19, 2))
        holder.view.cell_month_text_33.text = "20"
        setBig(holder.view.cell_month_text_33, dbHelper.getBig(20, 2))
        holder.view.cell_month_text_34.text = "21"
        setBig(holder.view.cell_month_text_34, dbHelper.getBig(21, 2))
        holder.view.cell_month_text_35.text = "22"
        setBig(holder.view.cell_month_text_35, dbHelper.getBig(22, 2))
        holder.view.cell_month_text_36.text = "23"
        setBig(holder.view.cell_month_text_36, dbHelper.getBig(23, 2))
        holder.view.cell_month_text_40.text = "24"
        setBig(holder.view.cell_month_text_40, dbHelper.getBig(24, 2))
        holder.view.cell_month_text_41.text = "25"
        setBig(holder.view.cell_month_text_41, dbHelper.getBig(25, 2))
        holder.view.cell_month_text_42.text = "26"
        setBig(holder.view.cell_month_text_42, dbHelper.getBig(26, 2))
        holder.view.cell_month_text_43.text = "27"
        setBig(holder.view.cell_month_text_43, dbHelper.getBig(27, 2))
        holder.view.cell_month_text_44.text = "28"
        setBig(holder.view.cell_month_text_44, dbHelper.getBig(28, 2))
        holder.view.cell_month_text_45.text = "29"
        setBig(holder.view.cell_month_text_45, dbHelper.getBig(29, 2))
        holder.view.cell_month_text_46.text = "30"
        setBig(holder.view.cell_month_text_46, dbHelper.getBig(30, 2))
        holder.view.cell_month_text_50.text = "31"
        setBig(holder.view.cell_month_text_50, dbHelper.getBig(31, 2))
    }

    private fun setAugustClickListenersBig(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_05.setOnClickListener {
            setBigListener(holder.view.cell_month_text_05, dbHelper.getBig(1, 2))
        }
        holder.view.cell_month_text_06.setOnClickListener {
            setBigListener(holder.view.cell_month_text_06, dbHelper.getBig(2, 2))
        }
        holder.view.cell_month_text_10.setOnClickListener {
            setBigListener(holder.view.cell_month_text_10, dbHelper.getBig(3, 2))
        }
        holder.view.cell_month_text_11.setOnClickListener {
            setBigListener(holder.view.cell_month_text_11, dbHelper.getBig(4, 2))
        }
        holder.view.cell_month_text_12.setOnClickListener {
            setBigListener(holder.view.cell_month_text_12, dbHelper.getBig(5, 2))
        }
        holder.view.cell_month_text_13.setOnClickListener {
            setBigListener(holder.view.cell_month_text_13, dbHelper.getBig(6, 2))
        }
        holder.view.cell_month_text_14.setOnClickListener {
            setBigListener(holder.view.cell_month_text_14, dbHelper.getBig(7, 2))
        }
        holder.view.cell_month_text_15.setOnClickListener {
            setBigListener(holder.view.cell_month_text_15, dbHelper.getBig(8, 2))
        }
        holder.view.cell_month_text_16.setOnClickListener {
            setBigListener(holder.view.cell_month_text_16, dbHelper.getBig(9, 2))
        }
        holder.view.cell_month_text_20.setOnClickListener {
            setBigListener(holder.view.cell_month_text_20, dbHelper.getBig(10, 2))
        }
        holder.view.cell_month_text_21.setOnClickListener {
            setBigListener(holder.view.cell_month_text_21, dbHelper.getBig(11, 2))
        }
        holder.view.cell_month_text_22.setOnClickListener {
            setBigListener(holder.view.cell_month_text_22, dbHelper.getBig(12, 2))
        }
        holder.view.cell_month_text_23.setOnClickListener {
            setBigListener(holder.view.cell_month_text_23, dbHelper.getBig(13, 2))
        }
        holder.view.cell_month_text_24.setOnClickListener {
            setBigListener(holder.view.cell_month_text_24, dbHelper.getBig(14, 2))
        }
        holder.view.cell_month_text_25.setOnClickListener {
            setBigListener(holder.view.cell_month_text_25, dbHelper.getBig(15, 2))
        }
        holder.view.cell_month_text_26.setOnClickListener {
            setBigListener(holder.view.cell_month_text_26, dbHelper.getBig(16, 2))
        }
        holder.view.cell_month_text_30.setOnClickListener {
            setBigListener(holder.view.cell_month_text_30, dbHelper.getBig(17, 2))
        }
        holder.view.cell_month_text_31.setOnClickListener {
            setBigListener(holder.view.cell_month_text_31, dbHelper.getBig(18, 2))
        }
        holder.view.cell_month_text_32.setOnClickListener {
            setBigListener(holder.view.cell_month_text_32, dbHelper.getBig(19, 2))
        }
        holder.view.cell_month_text_33.setOnClickListener {
            setBigListener(holder.view.cell_month_text_33, dbHelper.getBig(20, 2))
        }
        holder.view.cell_month_text_34.setOnClickListener {
            setBigListener(holder.view.cell_month_text_34, dbHelper.getBig(21, 2))
        }
        holder.view.cell_month_text_35.setOnClickListener {
            setBigListener(holder.view.cell_month_text_35, dbHelper.getBig(22, 2))
        }
        holder.view.cell_month_text_36.setOnClickListener {
            setBigListener(holder.view.cell_month_text_36, dbHelper.getBig(23, 2))
        }
        holder.view.cell_month_text_40.setOnClickListener {
            setBigListener(holder.view.cell_month_text_40, dbHelper.getBig(24, 2))
        }
        holder.view.cell_month_text_41.setOnClickListener {
            setBigListener(holder.view.cell_month_text_41, dbHelper.getBig(25, 2))
        }
        holder.view.cell_month_text_42.setOnClickListener {
            setBigListener(holder.view.cell_month_text_42, dbHelper.getBig(26, 2))
        }
        holder.view.cell_month_text_43.setOnClickListener {
            setBigListener(holder.view.cell_month_text_43, dbHelper.getBig(27, 2))
        }
        holder.view.cell_month_text_44.setOnClickListener {
            setBigListener(holder.view.cell_month_text_44, dbHelper.getBig(28, 2))
        }
        holder.view.cell_month_text_45.setOnClickListener {
            setBigListener(holder.view.cell_month_text_45, dbHelper.getBig(29, 2))
        }
        holder.view.cell_month_text_46.setOnClickListener {
            setBigListener(holder.view.cell_month_text_46, dbHelper.getBig(30, 2))
        }
        holder.view.cell_month_text_50.setOnClickListener {
            setBigListener(holder.view.cell_month_text_50, dbHelper.getBig(31, 2))
        }
    }

    private fun handleSeptember(holder: HouseViewHolder) {
        if (isBig) {
            holder.view.cell_month_text_name.text =
                holder.view.context.getString(R.string.september) +
                        holder.view.context.getString(R.string.house_big)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorMain))
            setSeptemberDatesBig(holder)
            setSeptemberClickListenersBig(holder)
        } else {
            holder.view.cell_month_text_name.text =
                holder.view.context.getString(R.string.september) +
                        holder.view.context.getString(R.string.house_small)
            holder.view.cell_month_text_name.setBackgroundColor(holder.view.context.getColor(R.color.colorOrange))
            holder.view.cell_month_text_name.setTextColor(holder.view.context.getColor(R.color.colorBackground))
            setSeptemberDatesSmall(holder)
            setSeptemberClickListenersSmall(holder)
        }
    }

    private fun setSeptemberDatesSmall(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_01.text = "1"
        setSmall(holder.view.cell_month_text_01, dbHelper.getSmall(1, 3))
        holder.view.cell_month_text_02.text = "2"
        setSmall(holder.view.cell_month_text_02, dbHelper.getSmall(2, 3))
        holder.view.cell_month_text_03.text = "3"
        setSmall(holder.view.cell_month_text_03, dbHelper.getSmall(3, 3))
        holder.view.cell_month_text_04.text = "4"
        setSmall(holder.view.cell_month_text_04, dbHelper.getSmall(4, 3))
        holder.view.cell_month_text_05.text = "5"
        setSmall(holder.view.cell_month_text_05, dbHelper.getSmall(5, 3))
        holder.view.cell_month_text_06.text = "6"
        setSmall(holder.view.cell_month_text_06, dbHelper.getSmall(6, 3))
        holder.view.cell_month_text_10.text = "7"
        setSmall(holder.view.cell_month_text_10, dbHelper.getSmall(7, 3))
        holder.view.cell_month_text_11.text = "8"
        setSmall(holder.view.cell_month_text_11, dbHelper.getSmall(8, 3))
        holder.view.cell_month_text_12.text = "9"
        setSmall(holder.view.cell_month_text_12, dbHelper.getSmall(9, 3))
        holder.view.cell_month_text_13.text = "10"
        setSmall(holder.view.cell_month_text_13, dbHelper.getSmall(10, 3))
        holder.view.cell_month_text_14.text = "11"
        setSmall(holder.view.cell_month_text_14, dbHelper.getSmall(11, 3))
        holder.view.cell_month_text_15.text = "12"
        setSmall(holder.view.cell_month_text_15, dbHelper.getSmall(12, 3))
        holder.view.cell_month_text_16.text = "13"
        setSmall(holder.view.cell_month_text_16, dbHelper.getSmall(13, 3))
        holder.view.cell_month_text_20.text = "14"
        setSmall(holder.view.cell_month_text_20, dbHelper.getSmall(14, 3))
        holder.view.cell_month_text_21.text = "15"
        setSmall(holder.view.cell_month_text_21, dbHelper.getSmall(15, 3))
        holder.view.cell_month_text_22.text = "16"
        setSmall(holder.view.cell_month_text_22, dbHelper.getSmall(16, 3))
        holder.view.cell_month_text_23.text = "17"
        setSmall(holder.view.cell_month_text_23, dbHelper.getSmall(17, 3))
        holder.view.cell_month_text_24.text = "18"
        setSmall(holder.view.cell_month_text_24, dbHelper.getSmall(18, 3))
        holder.view.cell_month_text_25.text = "19"
        setSmall(holder.view.cell_month_text_25, dbHelper.getSmall(19, 3))
        holder.view.cell_month_text_26.text = "20"
        setSmall(holder.view.cell_month_text_26, dbHelper.getSmall(20, 3))
        holder.view.cell_month_text_30.text = "21"
        setSmall(holder.view.cell_month_text_30, dbHelper.getSmall(21, 3))
        holder.view.cell_month_text_31.text = "22"
        setSmall(holder.view.cell_month_text_31, dbHelper.getSmall(22, 3))
        holder.view.cell_month_text_32.text = "23"
        setSmall(holder.view.cell_month_text_32, dbHelper.getSmall(23, 3))
        holder.view.cell_month_text_33.text = "24"
        setSmall(holder.view.cell_month_text_33, dbHelper.getSmall(24, 3))
        holder.view.cell_month_text_34.text = "25"
        setSmall(holder.view.cell_month_text_34, dbHelper.getSmall(25, 3))
        holder.view.cell_month_text_35.text = "26"
        setSmall(holder.view.cell_month_text_35, dbHelper.getSmall(26, 3))
        holder.view.cell_month_text_36.text = "27"
        setSmall(holder.view.cell_month_text_36, dbHelper.getSmall(27, 3))
        holder.view.cell_month_text_40.text = "28"
        setSmall(holder.view.cell_month_text_40, dbHelper.getSmall(28, 3))
        holder.view.cell_month_text_41.text = "29"
        setSmall(holder.view.cell_month_text_41, dbHelper.getSmall(29, 3))
        holder.view.cell_month_text_42.text = "30"
        setSmall(holder.view.cell_month_text_42, dbHelper.getSmall(30, 3))
    }

    private fun setSeptemberClickListenersSmall(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_01.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_01, dbHelper.getSmall(1, 3))
        }
        holder.view.cell_month_text_02.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_02, dbHelper.getSmall(2, 3))
        }
        holder.view.cell_month_text_03.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_03, dbHelper.getSmall(3, 3))
        }
        holder.view.cell_month_text_04.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_04, dbHelper.getSmall(4, 3))
        }
        holder.view.cell_month_text_05.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_05, dbHelper.getSmall(5, 3))
        }
        holder.view.cell_month_text_06.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_06, dbHelper.getSmall(6, 3))
        }
        holder.view.cell_month_text_10.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_10, dbHelper.getSmall(7, 3))
        }
        holder.view.cell_month_text_11.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_11, dbHelper.getSmall(8, 3))
        }
        holder.view.cell_month_text_12.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_12, dbHelper.getSmall(9, 3))
        }
        holder.view.cell_month_text_13.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_13, dbHelper.getSmall(10, 3))
        }
        holder.view.cell_month_text_14.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_14, dbHelper.getSmall(11, 3))
        }
        holder.view.cell_month_text_15.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_15, dbHelper.getSmall(12, 3))
        }
        holder.view.cell_month_text_16.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_16, dbHelper.getSmall(13, 3))
        }
        holder.view.cell_month_text_20.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_20, dbHelper.getSmall(14, 3))
        }
        holder.view.cell_month_text_21.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_21, dbHelper.getSmall(15, 3))
        }
        holder.view.cell_month_text_22.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_22, dbHelper.getSmall(16, 3))
        }
        holder.view.cell_month_text_23.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_23, dbHelper.getSmall(17, 3))
        }
        holder.view.cell_month_text_24.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_24, dbHelper.getSmall(18, 3))
        }
        holder.view.cell_month_text_25.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_25, dbHelper.getSmall(19, 3))
        }
        holder.view.cell_month_text_26.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_26, dbHelper.getSmall(20, 3))
        }
        holder.view.cell_month_text_30.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_30, dbHelper.getSmall(21, 3))
        }
        holder.view.cell_month_text_31.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_31, dbHelper.getSmall(22, 3))
        }
        holder.view.cell_month_text_32.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_32, dbHelper.getSmall(23, 3))
        }
        holder.view.cell_month_text_33.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_33, dbHelper.getSmall(24, 3))
        }
        holder.view.cell_month_text_34.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_34, dbHelper.getSmall(25, 3))
        }
        holder.view.cell_month_text_35.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_35, dbHelper.getSmall(26, 3))
        }
        holder.view.cell_month_text_36.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_36, dbHelper.getSmall(27, 3))
        }
        holder.view.cell_month_text_40.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_40, dbHelper.getSmall(28, 3))
        }
        holder.view.cell_month_text_41.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_41, dbHelper.getSmall(29, 3))
        }
        holder.view.cell_month_text_42.setOnClickListener {
            setSmallListener(holder.view.cell_month_text_42, dbHelper.getSmall(30, 3))
        }
    }

    private fun setSeptemberDatesBig(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_01.text = "1"
        setBig(holder.view.cell_month_text_01, dbHelper.getBig(1, 3))
        holder.view.cell_month_text_02.text = "2"
        setBig(holder.view.cell_month_text_02, dbHelper.getBig(2, 3))
        holder.view.cell_month_text_03.text = "3"
        setBig(holder.view.cell_month_text_03, dbHelper.getBig(3, 3))
        holder.view.cell_month_text_04.text = "4"
        setBig(holder.view.cell_month_text_04, dbHelper.getBig(4, 3))
        holder.view.cell_month_text_05.text = "5"
        setBig(holder.view.cell_month_text_05, dbHelper.getBig(5, 3))
        holder.view.cell_month_text_06.text = "6"
        setBig(holder.view.cell_month_text_06, dbHelper.getBig(6, 3))
        holder.view.cell_month_text_10.text = "7"
        setBig(holder.view.cell_month_text_10, dbHelper.getBig(7, 3))
        holder.view.cell_month_text_11.text = "8"
        setBig(holder.view.cell_month_text_11, dbHelper.getBig(8, 3))
        holder.view.cell_month_text_12.text = "9"
        setBig(holder.view.cell_month_text_12, dbHelper.getBig(9, 3))
        holder.view.cell_month_text_13.text = "10"
        setBig(holder.view.cell_month_text_13, dbHelper.getBig(10, 3))
        holder.view.cell_month_text_14.text = "11"
        setBig(holder.view.cell_month_text_14, dbHelper.getBig(11, 3))
        holder.view.cell_month_text_15.text = "12"
        setBig(holder.view.cell_month_text_15, dbHelper.getBig(12, 3))
        holder.view.cell_month_text_16.text = "13"
        setBig(holder.view.cell_month_text_16, dbHelper.getBig(13, 3))
        holder.view.cell_month_text_20.text = "14"
        setBig(holder.view.cell_month_text_20, dbHelper.getBig(14, 3))
        holder.view.cell_month_text_21.text = "15"
        setBig(holder.view.cell_month_text_21, dbHelper.getBig(15, 3))
        holder.view.cell_month_text_22.text = "16"
        setBig(holder.view.cell_month_text_22, dbHelper.getBig(16, 3))
        holder.view.cell_month_text_23.text = "17"
        setBig(holder.view.cell_month_text_23, dbHelper.getBig(17, 3))
        holder.view.cell_month_text_24.text = "18"
        setBig(holder.view.cell_month_text_24, dbHelper.getBig(18, 3))
        holder.view.cell_month_text_25.text = "19"
        setBig(holder.view.cell_month_text_25, dbHelper.getBig(19, 3))
        holder.view.cell_month_text_26.text = "20"
        setBig(holder.view.cell_month_text_26, dbHelper.getBig(20, 3))
        holder.view.cell_month_text_30.text = "21"
        setBig(holder.view.cell_month_text_30, dbHelper.getBig(21, 3))
        holder.view.cell_month_text_31.text = "22"
        setBig(holder.view.cell_month_text_31, dbHelper.getBig(22, 3))
        holder.view.cell_month_text_32.text = "23"
        setBig(holder.view.cell_month_text_32, dbHelper.getBig(23, 3))
        holder.view.cell_month_text_33.text = "24"
        setBig(holder.view.cell_month_text_33, dbHelper.getBig(24, 3))
        holder.view.cell_month_text_34.text = "25"
        setBig(holder.view.cell_month_text_34, dbHelper.getBig(25, 3))
        holder.view.cell_month_text_35.text = "26"
        setBig(holder.view.cell_month_text_35, dbHelper.getBig(26, 3))
        holder.view.cell_month_text_36.text = "27"
        setBig(holder.view.cell_month_text_36, dbHelper.getBig(27, 3))
        holder.view.cell_month_text_40.text = "28"
        setBig(holder.view.cell_month_text_40, dbHelper.getBig(28, 3))
        holder.view.cell_month_text_41.text = "29"
        setBig(holder.view.cell_month_text_41, dbHelper.getBig(29, 3))
        holder.view.cell_month_text_42.text = "30"
        setBig(holder.view.cell_month_text_42, dbHelper.getBig(30, 3))
    }

    private fun setSeptemberClickListenersBig(holder: HouseViewHolder) {
        val dbHelper = DataBaseHelper(holder.view.context)
        holder.view.cell_month_text_01.setOnClickListener {
            setBigListener(holder.view.cell_month_text_01, dbHelper.getBig(1, 3))
        }
        holder.view.cell_month_text_02.setOnClickListener {
            setBigListener(holder.view.cell_month_text_02, dbHelper.getBig(2, 3))
        }
        holder.view.cell_month_text_03.setOnClickListener {
            setBigListener(holder.view.cell_month_text_03, dbHelper.getBig(3, 3))
        }
        holder.view.cell_month_text_04.setOnClickListener {
            setBigListener(holder.view.cell_month_text_04, dbHelper.getBig(4, 3))
        }
        holder.view.cell_month_text_05.setOnClickListener {
            setBigListener(holder.view.cell_month_text_05, dbHelper.getBig(5, 3))
        }
        holder.view.cell_month_text_06.setOnClickListener {
            setBigListener(holder.view.cell_month_text_06, dbHelper.getBig(6, 3))
        }
        holder.view.cell_month_text_10.setOnClickListener {
            setBigListener(holder.view.cell_month_text_10, dbHelper.getBig(7, 3))
        }
        holder.view.cell_month_text_11.setOnClickListener {
            setBigListener(holder.view.cell_month_text_11, dbHelper.getBig(8, 3))
        }
        holder.view.cell_month_text_12.setOnClickListener {
            setBigListener(holder.view.cell_month_text_12, dbHelper.getBig(9, 3))
        }
        holder.view.cell_month_text_13.setOnClickListener {
            setBigListener(holder.view.cell_month_text_13, dbHelper.getBig(10, 3))
        }
        holder.view.cell_month_text_14.setOnClickListener {
            setBigListener(holder.view.cell_month_text_14, dbHelper.getBig(11, 3))
        }
        holder.view.cell_month_text_15.setOnClickListener {
            setBigListener(holder.view.cell_month_text_15, dbHelper.getBig(12, 3))
        }
        holder.view.cell_month_text_16.setOnClickListener {
            setBigListener(holder.view.cell_month_text_16, dbHelper.getBig(13, 3))
        }
        holder.view.cell_month_text_20.setOnClickListener {
            setBigListener(holder.view.cell_month_text_20, dbHelper.getBig(14, 3))
        }
        holder.view.cell_month_text_21.setOnClickListener {
            setBigListener(holder.view.cell_month_text_21, dbHelper.getBig(15, 3))
        }
        holder.view.cell_month_text_22.setOnClickListener {
            setBigListener(holder.view.cell_month_text_22, dbHelper.getBig(16, 3))
        }
        holder.view.cell_month_text_23.setOnClickListener {
            setBigListener(holder.view.cell_month_text_23, dbHelper.getBig(17, 3))
        }
        holder.view.cell_month_text_24.setOnClickListener {
            setBigListener(holder.view.cell_month_text_24, dbHelper.getBig(18, 3))
        }
        holder.view.cell_month_text_25.setOnClickListener {
            setBigListener(holder.view.cell_month_text_25, dbHelper.getBig(19, 3))
        }
        holder.view.cell_month_text_26.setOnClickListener {
            setBigListener(holder.view.cell_month_text_26, dbHelper.getBig(20, 3))
        }
        holder.view.cell_month_text_30.setOnClickListener {
            setBigListener(holder.view.cell_month_text_30, dbHelper.getBig(21, 3))
        }
        holder.view.cell_month_text_31.setOnClickListener {
            setBigListener(holder.view.cell_month_text_31, dbHelper.getBig(22, 3))
        }
        holder.view.cell_month_text_32.setOnClickListener {
            setBigListener(holder.view.cell_month_text_32, dbHelper.getBig(23, 3))
        }
        holder.view.cell_month_text_33.setOnClickListener {
            setBigListener(holder.view.cell_month_text_33, dbHelper.getBig(24, 3))
        }
        holder.view.cell_month_text_34.setOnClickListener {
            setBigListener(holder.view.cell_month_text_34, dbHelper.getBig(25, 3))
        }
        holder.view.cell_month_text_35.setOnClickListener {
            setBigListener(holder.view.cell_month_text_35, dbHelper.getBig(26, 3))
        }
        holder.view.cell_month_text_36.setOnClickListener {
            setBigListener(holder.view.cell_month_text_36, dbHelper.getBig(27, 3))
        }
        holder.view.cell_month_text_40.setOnClickListener {
            setBigListener(holder.view.cell_month_text_40, dbHelper.getBig(28, 3))
        }
        holder.view.cell_month_text_41.setOnClickListener {
            setBigListener(holder.view.cell_month_text_41, dbHelper.getBig(29, 3))
        }
        holder.view.cell_month_text_42.setOnClickListener {
            setBigListener(holder.view.cell_month_text_42, dbHelper.getBig(30, 3))
        }
    }

}

class HouseViewHolder(val view: View) : RecyclerView.ViewHolder(view)