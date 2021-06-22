package com.febryan.layoutingkotlinday

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.message_box.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_box)

        btn_toast.setOnClickListener {
            Toast.makeText(this@MainActivity, "Ini adalah Toast", Toast.LENGTH_SHORT).show()
        }

        btn_alert_dialog.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this@MainActivity)
            alertDialog.setTitle("Judul Alert")
            alertDialog.setMessage("Pesan Alert Dialog !")

            alertDialog.setPositiveButton("Ya", DialogInterface.OnClickListener { dialog, which->
                //Action Ketika tekan YA
            })

            alertDialog.setNegativeButton("Tidak", DialogInterface.OnClickListener { dialog,which->
                //Action Ketika tekan Tidak
            })

            alertDialog.setNeutralButton("Batal", DialogInterface.OnClickListener { dialog, which->
                //Action Ketika tekan Batal
            })

            alertDialog.show()
        }

        btn_snacbar.setOnClickListener {
            val snacbar = Snackbar.make(findViewById(R.id.layout_message_box),
                "Ini Adalah Snacbar", Snackbar.LENGTH_SHORT)
            snacbar.setAction("Oke", View.OnClickListener {
                Toast.makeText(this@MainActivity, "Ini adalah toast dari snacbar", Toast.LENGTH_SHORT).show()
            })
            snacbar.show()
        }
    }
}