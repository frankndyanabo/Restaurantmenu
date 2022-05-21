package com.example.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class create_account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
            val cresteaccountbutton2=findViewById<Button>(R.id.button3)
            cresteaccountbutton2.setOnClickListener {
                val wheretogo3= Intent(this,MainActivity::class.java)
                startActivity(wheretogo3)
                finish()

            }
            val loginbutton2=findViewById<Button>(R.id.button4)
            loginbutton2.setOnClickListener {
                val wheretogo4 = Intent(this, MainActivity::class.java)
                startActivity(wheretogo4)
                finish()
            }
    }
}