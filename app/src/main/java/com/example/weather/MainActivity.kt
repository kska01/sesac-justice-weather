package com.example.weather

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.weather.databinding.ActivityMainBinding
import java.text.DateFormatSymbols

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

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

        val month = DateFormatSymbols().months


    }

    val list = arrayOf(
        "서울",
        "인천",
        "춘천",
        "강릉",
        "대전",
        "대구",
        "전주",
        "목포",
        "광주",
        "부산",
        "울산",
        "제주"
    ).sort()
}