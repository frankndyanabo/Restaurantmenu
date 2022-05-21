package com.example.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class log_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val loginbutton=findViewById<Button>(R.id.buttonlogin1)
        val cresteaccountbutton=findViewById<Button>(R.id.createbutton1)

        loginbutton.setOnClickListener {
            val wheretogo1= Intent(this,MainActivity::class.java)
            startActivity(wheretogo1)
            finish()
        }

        cresteaccountbutton.setOnClickListener {
            val wheretogo2= Intent(this,create_account::class.java)
            startActivity(wheretogo2)
            finish()
        }


    }
}