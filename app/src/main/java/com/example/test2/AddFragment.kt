package com.example.test2

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class AddFragment : Fragment() , StudentInterface{
    lateinit var adapter: StudentLiistAdapter
    lateinit var studentArray:ArrayList<StudentModel>
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val row =  inflater.inflate(R.layout.fragment_add, container, false)
        val studentList = row.findViewById<ListView>(R.id.listview)
        studentArray = arrayListOf()
        studentArray.add(StudentModel("Naushad",R.drawable.bbb,20))
        adapter = StudentLiistAdapter(requireActivity(),studentArray,this)
        studentList.adapter = adapter

        val addBtn = row.findViewById<Button>(R.id.add)


        addBtn.setOnClickListener {
            var dialog=LayoutInflater.from(requireActivity()).inflate(R.layout.diialoglayout,null,false)

            var edittext=dialog.findViewById<EditText>(R.id.editname)
            var editahe=dialog.findViewById<EditText>(R.id.editfee)



            var bttn=dialog.findViewById<Button>(R.id.add2)
//            var list=row.findViewById<ListView>(R.id.listview)
//            studentArray.add(StudentModel("Naushad",R.drawable.bbb,"20"))
//            adapter = StudentLiistAdapter(requireActivity(),studentArray,this)
//            list.adapter = adapter
            var alter= AlertDialog.Builder(requireActivity())
            var alterdialof=alter.create()
            alterdialof.setView(dialog)
            alterdialof.show()


            bttn.setOnClickListener {
                studentArray.add(StudentModel(edittext.text.toString(),R.drawable.baseline_home_24,editahe.text.toString().toInt()))
                adapter.notifyDataSetChanged()
            }

//
//            bttn.setOnClickListener {
//                if (edittext.text.isEmpty()){
//                    return@setOnClickListener
//                }
//                else if(editahe.text.isEmpty()){
//                    return@setOnClickListener
//                    editahe.error="please age"
//                }
//            }
        }

//        addBtn.setOnClickListener {
//            studentArray.add(StudentModel(editName.text.toString(),R.drawable.bbb, editAge.text.toString().toInt()))
//            adapter.notifyDataSetChanged()
//        }

        return  row
    }

    override fun studentClickListe(name: String, position: Int) {
        studentArray.removeAt(position)
        adapter.notifyDataSetChanged()
        Toast.makeText(context, "deleted", Toast.LENGTH_SHORT).show()
    }


}