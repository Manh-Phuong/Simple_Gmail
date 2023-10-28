package com.example.simplegmail

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.cardview.widget.CardView

class MessageAdapter(val messages: ArrayList<MessageModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return messages.size
    }

    override fun getItem(position: Int): Any {
        return messages[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView: View
        itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.message_item, parent, false)

        itemView.findViewById<TextView>(R.id.content).text = messages[position].content
        itemView.findViewById<TextView>(R.id.wap_note).text = messages[position].ownerName
        itemView.findViewById<TextView>(R.id.text_user_name).text =
            messages[position].ownerName[0].toString()
        itemView.findViewById<TextView>(R.id.time).text = messages[position].time


        val backgroundColors = listOf("#5a99fa", "#fb8c67", "#9acd68", "#92a3ad", "#8C33FF")
        val color = Color.parseColor(backgroundColors[position % backgroundColors.size])
        itemView.findViewById<CardView>(R.id.card_view_2).setCardBackgroundColor(color)

        return itemView
    }

}