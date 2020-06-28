package com.partos.rentcalendar.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build.ID
import android.provider.BaseColumns
import com.partos.rentcalendar.models.Day


object TableInfo : BaseColumns {
    const val DATABASE_NAME = "Holidays"
    const val TABLE_NAME_SMALL = "Small"
    const val TABLE_COLUMN_DAY = "day"
    const val TABLE_COLUMN_MONTH = "month"
    const val TABLE_COLUMN_STATUS = "status"
    const val TABLE_NAME_BIG = "Big"

}

object BasicCommand {
    const val SQL_CREATE_TABLE_SMALL =
        "CREATE TABLE ${TableInfo.TABLE_NAME_SMALL} (" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY," +
                "${TableInfo.TABLE_COLUMN_DAY} INTEGER NOT NULL," +
                "${TableInfo.TABLE_COLUMN_MONTH} INTEGER NOT NULL," +
                "${TableInfo.TABLE_COLUMN_STATUS} INTEGER NOT NULL)"

    const val SQL_CREATE_TABLE_BIG =
        "CREATE TABLE ${TableInfo.TABLE_NAME_BIG} (" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY," +
                "${TableInfo.TABLE_COLUMN_DAY} INTEGER NOT NULL," +
                "${TableInfo.TABLE_COLUMN_MONTH} INTEGER NOT NULL," +
                "${TableInfo.TABLE_COLUMN_STATUS} INTEGER NOT NULL)"

    const val SQL_DELETE_TABLE_SMALL = "DROP TABLE IF EXISTS ${TableInfo.TABLE_NAME_SMALL}"
    const val SQL_DELETE_TABLE_BIG = "DROP TABLE IF EXISTS ${TableInfo.TABLE_NAME_BIG}"
}

