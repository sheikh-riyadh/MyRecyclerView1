package com.example.myrecyclerview1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class MyAdapter(var context: Context,var items : List<Hobby>,var clickListener: OnItemClickListener):RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.titleTxt.text = items[position].title

        holder.initialize(items[position],clickListener)
    }

}
class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    
    var titleTxt: TextView = itemView.txtID

    fun initialize(item: Hobby, action: OnItemClickListener){
        titleTxt.text = item.title

        itemView.setOnClickListener {
            action.onItemClick(item ,adapterPosition)
        }
    }
}

interface OnItemClickListener{
    fun onItemClick(item : Hobby ,position: Int)
}