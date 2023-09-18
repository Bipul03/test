package com.example.test2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class StudentLiistAdapter(val context: Context, val myDate: ArrayList<StudentModel>, val studentClick: StudentInterface) :
    BaseAdapter() {
    override fun getCount(): Int {
        return myDate.size
    }

    override fun getItem(p0: Int): Any {
        return myDate[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val layout = LayoutInflater.from(context).inflate(R.layout.student_list_item,p2,false)
        val name = layout.findViewById<TextView>(R.id.name)
        val age = layout.findViewById<TextView>(R.id.age)
        val image = layout.findViewById<ImageView>(R.id.image)

        name.text = myDate[p0].name
        age.text = myDate[p0].age.toString()
        image.setImageResource(myDate[p0].image)

        layout.setOnClickListener {
            studentClick.studentClickListe(myDate[p0].name,p0)
        }

        return layout
    }


}