package com.example.intentfunction
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layactintent4.*


class actintent4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layactintent4)
        val iPegawai = intent.getParcelableArrayListExtra<Pegawai>(Extra_pegawai)
        if (iPegawai!=null) {
            val text = " NIP : ${iPegawai[0].NIP.toString ()}," +
                    "\n Nama: ${iPegawai[0].nama.toString()}" +
                    "\n Division: ${iPegawai[0].Division.toString()}" + "\n"+
                    "\n\n NIP : ${iPegawai[1] .NIP.toString ()}," +
                    "\n Nama: ${iPegawai[1].nama.toString()}" +
                    "\n Division: ${iPegawai[1].Division.toString()}" + "\n"
            tvGetPegawai.text = text
        }
    }
    companion object{
        const val Extra_pegawai = "exPegawai"
    }

}
