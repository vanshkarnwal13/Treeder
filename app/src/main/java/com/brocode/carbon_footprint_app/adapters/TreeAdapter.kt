package com.brocode.carbon_footprint_app.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.brocode.carbon_footprint_app.R
import com.brocode.carbon_footprint_app.models.Tree

class TreeAdapter internal constructor(
    private val context: Context,
    private val trees: ArrayList<Tree>
):
    RecyclerView.Adapter<TreeAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TreeAdapter.ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.layout_tree, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: TreeAdapter.ViewHolder, position: Int) {
        holder.tree_dp.setBackgroundResource((trees.get(position).type).toInt())
        val info="${trees.get(position).name}\n${trees.get(position).age}"
        holder.tree_info.text=info
    }

    override fun getItemCount(): Int {
        return trees.size
    }

    class ViewHolder constructor(itemView: View):
        RecyclerView.ViewHolder(itemView){
        var tree_dp:ImageView
        var tree_info:TextView

        init{
            tree_dp=itemView.findViewById(R.id.imageView8)
            tree_info=itemView.findViewById(R.id.tree_info)
        }
    }
}