package com.example.teste1.model

import android.os.Parcel
import android.os.Parcelable
import com.example.teste1.util.DateUtil
import java.util.*


data class Movie(
    val id: Long,
    val name: String,
    val overview: String,
    val releaseDate: Date
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readLong(),
        parcel.readString(),
        parcel.readString(),
        DateUtil.convertStringToDate(parcel.readString() ?: "")
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeLong(id)
        parcel.writeString(name)
        parcel.writeString(overview)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {

        const val ID_KEY = "id"
        const val TITLE_KEY = "title"
        const val OVERVIEW_KEY = "overview"
        const val RELEASE_DATE = "release_date"

        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}