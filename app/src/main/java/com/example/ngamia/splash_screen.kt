package com.example.ngamia

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

internal class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val myThread: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)
                    val intent = Intent(applicationContext, log_in::class.java)
                    startActivity(intent)
                    finish()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
        myThread.start()
    }
}