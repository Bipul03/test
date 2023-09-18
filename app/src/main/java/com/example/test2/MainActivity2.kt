package com.example.test2

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Handler().postDelayed(Runnable {
            val mProgressDialog = ProgressDialog(this)
            mProgressDialog.setTitle("Processing")

            mProgressDialog.show()
            Handler().postDelayed(Runnable {
                var intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                mProgressDialog.dismiss()
            },1000)
//            var intent= Intent(this,MainActivity::class.java)
//            startActivity(intent)

        },1500)








        }
    }
