package com.example.tp9
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class ProfileFragment : Fragment() {

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Reference the TextView where we want to display the account holder name
        val usernTextView = view.findViewById<TextView>(R.id.usern)

        // Observe the LiveData from the SharedViewModel
        sharedViewModel.accountHolderName.observe(viewLifecycleOwner) { name ->
            usernTextView.text = name
        }

        return view
    }
}


