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
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.MapsInitializer
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.layout_shelter.view.*

class ShelterFragment() : Fragment() {
    constructor(context: Context) : this()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root=inflater.inflate(R.layout.layout_shelter, container, false)

        root.mapView.onCreate(savedInstanceState)
        root.mapView.onResume()
        MapsInitializer.initialize(context)

        root.mapView.getMapAsync { map ->
            if (ActivityCompat.checkSelfPermission(
                    context!!,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    context!!,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ){
                requestPermissions(arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION), 44)
            }
            else{
                map.isMyLocationEnabled=true
                map.setOnMapClickListener {
                    map.clear()
                    map.animateCamera(CameraUpdateFactory.newLatLngZoom(it, 15.toFloat()))
                    val markerOptions=MarkerOptions()
                    markerOptions.position(it)
                    map.addMarker(markerOptions)
                }
            }
        }
        return root
    }
}