package com.myweb.ass05_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import com.myweb.ass05_intent.R
import com.myweb.ass05_intent.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClickShowDetail(v: View) {
        val selectID :Int = radioGroup.checkedRadioButtonId
        var gender = ""
        try {
            var radioButtonChecked : RadioButton = findViewById(selectID)
            gender = radioButtonChecked.text as String
        }catch (t: Throwable){
            gender = ""
        }

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(
            "EmpData",
            Employee(nameid.text.toString(), gendid.toString(), emailid.text.toString(),
                salaryid.text.toString().toInt()))
        startActivity(intent)
    }

    fun onClickReset(view: View) {
        nameid.text.clear()
        emailid.text.clear()
        salaryid.text.clear()
        radioGroup.clearCheck()
    }


}

private fun CharSequence.clear() {
    TODO("Not yet implemented")
}


