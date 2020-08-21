package my.farhan.damai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import my.farhan.damai.data.Solat

class MainActivity : AppCompatActivity() {

    private val allSolat: ArrayList<Solat> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMockData()
    }

    private fun initMockData() {
        val imsak = Solat(getString(R.string.imsak), getString(R.string.waktuImsak),
            getString(R.string.waktuImsakClock), R.drawable.ic_imsak, R.drawable.ic_disabled)
        val subuh = Solat(getString(R.string.subuh), getString(R.string.waktuSubuh),
            getString(R.string.waktuSubuhClock), R.drawable.ic_subuh, R.drawable.ic_missed)
        val syuruk = Solat(getString(R.string.syuruk), getString(R.string.waktuSyuruk),
            getString(R.string.waktuSyurukClock), R.drawable.ic_syuruk, R.drawable.ic_disabled)
        val dhuha = Solat(getString(R.string.dhuha), getString(R.string.waktuDhuha),
            getString(R.string.waktuDhuhaClock), R.drawable.ic_dhuha, R.drawable.ic_disabled)
        val zohor = Solat(getString(R.string.zohor), getString(R.string.waktuZohor),
            getString(R.string.waktuZohorClock), R.drawable.ic_zohor, R.drawable.ic_done)
        val asar = Solat(getString(R.string.asar), getString(R.string.waktuAsar),
            getString(R.string.waktuAsarClock), R.drawable.ic_asar, R.drawable.ic_done)
        val maghrib = Solat(getString(R.string.maghrib), getString(R.string.waktuMaghrib),
            getString(R.string.waktuMaghribClock), R.drawable.ic_maghrib, R.drawable.ic_done)
        val isyak = Solat(getString(R.string.isyak), getString(R.string.waktuIsyak),
            getString(R.string.waktuIsyakClock), R.drawable.ic_isyak, R.drawable.ic_todo)

        allSolat.add(imsak)
        allSolat.add(subuh)
        allSolat.add(syuruk)
        allSolat.add(dhuha)
        allSolat.add(zohor)
        allSolat.add(asar)
        allSolat.add(maghrib)
        allSolat.add(isyak)

    }

    fun getAllSolat(): ArrayList<Solat> {
        return allSolat
    }
}