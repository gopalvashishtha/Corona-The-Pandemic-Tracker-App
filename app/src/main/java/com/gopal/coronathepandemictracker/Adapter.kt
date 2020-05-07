package com.gopal.coronathepandemictracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_list.view.*

class Adapter (val list: List<StatewiseItem>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
     val view = convertView ?: LayoutInflater.from(parent?.context).inflate(R.layout.item_list,parent,false)
        val item = list[position]
        view.confirmed_text_view.text = item.confirmed
        view.recovered_text_view.text = item.recovered
        view.active_text_view.text = item.active
        view.death_text_view.text = item.deaths
        view.state_text_view.text = item.state

        return view
    }

    override fun getItem(position: Int) = list[position]


    override fun getItemId(position: Int) = position.toLong()



    override fun getCount() = list.size


}