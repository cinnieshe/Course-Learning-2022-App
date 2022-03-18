package com.example.year3spring.ui.fina3203

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.year3spring.databinding.FinaFragmentBinding
import com.example.year3spring.ui.fina3203.adapter.FinaLectureTitleAdapter
import com.example.year3spring.ui.fina3203.model.FinaLectureTitleDataSource

class FinaFragment : Fragment() {

    private var _binding: FinaFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val finaViewModel =
//            ViewModelProvider(this).get(FinaViewModel::class.java)

        _binding = FinaFragmentBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val textView: TextView = binding.textFina
//        finaViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val lectureTitleData = FinaLectureTitleDataSource().loadData()
        val recyclerView = binding.finaLectureTitleRecyclerView
        recyclerView.adapter = FinaLectureTitleAdapter(lectureTitleData)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}