package com.example.login_version2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnShow = findViewById<Button>(R.id.signin)



        btnShow.setOnClickListener {
            ;
            var status = if (et_username.text.toString().equals("Silos2000") && et_pass.text.toString().equals("UD2010" )
            ) "Logged in Successfully"

            else  "Login Failed"

            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()

            var other_status = if (et_username.text.toString().equals("Bradley") && et_pass.text.toString().equals("Bluegreen5")
            ) "Logged in Successfully"

            else "Login Failed \n Try again"

            Toast.makeText(this, other_status, Toast.LENGTH_SHORT).show()

        }


    }
}



