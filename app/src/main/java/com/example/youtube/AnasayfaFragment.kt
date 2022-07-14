package com.example.youtube

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.youtube.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarUstMenu)


        tasarim.rwkesfet.layoutManager=StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        var kesfetListesi = ArrayList<Kesfet>()

        val k1=Kesfet(1,"Tümü")
        val k2=Kesfet(2,"Canlı")
        val k3=Kesfet(3,"Oyun")
        val k4=Kesfet(4,"Sitcom'lar")
        val k5=Kesfet(5,"Futbol")
        val k6=Kesfet(6,"Yemek Pişirme")
        val k7=Kesfet(7,"Son Yüklenenler")
        val k8=Kesfet(8,"İzlenenler")



        kesfetListesi.add(k1)
        kesfetListesi.add(k2)
        kesfetListesi.add(k3)
        kesfetListesi.add(k4)
        kesfetListesi.add(k5)
        kesfetListesi.add(k6)
        kesfetListesi.add(k7)
        kesfetListesi.add(k8)


        val adapter1 = KesfetAdapter(requireContext(),kesfetListesi)
        tasarim.rwkesfet.adapter = adapter1





        tasarim.rw1.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)

        var videolarListesi = ArrayList<Videolar>()

        val v1 = Videolar(1,"yeni_resim1","yeni_icon1","Mabel Matiz - Karakol","mabelmatiz","6,7 Mn Görüntülenme","9 gün önce")
        val v2 = Videolar(2,"yeni_resim2","yeni_icon2","Kurtuluş Kuş & Feryal Sepin & Burak Bulut - Karalaya Karalaya","netd müzik","9 Mn Görüntülenme","9 gün önce")
        val v3 = Videolar(3,"yeni_resim3","yeni_icon3","Murda & Hadise - Imdat (prod.Spanker)","Murda","4,2 Mn Görüntülenme","9 gün önce")
        val v4 = Videolar(4,"yeni_resim4","yeni_icon2","Semicenk & Mustafa Ceceli - Dayan ","netd müzik","8,9 Mn Görüntülenme","2 hafta önce")

        videolarListesi.add(v1)
        videolarListesi.add(v2)
        videolarListesi.add(v3)
        videolarListesi.add(v4)


        val adapter = VideolarAdapter(requireContext(),videolarListesi)
        tasarim.rw1.adapter = adapter

        return tasarim.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}