package my.farhan.damai.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import my.farhan.damai.R

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<ImageButton>(R.id.ibSettings).setOnClickListener {
            findNavController().navigate(R.id.actHomeToSettings)
        }

        view.findViewById<View>(R.id.vWaktuSolat).setOnClickListener {
            findNavController().navigate(R.id.actHomeToPrayerTime)
        }

        view.findViewById<View>(R.id.vWeather).setOnClickListener {
            findNavController().navigate(R.id.actHomeToWeather)
        }

        view.findViewById<Button>(R.id.bAddQadha).setOnClickListener {
            findNavController().navigate(R.id.actHomeToQadhaList)
        }
    }
}