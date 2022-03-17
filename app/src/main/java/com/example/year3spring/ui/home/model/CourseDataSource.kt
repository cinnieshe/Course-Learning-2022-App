package com.example.year3spring.ui.home.model

import com.example.year3spring.R
import com.example.year3spring.ui.home.data.Course

class CourseDataSource {
    fun loadData() : List<Course> {
        return listOf<Course>(
            Course(R.drawable.ic_fina, R.string.fina),
            Course(R.drawable.ic_comp_org, R.string.comp_org),
            Course(R.drawable.ic_comp_cloud, R.string.comp_cloud),
            Course(R.drawable.ic_comp_alg, R.string.comp_alg),
            Course(R.drawable.ic_isom, R.string.isom),
            Course(R.drawable.ic_rmbi, R.string.rmbi)
        )
    }
}