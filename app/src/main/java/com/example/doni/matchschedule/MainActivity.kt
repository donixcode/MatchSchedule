package com.example.doni.matchschedule

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView

class MainActivity : AppCompatActivity(){

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_prevmatch -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, PastFragment()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_nextmatch -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, NextFragment()).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, PastFragment()).commit()

    }


}
