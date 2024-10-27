package com.example.tp9
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class BerandaFragment : Fragment() {

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)

        // Extract the account holder's name from TextView
        val accountHolderName = view.findViewById<TextView>(R.id.tv_account_holder).text.toString()

        // Set the account holder name in the shared ViewModel
        sharedViewModel.setAccountHolderName(accountHolderName)

        return view
    }
}
