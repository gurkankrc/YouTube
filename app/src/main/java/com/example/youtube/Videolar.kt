package com.example.youtube

import java.io.Serializable

data class Videolar(var videoId:Int,
                    var videoResimAdi:String,
                    val videoIconAd:String,
                    var videoAdi:String,
                    var videoKanalAdi:String,
                    var videoGoruntulenmeSayisi:String,
                    var videoYuklenmeTarih:String) : Serializable {
}