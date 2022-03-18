package com.example.year3spring.ui.fina3203.model

import com.example.year3spring.R
import com.example.year3spring.ui.fina3203.data.FinaLectureContent

class FinaLectureContentDataSource {
    fun loadData() : List<FinaLectureContent> {
        return listOf(
            FinaLectureContent(R.string.l1_content),
            FinaLectureContent(R.string.l2_content),
            FinaLectureContent(R.string.l3_content),
            FinaLectureContent(R.string.l4_content),
            FinaLectureContent(R.string.l5_content),
            FinaLectureContent(R.string.l6_content),
            FinaLectureContent(R.string.l7_content),
            FinaLectureContent(R.string.l8_content),
            FinaLectureContent(R.string.l9_content),
            FinaLectureContent(R.string.lX_content)
        )
    }
}