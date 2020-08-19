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

class QadhaListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_qadha_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.ibBack).setOnClickListener {
            findNavController().popBackStack()
        }

        view.findViewById<Button>(R.id.bGoToSolatInsight).setOnClickListener {
            findNavController().navigate(R.id.actQadhaListToSolatInsight)
        }
    }
}