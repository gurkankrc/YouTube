package com.example.youtube

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtube.databinding.CardTasarimBinding

class VideolarAdapter(var mContext: Context,var videolarListesi:List<Videolar>)
    :RecyclerView.Adapter<VideolarAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root){

        var tasarim:CardTasarimBinding
        init {
            this.tasarim=tasarim
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim =CardTasarimBinding.inflate(layoutInflater,parent,false )
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

        val video = videolarListesi.get(position)
        val t=holder.tasarim

        t.imageViewVideo.setImageResource((mContext.resources.getIdentifier(video.videoResimAdi,"drawable",mContext.packageName)))
        t.imageViewIcon.setImageResource(mContext.resources.getIdentifier(video.videoIconAd,"drawable",mContext.packageName))
        t.textViewVideoAd.text = video.videoAdi
        t.textViewGoruntuleme.text = video.videoGoruntulenmeSayisi
        t.textViewKanalAd.text = video.videoKanalAdi
        t.textViewVideoTarih.text = video.videoYuklenmeTarih

    }

    override fun getItemCount(): Int {
        return videolarListesi.size
    }
}