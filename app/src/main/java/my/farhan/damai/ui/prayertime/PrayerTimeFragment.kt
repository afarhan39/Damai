package my.farhan.damai.ui.prayertime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import my.farhan.damai.MainActivity
import my.farhan.damai.R
import my.farhan.damai.data.Solat

class PrayerTimeFragment : Fragment(), PrayerTimeAdapter.Listener {
    private lateinit var ibBack: ImageButton
    private lateinit var rvWaktuSolat: RecyclerView
    private lateinit var aPrayerTime: PrayerTimeAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_prayer_time, container, false)
        ibBack = view.findViewById(R.id.ibBack)
        rvWaktuSolat = view.findViewById(R.id.rvWaktuSolat)
        aPrayerTime = PrayerTimeAdapter(requireContext(), this, (activity as MainActivity).getAllSolat())
        rvWaktuSolat.adapter = aPrayerTime
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ibBack.setOnClickListener { findNavController().popBackStack() }
    }

    override fun onClick(solat: Solat) {
        Snackbar.make(ibBack, solat.name, Snackbar.LENGTH_SHORT).show()
    }
}