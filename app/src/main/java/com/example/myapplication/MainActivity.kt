package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AlertDialog.Builder(this)
            .setMessage("KOnfirmasi")
            .setPositiveButton("OK"){d,i,->}
            .create().show()
    }
}