package com.example.challenge3recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(
    private val listname: List<String>
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from( parent.context).inflate( R.layout.adapter_main, parent, false )
        )
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        holder.text.text = listname[position]
    }

    override fun getItemCount() = listname.size

    class ViewHolder(view: View): RecyclerView.ViewHolder( view ){
        val text = view.findViewById<TextView>(R.id.nama_makanan)
    }

}

