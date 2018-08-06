package com.example.infosoft.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num: Int  = 0
        text_view.setText("$num")

        btn_increment.setOnClickListener {
            num++
            text_view.setText("$num")
        }

        btn_decrement.setOnClickListener {
            if(num == 0){
                Toast.makeText(this,"cannot decrement further",Toast.LENGTH_SHORT).show()
            }else{
                num--
            }
            text_view.setText("$num")
        }

        btn_reset.setOnClickListener {
            num = 0
            text_view.setText("$num")
        }
    }
}