class DataBaseHelper(context: Context) :
    SQLiteOpenHelper(context, TableInfo.DATABASE_NAME, null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(BasicCommand.SQL_CREATE_TABLE_SMALL)
        db?.execSQL(BasicCommand.SQL_CREATE_TABLE_BIG)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL(BasicCommand.SQL_CREATE_TABLE_SMALL)
        db?.execSQL(BasicCommand.SQL_CREATE_TABLE_BIG)

        onCreate(db)
    }

    fun createDays() {
        addSmall(1, 1, 0)
        addSmall(2, 1, 0)
        addSmall(3, 1, 0)
        addSmall(4, 1, 0)
        addSmall(5, 1, 0)
        addSmall(6, 1, 0)
        addSmall(7, 1, 0)
        addSmall(8, 1, 0)
        addSmall(9, 1, 0)
        addSmall(10, 1, 0)
        addSmall(11, 1, 0)
        addSmall(12, 1, 0)
        addSmall(13, 1, 0)
        addSmall(14, 1, 0)
        addSmall(15, 1, 0)
        addSmall(16, 1, 0)
        addSmall(17, 1, 0)
        addSmall(18, 1, 0)
        addSmall(19, 1, 0)
        addSmall(20, 1, 0)
        addSmall(21, 1, 0)
        addSmall(22, 1, 0)
        addSmall(23, 1, 0)
        addSmall(24, 1, 0)
        addSmall(25, 1, 0)
        addSmall(26, 1, 0)
        addSmall(27, 1, 0)
        addSmall(28, 1, 0)
        addSmall(29, 1, 0)
        addSmall(30, 1, 0)
        addSmall(31, 1, 0)
        addSmall(1, 2, 0)
        addSmall(2, 2, 0)
        addSmall(3, 2, 0)
        addSmall(4, 2, 0)
        addSmall(5, 2, 0)
        addSmall(6, 2, 0)
        addSmall(7, 2, 0)
        addSmall(8, 2, 0)
        addSmall(9, 2, 0)
        addSmall(10, 2, 0)
        addSmall(11, 2, 0)
        addSmall(12, 2, 0)
        addSmall(13, 2, 0)
        addSmall(14, 2, 0)
        addSmall(15, 2, 0)
        addSmall(16, 2, 0)
        addSmall(17, 2, 0)
        addSmall(18, 2, 0)
        addSmall(19, 2, 0)
        addSmall(20, 2, 0)
        addSmall(21, 2, 0)
        addSmall(22, 2, 0)
        addSmall(23, 2, 0)
        addSmall(24, 2, 0)
        addSmall(25, 2, 0)
        addSmall(26, 2, 0)
        addSmall(27, 2, 0)
        addSmall(28, 2, 0)
        addSmall(29, 2, 0)
        addSmall(30, 2, 0)
        addSmall(31, 2, 0)
        addSmall(1, 3, 0)
        addSmall(2, 3, 0)
        addSmall(3, 3, 0)
        addSmall(4, 3, 0)
        addSmall(5, 3, 0)
        addSmall(6, 3, 0)
        addSmall(7, 3, 0)
        addSmall(8, 3, 0)
        addSmall(9, 3, 0)
        addSmall(10, 3, 0)
        addSmall(11, 3, 0)
        addSmall(12, 3, 0)
        addSmall(13, 3, 0)
        addSmall(14, 3, 0)
        addSmall(15, 3, 0)
        addSmall(16, 3, 0)
        addSmall(17, 3, 0)
        addSmall(18, 3, 0)
        addSmall(19, 3, 0)
        addSmall(20, 3, 0)
        addSmall(21, 3, 0)
        addSmall(22, 3, 0)
        addSmall(23, 3, 0)
        addSmall(24, 3, 0)
        addSmall(25, 3, 0)
        addSmall(26, 3, 0)
        addSmall(27, 3, 0)
        addSmall(28, 3, 0)
        addSmall(29, 3, 0)
        addSmall(30, 3, 0)

        addBig(1, 1, 0)
        addBig(2, 1, 0)
        addBig(3, 1, 0)
        addBig(4, 1, 0)
        addBig(5, 1, 0)
        addBig(6, 1, 0)
        addBig(7, 1, 0)
        addBig(8, 1, 0)
        addBig(9, 1, 0)
        addBig(10, 1, 0)
        addBig(11, 1, 0)
        addBig(12, 1, 0)
        addBig(13, 1, 0)
        addBig(14, 1, 0)
        addBig(15, 1, 0)
        addBig(16, 1, 0)
        addBig(17, 1, 0)
        addBig(18, 1, 0)
        addBig(19, 1, 0)
        addBig(20, 1, 0)
        addBig(21, 1, 0)
        addBig(22, 1, 0)
        addBig(23, 1, 0)
        addBig(24, 1, 0)
        addBig(25, 1, 0)
        addBig(26, 1, 0)
        addBig(27, 1, 0)
        addBig(28, 1, 0)
        addBig(29, 1, 0)
        addBig(30, 1, 0)
        addBig(31, 1, 0)
        addBig(1, 2, 0)
        addBig(2, 2, 0)
        addBig(3, 2, 0)
        addBig(4, 2, 0)
        addBig(5, 2, 0)
        addBig(6, 2, 0)
        addBig(7, 2, 0)
        addBig(8, 2, 0)
        addBig(9, 2, 0)
        addBig(10, 2, 0)
        addBig(11, 2, 0)
        addBig(12, 2, 0)
        addBig(13, 2, 0)
        addBig(14, 2, 0)
        addBig(15, 2, 0)
        addBig(16, 2, 0)
        addBig(17, 2, 0)
        addBig(18, 2, 0)
        addBig(19, 2, 0)
        addBig(20, 2, 0)
        addBig(21, 2, 0)
        addBig(22, 2, 0)
        addBig(23, 2, 0)
        addBig(24, 2, 0)
        addBig(25, 2, 0)
        addBig(26, 2, 0)
        addBig(27, 2, 0)
        addBig(28, 2, 0)
        addBig(29, 2, 0)
        addBig(30, 2, 0)
        addBig(31, 2, 0)
        addBig(1, 3, 0)
        addBig(2, 3, 0)
        addBig(3, 3, 0)
        addBig(4, 3, 0)
        addBig(5, 3, 0)
        addBig(6, 3, 0)
        addBig(7, 3, 0)
        addBig(8, 3, 0)
        addBig(9, 3, 0)
        addBig(10, 3, 0)
        addBig(11, 3, 0)
        addBig(12, 3, 0)
        addBig(13, 3, 0)
        addBig(14, 3, 0)
        addBig(15, 3, 0)
        addBig(16, 3, 0)
        addBig(17, 3, 0)
        addBig(18, 3, 0)
        addBig(19, 3, 0)
        addBig(20, 3, 0)
        addBig(21, 3, 0)
        addBig(22, 3, 0)
        addBig(23, 3, 0)
        addBig(24, 3, 0)
        addBig(25, 3, 0)
        addBig(26, 3, 0)
        addBig(27, 3, 0)
        addBig(28, 3, 0)
        addBig(29, 3, 0)
        addBig(30, 3, 0)
    }


    fun getSmallList(): ArrayList<Day> {
        var smallList = ArrayList<Day>()
        val db = readableDatabase
        val selectQuery = "Select * from ${TableInfo.TABLE_NAME_SMALL}"
        val result = db.rawQuery(selectQuery, null)
        if (result.moveToFirst()) {
            do {
                var myPackage = Day(
                    result.getInt(result.getColumnIndex(BaseColumns._ID)).toLong(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_DAY)).toInt(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_MONTH)).toInt(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_STATUS)).toInt()
                )
                smallList.add(myPackage)
            } while (result.moveToNext())
        }
        result.close()
        db.close()
        return smallList
    }

    fun getBigList(): ArrayList<Day> {
        var smallList = ArrayList<Day>()
        val db = readableDatabase
        val selectQuery = "Select * from ${TableInfo.TABLE_NAME_BIG}"
        val result = db.rawQuery(selectQuery, null)
        if (result.moveToFirst()) {
            do {
                var myPackage = Day(
                    result.getInt(result.getColumnIndex(BaseColumns._ID)).toLong(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_DAY)).toInt(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_MONTH)).toInt(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_STATUS)).toInt()
                )
                smallList.add(myPackage)
            } while (result.moveToNext())
        }
        result.close()
        db.close()
        return smallList
    }

    fun getSmall(day: Int, month: Int): Day {
        var smallList = ArrayList<Day>()
        val db = readableDatabase
        val selectQuery =
            "Select * from ${TableInfo.TABLE_NAME_SMALL} where ${TableInfo.TABLE_COLUMN_DAY} = " +
                    day.toString() + " and ${TableInfo.TABLE_COLUMN_MONTH} = " + month.toString()
        val result = db.rawQuery(selectQuery, null)
        if (result.moveToFirst()) {
            do {
                var smallDay = Day(
                    result.getInt(result.getColumnIndex(BaseColumns._ID)).toLong(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_DAY)).toInt(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_MONTH)).toInt(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_STATUS)).toInt()
                )
                smallList.add(smallDay)
            } while (result.moveToNext())
        }
