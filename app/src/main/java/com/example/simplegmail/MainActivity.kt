package com.example.simplegmail

import MessageAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messages = arrayListOf<MessageModel>()
        messages.add(MessageModel("Mạnh Phương", "Bài tập clone giao diện gmail", "23:11 PM", false))
        messages.add(MessageModel("Edurila.com", "$19 Only (First 10 spots) - Bestselling", "12:34 PM", false))
        messages.add(MessageModel("Chris Abad", "Help make Campaign Monitor better Let us know your thoughts! NO images", "11:22 AM", false))
        messages.add(MessageModel("Tuto.com", "8h de formation gratuite et les nouvea Photoshop, SEO, Blender, CSS, WordPress", "11:04 AM", false))
        messages.add(MessageModel("support", "Announcing the all-new", "10:26 AM", false))
        messages.add(MessageModel("Matt from lonic", "The New lonic Creator is here", "9:23 AM", false))

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        findViewById<RecyclerView>(R.id.recycler_view).adapter = MessageAdapter(messages)

    }
}