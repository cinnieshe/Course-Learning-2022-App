package com.example.year3spring.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.year3spring.R
import com.example.year3spring.ui.home.data.Course

class HomeCourseAdapter(private val dataSet: List<Course>) :
    RecyclerView.Adapter<HomeCourseAdapter.CourseViewHolder>() {

    class CourseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val courseTitle : TextView = view.findViewById(R.id.course_title)
        val courseIcon : ImageView = view.findViewById(R.id.course_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_course_list_item, parent, false)

        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.courseIcon.setImageResource(dataSet[position].courseIconId)
        holder.courseTitle.setText(dataSet[position].courseTitleId)
    }

    override fun getItemCount() = dataSet.size
}