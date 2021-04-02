package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                add(R.id.fragmentFrame, FragmentFirst())
                addToBackStack(null)
                commit()
            }
        }
        remove.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
               // remove(FragmentFirst())
                remove(Fragment())
                commit()
            }
            replace.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragmentFrame, FragmentSecond())
                    addToBackStack(null)
                    commit()
                }
            }
        }
    }
}