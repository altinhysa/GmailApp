package com.example.gmailapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.gmailapp.R
import com.example.gmailapp.models.Gmail


class GmailDetailsFragment : Fragment() {
    private lateinit var email: Gmail


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gmail_details, container, false)

        val ivPhoto = view.findViewById<ImageView>(R.id.ivProfileImageDetials)
        val tvName = view.findViewById<TextView>(R.id.tvNameDetails)
        val tvSubject = view.findViewById<TextView>(R.id.tvSubjectDetails)
        val tvMessage = view.findViewById<TextView>(R.id.tvLongMessageDetails)
        val tvDate = view.findViewById<TextView>(R.id.tvDateDetails)

        ivPhoto.setImageResource(email.photo)
        tvName.text = email.name
        tvMessage.text = email.longMessage
        tvSubject.text = email.subject
        tvDate.text = email.date.toString()

        return view
    }
    fun setEmailDetails(selectedEmail: Gmail) {
        email = selectedEmail
    }
}