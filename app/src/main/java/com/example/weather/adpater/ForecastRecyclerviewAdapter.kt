package com.example.weather.adpater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.weather.databinding.RecyclerviewItemLayoutBinding
import com.example.weather.datasource.Forecast

class ForecastRecyclerviewAdapter() :
    ListAdapter<Forecast, ForecastRecyclerviewAdapter.ListViewHolder>(DiffCallback) {

    private lateinit var binding: RecyclerviewItemLayoutBinding

    class ListViewHolder(private val binding: RecyclerviewItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(forecast: Forecast) {
            binding.apply {
                forecastIc.setImageResource(forecast.icon)
                forecastTime.text = forecast.time
                forecastDegree.text = forecast.degree
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ForecastRecyclerviewAdapter.ListViewHolder {
        binding = RecyclerviewItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ForecastRecyclerviewAdapter.ListViewHolder,
        position: Int
    ) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<Forecast>() {
            override fun areItemsTheSame(oldItem: Forecast, newItem: Forecast): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Forecast, newItem: Forecast): Boolean {
                return oldItem.time == newItem.time
            }

        }
    }
}