package com.pratik.jetpacknavigationdemo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.math.BigDecimal


class ConfirmationFragment : Fragment() {

    lateinit var recepient : String
    lateinit var money : Money

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recepient = arguments!!.getString("recepient")!!
        money = arguments!!.getParcelable<Money>("money")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val amount : BigDecimal = money!!.amount
        val message : String = "You have sent $amount to $recepient"
        view.findViewById<TextView>(R.id.confirmation_message).text = message
    }
}