//        var resultDay = Day(0, 0, 0, 0)
//        for (d in smallList) {
//            if (d.month == month) {
//                resultDay = d
//            }
//        }

        result.close()
        db.close()
        return smallList[0]
    }

    fun getBig(day: Int, month: Int): Day {
        var bigList = ArrayList<Day>()
        val db = readableDatabase
        val selectQuery =
            "Select * from ${TableInfo.TABLE_NAME_BIG} where ${TableInfo.TABLE_COLUMN_DAY} = " +
                    day.toString() + " and ${TableInfo.TABLE_COLUMN_MONTH} = " + month.toString()
        val result = db.rawQuery(selectQuery, null)
        if (result.moveToFirst()) {
            do {
                var bigDay = Day(
                    result.getInt(result.getColumnIndex(BaseColumns._ID)).toLong(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_DAY)).toInt(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_MONTH)).toInt(),
                    result.getString(result.getColumnIndex(TableInfo.TABLE_COLUMN_STATUS)).toInt()
                )
                bigList.add(bigDay)
            } while (result.moveToNext())
        }
//        var resultDay = Day(0, 0, 0, 0)
//        for (d in bigList) {
//            if (d.month == month) {
//                resultDay = d
//            }
//        }

        result.close()
        db.close()
        return bigList[0]
    }

    private fun addSmall(day: Int, month: Int, status: Int): Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(TableInfo.TABLE_COLUMN_DAY, day)
        values.put(TableInfo.TABLE_COLUMN_MONTH, month)
        values.put(TableInfo.TABLE_COLUMN_STATUS, status)
        val success = db.insert(TableInfo.TABLE_NAME_SMALL, null, values)
        db.close()
        return (Integer.parseInt("$success") != -1)
    }

    private fun addBig(day: Int, month: Int, status: Int): Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(TableInfo.TABLE_COLUMN_DAY, day)
        values.put(TableInfo.TABLE_COLUMN_MONTH, month)
        values.put(TableInfo.TABLE_COLUMN_STATUS, status)
        val success = db.insert(TableInfo.TABLE_NAME_BIG, null, values)
        db.close()
        return (Integer.parseInt("$success") != -1)
    }

    fun updateSmall(day: Day): Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(TableInfo.TABLE_COLUMN_DAY, day.day)
        values.put(TableInfo.TABLE_COLUMN_MONTH, day.month)
        values.put(TableInfo.TABLE_COLUMN_STATUS, day.status)
        val success = db.update(
            TableInfo.TABLE_NAME_SMALL, values, BaseColumns._ID + "=?",
            arrayOf(day.id.toString())
        ).toLong()
        return Integer.parseInt("$success") != -1
    }

    fun updateBig(day: Day): Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(TableInfo.TABLE_COLUMN_DAY, day.day)
        values.put(TableInfo.TABLE_COLUMN_MONTH, day.month)
        values.put(TableInfo.TABLE_COLUMN_STATUS, day.status)
        val success = db.update(
            TableInfo.TABLE_NAME_BIG, values, BaseColumns._ID + "=?",
            arrayOf(day.id.toString())
        ).toLong()
        return Integer.parseInt("$success") != -1
    }

}