package my.farhan.damai.ui.prayertime

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import my.farhan.damai.R
import my.farhan.damai.data.Solat
import java.util.*

class PrayerTimeAdapter(private val context: Context, private val listener: Listener, private val allSolat: ArrayList<Solat>)
    : RecyclerView.Adapter<PrayerTimeAdapter.ViewHolder>() {

    private var selectedPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_prayer_time, parent, false)

        val clContainer = view.findViewById<ConstraintLayout>(R.id.clContainer)
        val ibSolatState = view.findViewById<ImageButton>(R.id.ibSolatState)
        val ivWaktuSolat = view.findViewById<ImageView>(R.id.ivWaktuSolat)
        val tvWaktuSolatLabel = view.findViewById<TextView>(R.id.tvWaktuSolatLabel)
        val tvWaktuSolat = view.findViewById<TextView>(R.id.tvWaktuSolat)
        return ViewHolder(view, clContainer, ibSolatState, ivWaktuSolat, tvWaktuSolatLabel, tvWaktuSolat)
    }

    override fun onBindViewHolder(vh: ViewHolder, position: Int) {
        val solat = allSolat[position]
        vh.clContainer.setOnClickListener {
            selectedPosition = position
            listener.onClick(solat)
            notifyDataSetChanged() }

        if (selectedPosition == position)
            vh.clContainer.background = ContextCompat.getDrawable(context, R.drawable.shape_rectangle_4)
        else
            vh.clContainer.background = ContextCompat.getDrawable(context, android.R.color.transparent)

        vh.ibSolatState.setImageResource(solat.state)
        vh.ivWaktuSolat.setImageResource(solat.icon)
        vh.tvWaktuSolatLabel.text = solat.name
        vh.tvWaktuSolat.text = solat.waktuClock
    }

    override fun getItemCount(): Int { return allSolat.size }

    interface Listener {
        fun onClick(solat: Solat)
    }

    class ViewHolder(val view: View, val clContainer: ConstraintLayout, val ibSolatState: ImageButton,
    val ivWaktuSolat: ImageView, val tvWaktuSolatLabel: TextView, val tvWaktuSolat: TextView) :
        RecyclerView.ViewHolder(view)
}