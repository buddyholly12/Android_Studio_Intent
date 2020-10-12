package com.example.intentfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layactintent3.*

class actintent3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layactintent3)
    val dataTerima = intent.getStringExtra(extraText)
        tvDataKirim.setText(dataTerima)
    }
    companion object {
        const val extraText = "DT_Kirim "
    }
}