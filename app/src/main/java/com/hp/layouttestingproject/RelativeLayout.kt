package com.hp.layouttestingproject

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class RelativeLayout : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        val spinner: Spinner= findViewById(R.id.sp_defaultdata)
    ArrayAdapter.createFromResource(this,R.array.planets_array,android.R.layout.simple_spinner_item)
        .also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter=adapter


        }
    val btnsubmit:Button=findViewById(R.id.btn_submit)
   spinner.onItemSelectedListener=this
        val customspinner:Spinner=findViewById(R.id.sp_custom)
        customspinner.onItemSelectedListener=this

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        if (p2==0){

        }else{
            val toast = Toast.makeText(applicationContext, p0?.selectedItem.toString(), Toast.LENGTH_LONG)
            toast.show()
        }

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}

