package com.novian.lazylayout.model

import androidx.annotation.DrawableRes

data class Destinasi(
    val id: Int,
    val nama: String,
    val lokasi: String,
    @DrawableRes val gambar: Int   // menyimpan ID resource, contoh: R.drawable.gambar1
)