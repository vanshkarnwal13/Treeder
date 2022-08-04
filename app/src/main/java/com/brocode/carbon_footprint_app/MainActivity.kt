package com.brocode.carbon_footprint_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.brocode.carbon_footprint_app.views.*
import kotlinx.android.synthetic.main.activtiy_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activtiy_main)

        replace(HomeFragment())

        home.setOnClickListener{ replace(HomeFragment()) }
        activities.setOnClickListener { replace(ActivitiesFragment()) }
        detect.setOnClickListener { replace(DetectFragment()) }
        trees.setOnClickListener { replace(TreesFragment()) }
        donate.setOnClickListener { replace(ShelterFragment()) }
    }

    fun replace(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }
}