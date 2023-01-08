package com.example.recylerviews2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context:Context, val newList:Array<dataClass>):
        RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.recylayout, parent, false)
                return MyviewHolder(view)
        }


        override fun getItemCount(): Int {
                return newList.size
        }
        class MyviewHolder(Itemview:View):RecyclerView.ViewHolder(Itemview)
        {
                val Textdata2=Itemview.findViewById<TextView>(R.id.textName_new)
                val Imagetwo=Itemview.findViewById<ImageView>(R.id.image2)
        }
        class newViewHolder(Itemview:View):RecyclerView.ViewHolder(Itemview)
        {
                val Textdata1=Itemview.findViewById<TextView>(R.id.textName)
                val ImageOne=Itemview.findViewById<ImageView>(R.id.image1)
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                TODO("Not yet implemented")
        }


}