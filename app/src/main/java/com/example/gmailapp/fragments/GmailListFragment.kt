package com.example.gmailapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gmailapp.R
import com.example.gmailapp.adapters.GmailAdapter
import com.example.gmailapp.databinding.FragmentGmailListBinding
import com.example.gmailapp.helpers.Helper.provideGmailList



class GmailListFragment : Fragment() {
    private lateinit var binding : FragmentGmailListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGmailListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var listOfEmails = provideGmailList()
        var gmailAdapter = GmailAdapter(requireContext(),listOfEmails)




        binding.btnSortNewest.setOnClickListener {
            listOfEmails = listOfEmails.sortedByDescending { it.date }
            gmailAdapter = GmailAdapter(requireContext(),listOfEmails)
            binding.lvGmail.adapter = gmailAdapter

            gmailAdapter.notifyDataSetChanged()
        }


        binding.btnSortOldest.setOnClickListener {
            listOfEmails = listOfEmails.sortedBy { it.date }
            gmailAdapter = GmailAdapter(requireContext(),listOfEmails)
            binding.lvGmail.adapter = gmailAdapter
            gmailAdapter.notifyDataSetChanged()
        }

        binding.lvGmail.setOnItemClickListener { _, _, position, _ ->
            val selectedEmail = listOfEmails[position]

            val emailDetailsFragment = GmailDetailsFragment()

            emailDetailsFragment.setEmailDetails(selectedEmail)

            val fragmentManager = requireActivity().supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, emailDetailsFragment)
                .addToBackStack(null)
                .commit()
        }

        binding.lvGmail.adapter = gmailAdapter

    }


}