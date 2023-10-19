package com.example.befit.ui.slideshow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.befit.R
import com.example.befit.databinding.FragmentSlideshowBinding
import com.example.befit.workout.WorkoutSelector
import com.example.befit.workout.WorkoutSelector2
import com.example.befit.workout.WorkoutSelector3

class SlideshowFragment : Fragment(R.layout.fragment_slideshow) {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val chestWorkoutCard = view?.findViewById<CardView>(R.id.chestWorkoutCard)
        binding.beginnerCard.setOnClickListener {
            activity?.let{
                val intent = Intent (it, WorkoutSelector::class.java)
                it.startActivity(intent)
            }
        }
        binding.averageCard.setOnClickListener {
            activity?.let {
                val intent = Intent(it,WorkoutSelector2::class.java)
                it.startActivity(intent)
            }

        }

        binding.advanceCard.setOnClickListener {
            activity?.let {
                val intent = Intent(it, WorkoutSelector3::class.java)
                it.startActivity(intent)
            }

        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}