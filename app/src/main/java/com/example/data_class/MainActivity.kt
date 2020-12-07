package com.example.data_class

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf("riddhi", "tom","jerry")

        var myList = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,R.layout.list_item,users)
        myList.adapter = arrayAdapter
    }
}