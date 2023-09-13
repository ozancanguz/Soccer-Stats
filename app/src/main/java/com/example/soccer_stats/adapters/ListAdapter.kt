package com.example.soccer_stats.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.soccer_stats.R
import com.example.soccer_stats.data.Result
import com.example.soccer_stats.data.Results
import com.example.soccer_stats.databinding.ResultRvRowLayoutBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    inner class ListViewHolder(private val binding: ResultRvRowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(result: Result) {
            binding.hometeamtv.text = result.home
            binding.AwayTv.text = result.away
            binding.scoretv.text = result.skor
        }
    }

    private var resultList = emptyList<Result>()

    fun setData(newData: Results) {
        this.resultList = newData.result
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ResultRvRowLayoutBinding.inflate(inflater, parent, false)
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return resultList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val currentResult = resultList[position]
        holder.bind(currentResult)
    }
}