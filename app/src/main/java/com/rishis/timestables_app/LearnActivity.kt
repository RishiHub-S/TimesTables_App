package com.rishis.timestables_app

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import com.rishis.timestables_app.databinding.ActivityLearnBinding

class LearnActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLearnBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_learn)

        //Reference to views in activity_learn.xml
        val tableText = binding.tableEdit.text
        val rangeText = binding.rangeEdit.text
        val submitButton = binding.submitbutton


        submitButton.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("tableChoice", "$tableText")
            intent.putExtra("rangeChoice","$rangeText")
            startActivity(intent)
        }
    }
}