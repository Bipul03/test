package com.example.test2

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView


class homeFragment : Fragment() {

    lateinit var adapter: StudentLiistAdapter
    lateinit var studentArray:ArrayList<StudentModel>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var row= inflater.inflate(R.layout.fragment_home, container, false)
        var list=row.findViewById<ListView>(R.id.listview)


        var arr= arrayListOf("Bipul kumar","naushad alam","sanjay kumar","akkash kumar","ritesh kumar")
        val AdapterView= ArrayAdapter(requireActivity(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arr)
        list.adapter=AdapterView





        return  row

        }




}