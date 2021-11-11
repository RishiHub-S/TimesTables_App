package com.rishis.timestables_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.rishis.timestables_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val learnButton = binding.learnHbutton
        learnButton.setOnClickListener{
            val intent = Intent(this, LearnActivity::class.java)
            startActivity(intent)
        }

    }



}