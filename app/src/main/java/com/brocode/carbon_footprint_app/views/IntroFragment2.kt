package com.brocode.carbon_footprint_app.views

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.brocode.carbon_footprint_app.R
import com.brocode.carbon_footprint_app.StartActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.MapsInitializer
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.layout_intro2.view.*
import kotlinx.android.synthetic.main.layout_shelter.view.*
import java.util.*

class IntroFragment2() : Fragment() {
    constructor(context: Context) : this()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root=inflater.inflate(R.layout.layout_intro2, container, false)

        root.next.setOnClickListener { (Objects.requireNonNull<Any?>(activity) as StartActivity).replace() }

        return root
    }
}