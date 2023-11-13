package com.example.weather.ui

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.weather.R
import com.example.weather.adpater.ForecastRecyclerviewAdapter
import com.example.weather.databinding.ActivityMainBinding
import com.example.weather.datasource.ForecastData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerview: RecyclerView
    private lateinit var adapter: ForecastRecyclerviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinner = binding.spinnerLocation
        ArrayAdapter.createFromResource(
            this,
            R.array.location_list,
            R.layout.spinner_style
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        val data = ForecastData().loadForecastList()
        binding.apply {
            recyclerview = forecastRecyclerview
            adapter = ForecastRecyclerviewAdapter()
            adapter.submitList(data)
            recyclerview.adapter = adapter
        }
    }
}