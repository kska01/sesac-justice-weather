package com.example.weather.datasource

import com.example.weather.R

class ForecastData {
    fun loadForecastList() : MutableList<Forecast> {
        return mutableListOf(
            Forecast(
                R.drawable.sunny,
                "11-10\n15:00",
                "3.7℃"
            ),
            Forecast(
                R.drawable.cloud,
                "11-10\n18:00",
                "1.6℃"
            ),
            Forecast(
                R.drawable.sunny,
                "11-10\n21:00",
                "1.6℃"
            ),
            Forecast(
                R.drawable.sunny,
                "11-11\n00:00",
                "2.4℃"
            ),
            Forecast(
                R.drawable.cloud,
                "11-11\n03:00",
                "5.1℃"
            ),
            Forecast(
                R.drawable.sunny,
                "11-10\n15:00",
                "3.7℃"
            ),
            Forecast(
                R.drawable.cloud,
                "11-10\n18:00",
                "1.6℃"
            ),
            Forecast(
                R.drawable.sunny,
                "11-10\n21:00",
                "1.6℃"
            ),
            Forecast(
                R.drawable.sunny,
                "11-11\n00:00",
                "2.4℃"
            ),
            Forecast(
                R.drawable.cloud,
                "11-11\n03:00",
                "5.1℃"
            ),
        )
    }
}