package com.example.recylerviews2

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val newList:Array<dataClass>): RecyclerView.Adapter<MyAdapter.MyviewHolder>()


{
        class MyviewHolder(Itemview:View):RecyclerView.ViewHolder(Itemview)
        {
                //Here we gett the views
                val textdata=Itemview.findById<TextView>(R.id.TextViewdata)
                val textdata=Itemview.findViewById<TextView>(R.id.Text)
                val data2

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.recylayout, parent, false)
                return MyviewHolder(view)
        }

        override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
                TODO("Not yet implemented")
        }

        override fun getItemCount(): Int {
                return newList.size
        }


}