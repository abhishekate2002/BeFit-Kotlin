package com.example.befit.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.befit.R
import com.example.befit.databinding.FragmentGalleryBinding
import com.example.befit.diet.age18to25
import com.example.befit.diet.age26to30
import com.example.befit.diet.age31to50
import com.example.befit.workout.WorkoutSelector

class Diet : Fragment(R.layout.fragment_gallery ) {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.agecard18to25.setOnClickListener {
            activity?.let{
                val intent = Intent (it, age18to25::class.java)
                it.startActivity(intent)
            }
        }
        binding.agecard26to30.setOnClickListener {
            activity?.let{
                val intent = Intent (it, age26to30::class.java)
                it.startActivity(intent)
            }
        }
        binding.agecard30to50.setOnClickListener {
            activity?.let{
                val intent = Intent (it, age31to50::class.java)
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