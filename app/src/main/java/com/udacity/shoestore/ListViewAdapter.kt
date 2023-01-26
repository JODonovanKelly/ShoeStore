package com.udacity.shoestore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.udacity.shoestore.models.Shoe

class ListViewAdapter(var context: Context, var shoe: ArrayList<Shoe>): BaseAdapter(){
    override fun getCount(): Int {
        return shoe.count()
    }

    override fun getItem(position: Int): Any {
        return shoe.get (position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    private class ViewHolder(row: View?){
        var txtName: TextView
        var txtSize: TextView
        var txtCompany: TextView
        var txtDescription: TextView

        init {
            this.txtName = row?.findViewById(R.id.shoeName) as TextView
            this.txtSize = row?.findViewById(R.id.shoeSize) as TextView
            this.txtCompany = row?.findViewById(R.id.shoeCompany) as TextView
            this.txtDescription = row?.findViewById(R.id.shoeDescription) as TextView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.fragment_shoe_list, convertView, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }
        else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var shoe: Shoe = getItem(position) as Shoe
        viewHolder.txtName.text = shoe.name
        viewHolder.txtSize.text = shoe.size.toString()
        viewHolder.txtCompany.text = shoe.company
        viewHolder.txtDescription.text = shoe.description

        return view as View
    }
}
