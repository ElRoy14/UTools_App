package com.appsmoviles.utools_app.ui.clima

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsmoviles.utools_app.R
import com.appsmoviles.utools_app.databinding.FragmentClimaBinding
import com.appsmoviles.utools_app.databinding.FragmentUniversidadesBinding

class ClimaFragment : Fragment() {

    private var _binding: FragmentClimaBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentClimaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}