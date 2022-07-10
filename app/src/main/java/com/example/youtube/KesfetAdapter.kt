package com.example.youtube

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtube.databinding.CardTasarimBinding
import com.example.youtube.databinding.KesfetCardTasarimBinding

class KesfetAdapter(var mContext: Context,var kesfetListesi:List<Kesfet>)
    : RecyclerView.Adapter<KesfetAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(tasarim: KesfetCardTasarimBinding): RecyclerView.ViewHolder(tasarim.root){

        var tasarim: KesfetCardTasarimBinding
        init {
            this.tasarim=tasarim
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = KesfetCardTasarimBinding.inflate(layoutInflater,parent,false )
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

        val kesfet = kesfetListesi.get(position)
        val t=holder.tasarim

        t.button.text = kesfet.btn_ad

    }

    override fun getItemCount(): Int {
      return kesfetListesi.size
    }
}