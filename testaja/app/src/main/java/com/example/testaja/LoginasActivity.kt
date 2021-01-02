package com.example.testaja

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class LoginasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_as)
        var butcus = findViewById<Button>(R.id.buttonascustomer) as Button;
        butcus.setOnClickListener {
            val intent=Intent(this,LoginCustomer::class.java)
            startActivity(intent)
        }
        var butem = findViewById<Button>(R.id.buttonasemployee) as Button;
        butem.setOnClickListener {
            val intent2=Intent(this,LoginEmployee::class.java)
            startActivity(intent2)
        }
    }

}