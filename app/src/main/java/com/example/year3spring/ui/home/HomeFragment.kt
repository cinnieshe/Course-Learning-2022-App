package com.example.year3spring.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.year3spring.databinding.FragmentHomeBinding
import com.example.year3spring.ui.home.model.CourseDataSource
import com.example.year3spring.ui.home.model.HomeViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val courseDataSet = CourseDataSource().loadData()
        val recyclerView = binding.recyclerViewCourse
        recyclerView.adapter = HomeCourseAdapter(courseDataSet)
        recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        recyclerView.setHasFixedSize(true)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}