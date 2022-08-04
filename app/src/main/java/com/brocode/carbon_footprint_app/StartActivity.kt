package com.brocode.carbon_footprint_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brocode.carbon_footprint_app.views.IntroFragment1
import com.brocode.carbon_footprint_app.views.IntroFragment2
import com.brocode.carbon_footprint_app.views.IntroFragment3
import com.brocode.carbon_footprint_app.views.ShelterFragment

var flag=0

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_start)

        supportFragmentManager.beginTransaction().replace(R.id.container, IntroFragment1()).commit()
    }

    fun replace(){
        if(flag==0) {
            supportFragmentManager.beginTransaction().replace(R.id.container, IntroFragment2()).commit()
            flag+=1
        }else
            supportFragmentManager.beginTransaction().replace(R.id.container, IntroFragment3()).commit()
    }
}