package com.brocode.carbon_footprint_app.views

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.brocode.carbon_footprint_app.R
import com.brocode.carbon_footprint_app.adapters.TreeAdapter
import com.brocode.carbon_footprint_app.models.Tree
import com.brocode.carbon_footprint_app.viewmodels.TreeViewModel
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.layout_trees.view.*

class TreesFragment() : Fragment() {
    constructor(context: Context) : this()

    private lateinit var dataSet:ArrayList<Tree>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root=inflater.inflate(R.layout.layout_trees, container, false)

        dataSet=ArrayList()
        feedTrees()
        val treeAdapter=TreeAdapter(context!!, dataSet)
        root.trees_view.layoutManager=LinearLayoutManager(context)
        root.trees_view.adapter=treeAdapter

        return root
    }

    fun feedTrees(){
        dataSet.add(Tree("Bob", 60, 6, (R.drawable.tree1).toString(), LatLng(130.0, 130.0)))
        dataSet.add(Tree("Max", 70, 7, (R.drawable.tree2).toString(), LatLng(130.0, 130.0)))
        dataSet.add(Tree("Bro", 80, 8, (R.drawable.tree3).toString(), LatLng(130.0, 130.0)))
    }
}