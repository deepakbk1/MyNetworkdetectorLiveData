package com.deepak.mynetworkdetector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val connectionLiveData = ConnectionLiveData(this)

        connectionLiveData.observe(this, Observer { isConnected ->
           if(isConnected)
                // do job
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            else
            Toast.makeText(this, "false", Toast.LENGTH_SHORT).show()

        })

    }
}
