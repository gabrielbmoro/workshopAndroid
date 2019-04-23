package com.example.teste1.util

import java.text.SimpleDateFormat
import java.util.*

object DateUtil {

    fun convertToDate(year : Int, month : Int, day : Int) : Date {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, month - 1)
        calendar.set(Calendar.DAY_OF_MONTH, day)
        return calendar.time
    }

    fun getYear(date : Date) : String {
        val simpleDateFormat = SimpleDateFormat("yyyy", Locale.US)
        return simpleDateFormat.format(date)
    }

    fun convertStringToDate(strValue : String) : Date {
        // TODO Implement it
        return Date()
    }
}