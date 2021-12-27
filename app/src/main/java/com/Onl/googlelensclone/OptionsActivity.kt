package com.Onl.googlelensclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Onl.googlelensclone.text.OCRTextActivity
import com.Onl.googlelensclone.R
import com.Onl.googlelensclone.barcode.BarcodeActivity
import kotlinx.android.synthetic.main.activity_options.*

class OptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)
/*btn barcode is actually for recognition*/
        btnLabeler.setOnClickListener {
            startActivity(Intent(this, BarcodeActivity::class.java))
        }

//        btnLabel.setOnClickListener {
//            startActivity(Intent(this,BarcodeActivity::class.java))
//        }

        btnTextR.setOnClickListener {
            startActivity(Intent(this,OCRTextActivity::class.java))
        }

    }

}