package my.farhan.damai.ui

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.navigation.fragment.findNavController
import my.farhan.damai.R

class SplashFragment : Fragment() {
    private lateinit var motionLayout: MotionLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        motionLayout = view.findViewById(R.id.motionLayout)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler().postDelayed({
            motionLayout.transitionToEnd()
        }, 500)

        Handler().postDelayed({
            findNavController().navigate(R.id.actSplashToHome)
        }, 2000)
    }
}