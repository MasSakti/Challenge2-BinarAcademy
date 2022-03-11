package com.example.challenge2

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(var context: Context, var arrayList: ArrayList<GridItem>) : BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(p0: Int): Any {
        return arrayList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view: View = View.inflate(context, R.layout.grid_item, null)

        var icons: ImageView = view.findViewById(R.id.ivGrid)
        var names: TextView = view.findViewById(R.id.tvGrid)

        var gridItem: GridItem = arrayList.get(p0)

        icons.setImageResource(gridItem.icons!!)
        names.text = gridItem.name

        return view
    }

}