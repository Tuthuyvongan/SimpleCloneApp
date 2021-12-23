package com.sachin.googlelensclone

import android.bluetooth.BluetoothAdapter.ERROR
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val REQUEST_IMAGE_CAPTURE = 1
    val data="some_data"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnML.setOnClickListener{
            val mlIntent=Intent(this,OptionsActivity::class.java)
            startActivity(mlIntent)
        }

    }
}