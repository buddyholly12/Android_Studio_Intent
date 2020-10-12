package com.example.intentfunction

import android.os.Parcel
import android.os.Parcelable

data class Pegawai (val NIP: Int?,val nama:String?,val Division:String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(NIP)
        parcel.writeString(nama)
        parcel.writeString(Division)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pegawai> {
        override fun createFromParcel(parcel: Parcel): Pegawai {
            return Pegawai(parcel)
        }

        override fun newArray(size: Int): Array<Pegawai?> {
            return arrayOfNulls(size)
        }
    }
}