package com.example.demoapplink

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val data = intent.data
        Log.d("zavanton", "zavanton - first: $data")
    }
}
