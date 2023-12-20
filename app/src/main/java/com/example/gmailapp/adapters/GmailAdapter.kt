package com.example.gmailapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gmailapp.R
import com.example.gmailapp.models.Gmail
import android.icu.text.SimpleDateFormat

class GmailAdapter(private val context: Context, private val listOfEmails: List<Gmail>) : BaseAdapter() {
    val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int = listOfEmails.size


    override fun getItem(position: Int): Any = listOfEmails[position]



    override fun getItemId(position: Int): Long = position.toLong()


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = layoutInflater.inflate(R.layout.fragment_gmail_details,parent,false)

        val ivPhoto = rowView.findViewById<ImageView>(R.id.ivProfileImageDetials)
        val tvName = rowView.findViewById<TextView>(R.id.tvNameDetails)
        val tvMessage = rowView.findViewById<TextView>(R.id.tvLongMessageDetails)
        val tvDate = rowView.findViewById<TextView>(R.id.tvDateDetails)
        val tvSubject = rowView.findViewById<TextView>(R.id.tvSubjectDetails)





        ivPhoto.setImageResource(listOfEmails[position].photo)
        tvName.text = listOfEmails[position].name
        tvMessage.text = listOfEmails[position].shortMessage
        tvSubject.text = listOfEmails[position].subject
        tvDate.text = listOfEmails[position].date.toString()
        return rowView
    }
}