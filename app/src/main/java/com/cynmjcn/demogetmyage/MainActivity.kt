package com.cynmjcn.demogetmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            val userDOB = etDOB.text.toString()

            if (userDOB.isNotEmpty()) {
                //get current year using calendar and store in in variable year
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt()
                tvShowAge.text = "Your age is $age"

                var output =""
                if(age <18){
                    output ="Underage"

                }else if (age in 18..65){
                    output ="Young People"

                }else if (age in 66..79){
                    output ="Middle-aged"

                }else if (age in 80..99){
                    output ="Elderly"
                }else {
                    output = "Long Lived elderly"
                }

                tvAgeGrp.text ="$output"

                /**
                 * when(age){
                 in 0..17 -> output  = "Underage"
                 in 18..65 -> output = "Young People"
                 in 66..79 -> output = "Middle Aged"
                 in 66..79 -> output = "Elderly"

                 else -> {
                 output = "Long-lived elderly"
                 }
                 */

            } else {
                Toast.makeText(this,"Please enter your birth year",Toast.LENGTH_SHORT).show()

            }
        }
    }
}
