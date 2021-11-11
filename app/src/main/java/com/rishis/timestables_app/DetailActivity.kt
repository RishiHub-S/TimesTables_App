package com.rishis.timestables_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rishis.timestables_app.Adapters.ItemAdapter
import com.rishis.timestables_app.databinding.ActivityDetailsBinding

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_details)

        //RecyclerViewItems list
        val recyclerViewItems = findViewById<RecyclerView>(R.id.recycle_view_items)
        recyclerViewItems.layoutManager = LinearLayoutManager(this)

        val tableChoice = intent.getStringExtra("tableChoice")?.toInt()
        val rangeChoice = intent.getStringExtra("rangeChoice")?.toInt()

        //Getting Information from previous screen and displaying it through the adapter
        val itemAdapter = tableChoice?.let { getItemsList(tableChoice, rangeChoice!!) }?.let { ItemAdapter(this, it) }
        recyclerViewItems.adapter = itemAdapter
    }

    private fun getItemsList(table: Int, range: Int): ArrayList<String> {
        val list = ArrayList<String>()

        for (i in 1..range){
            val product = table * i
            list.add("$table X $i = $product")
        }

        return list
    }
}