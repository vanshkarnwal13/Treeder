package com.brocode.carbon_footprint_app.views

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.brocode.carbon_footprint_app.LoginActivity
import com.brocode.carbon_footprint_app.MainActivity
import com.brocode.carbon_footprint_app.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.MapsInitializer
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.layout_intro3.view.*
import kotlinx.android.synthetic.main.layout_shelter.view.*

class IntroFragment3() : Fragment() {
    constructor(context: Context) : this()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root=inflater.inflate(R.layout.layout_intro3, container, false)

        root.get_started.setOnClickListener { startActivity(Intent(context, LoginActivity::class.java)) }

        return root
    }
}