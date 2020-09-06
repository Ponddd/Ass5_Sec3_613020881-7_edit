package com.myweb.ass05_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data :Bundle? =intent.extras
        var newEmployee :Employee? = data?.getParcelable<Employee>("EmpData")
        nameid.text= "Employee Name : ${newEmployee?.name}"
        gendid.text = "Gender : ${newEmployee?.gender}"
        emailid.text = "E-mail : ${newEmployee?.email}"
        salaryid.text = "Salary : ${newEmployee?.salary}"

    }

    fun onClickClose(view : View){
        finish()
    }

}
