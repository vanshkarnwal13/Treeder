package com.brocode.carbon_footprint_app.views

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.brocode.carbon_footprint_app.R
import com.brocode.carbon_footprint_app.StartActivity
import kotlinx.android.synthetic.main.layout_intro1.view.*
import java.util.*

class ActivitiesFragment() : Fragment() {
    constructor(context: Context) : this()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root=inflater.inflate(R.layout.layout_activities, container, false)

        return root
    }
}