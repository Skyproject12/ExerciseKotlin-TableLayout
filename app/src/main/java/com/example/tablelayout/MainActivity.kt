package com.example.tablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var table_flg : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        change()
    }
    fun change(){
        swithcButton.setOnClickListener{
            // set collapse in index different
            table.setColumnCollapsed(1, table_flg)
            table.setColumnCollapsed(2, table_flg)
            // give status false to check status table collapse 1,2 atau tidak
        }
    }
}
