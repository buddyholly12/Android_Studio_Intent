package com.example.intentfunction

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layactintent4.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnintent.setOnClickListener{
            val pIntent = Intent( this@MainActivity,actIntent2::class.java)
            startActivity(pIntent)
        }
        btnintent2.setOnClickListener{
            val pIntent2 = Intent( this@MainActivity,actintent3::class.java)
            pIntent2.putExtra(actintent3.extraText,etdatakirim2.text.toString())
            startActivity(pIntent2)
        }
        //val datpegawai = Pegawai(1,"Buddy","ItDiv")
        var datPegawai : ArrayList<Pegawai> = arrayListOf()
        datPegawai.add(Pegawai(1,"kirk","Secretary"))
        datPegawai.add(Pegawai(2,"Kendrick","Secretary"))
        btnintent3.setOnClickListener{
            val pIntent3 =Intent(this@MainActivity,actintent4::class.java)
            pIntent3.putExtra(actintent4.Extra_pegawai,datPegawai)
            startActivity(pIntent3)
        }
        btnDial.setOnClickListener{
            val nomor ="123456789"
            val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$nomor"))
            startActivity(dialIntent)
        }

    }

}
