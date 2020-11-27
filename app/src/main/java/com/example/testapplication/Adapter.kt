package com.example.testapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.posts.model.Post

class Adapter (val postList : List<Post> ):RecyclerView.Adapter<Adapter.viewHolder>(){

    class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textviewId = itemView.findViewById<TextView>(R.id.id)
        val textviewuserId = itemView.findViewById<TextView>(R.id.userid)
        val textviewTitle = itemView.findViewById<TextView>(R.id.title)
        val textviewContent= itemView.findViewById<TextView>(R.id.content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return viewHolder(v)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val post : Post = postList[position]
        holder.textviewId?.text = post.id.toString()
        holder.textviewuserId?.text = post.userId.toString()
        holder.textviewTitle?.text = post.title.toString()
        holder.textviewContent?.text = post.body.toString()
    }
}