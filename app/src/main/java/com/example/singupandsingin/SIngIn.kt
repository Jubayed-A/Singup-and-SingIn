package com.example.singupandsingin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sing_in.texCreatAcount
import kotlinx.android.synthetic.main.activity_sing_in.texCreatAcount

class SIngIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)

        texCreatAcount.setOnClickListener {
            val intent = Intent(this, SingUp::class.java)
            startActivity(intent)
        }

    }
}