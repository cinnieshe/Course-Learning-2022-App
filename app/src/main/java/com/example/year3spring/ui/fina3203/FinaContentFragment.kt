package com.example.year3spring.ui.fina3203

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.year3spring.databinding.FinaContentFragmentBinding
import com.example.year3spring.ui.fina3203.model.FinaLectureContentDataSource
import com.example.year3spring.ui.fina3203.model.FinaLectureTitleDataSource

const val LECTURE_COUNT = 10

class FinaContentFragment : Fragment() {

    private var lectureNum: Int = 0
    private lateinit var finaTitle: TextView
    private lateinit var finaContent: TextView

    private var _binding: FinaContentFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            lectureNum = it.getInt("lecture_num", 0)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FinaContentFragmentBinding.inflate(inflater, container, false)

        finaTitle = binding.textFinaContentTitle
        finaContent = binding.textFinaContent
        setTitleAndContent()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val prevButton: Button = binding.btnFinaPrev
        prevButton.setOnClickListener {
            getPreviousLectureContent()
        }

        val nextButton: Button = binding.btnFinaNext
        nextButton.setOnClickListener {
            getNextLectureContent()
        }
    }

    private fun getPreviousLectureContent() {
        if (lectureNum <= 0) {
            Toast.makeText(
                requireContext(),
                "This is already the first lecture.",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            lectureNum--
            setTitleAndContent()
        }
    }

    private fun getNextLectureContent() {
        if (lectureNum >= LECTURE_COUNT - 1) {
            Toast.makeText(
                requireContext(),
                "This is already the last lecture.",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            lectureNum++
            setTitleAndContent()
        }
    }

    private fun setTitleAndContent() {
        finaTitle.setText(FinaLectureTitleDataSource().loadData()[lectureNum].lectureTitleId)
        finaContent.setText(FinaLectureContentDataSource().loadData()[lectureNum].lectureContentId)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}