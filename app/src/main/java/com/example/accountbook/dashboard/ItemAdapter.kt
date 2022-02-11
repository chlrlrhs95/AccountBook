package com.example.accountbook.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.accountbook.R
import com.example.accountbook.data.Item

class ItemAdapter(private val data: List<Item>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(data[position])

    override fun getItemCount(): Int = data.size
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val ivIcon: ImageView = view.findViewById(R.id.ivIcon)
    private val tvTime: TextView = view.findViewById(R.id.tvTime)
    private val tvValue: TextView = view.findViewById(R.id.tvValue)
    private val tvName: TextView = view.findViewById(R.id.tvName)

    fun bind(item: Item) {
        ivIcon.setImageResource(item.image ?: R.drawable.ic_baseline_attach_money_24)

        tvTime.text = item.time.toString()
        tvName.text = item.name
        tvValue.text = item.value.toString()
    }
}
