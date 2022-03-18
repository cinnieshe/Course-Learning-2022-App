package com.example.year3spring.ui.fina3203.model

import com.example.year3spring.R
import com.example.year3spring.ui.fina3203.data.FinaLectureTitle

class FinaLectureTitleDataSource {
    fun loadData(): List<FinaLectureTitle> {
        return listOf<FinaLectureTitle>(
            FinaLectureTitle(R.string.l1),
            FinaLectureTitle(R.string.l2),
            FinaLectureTitle(R.string.l3),
            FinaLectureTitle(R.string.l4),
            FinaLectureTitle(R.string.l5),
            FinaLectureTitle(R.string.l6),
            FinaLectureTitle(R.string.l7),
            FinaLectureTitle(R.string.l8),
            FinaLectureTitle(R.string.l9),
            FinaLectureTitle(R.string.lX),
        )
    }
}