package com.example.bitcoin_app

import com.google.gson.annotations.SerializedName

class DataList ( val data: List<ListItem>)

data class ListItem(
    val name: String,
    val symbol: String,
    val price: Double,
    val percent_change_24h: Double
)

