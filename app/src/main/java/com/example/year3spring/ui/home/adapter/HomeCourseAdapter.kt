package com.example.year3spring.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.year3spring.R
import com.example.year3spring.ui.home.data.Course

class HomeCourseAdapter(private val dataSet: List<Course>) :
    RecyclerView.Adapter<HomeCourseAdapter.CourseViewHolder>() {

    class CourseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val courseTitle: TextView = view.findViewById(R.id.course_title)
        val courseIcon: ImageView = view.findViewById(R.id.course_icon)
        val card: CardView = view.findViewById(R.id.home_course_list_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_course_list_item, parent, false)

        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.courseIcon.setImageResource(dataSet[position].courseIconId)
        holder.courseTitle.setText(dataSet[position].courseTitleId)
        holder.card.setOnClickListener {
            when (dataSet[position].courseTitleId) {
                R.string.fina -> it.findNavController().navigate(R.id.action_nav_home_to_nav_fina)
                R.string.comp_org -> it.findNavController()
                    .navigate(R.id.action_nav_home_to_nav_compOrg)
                // #TODO("4 navigation to go here & have to fix error - not create 2 course fragment from different starting points")
            }
        }
    }

    override fun getItemCount() = dataSet.size
}