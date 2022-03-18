package com.example.year3spring.ui.fina3203.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.year3spring.R
import com.example.year3spring.ui.fina3203.data.FinaLectureTitle

class FinaLectureTitleAdapter(private val dataSet: List<FinaLectureTitle>) :
    RecyclerView.Adapter<FinaLectureTitleAdapter.FinaLectureTitleViewHolder>() {

    class FinaLectureTitleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val lectureTitle: TextView = view.findViewById(R.id.text_fina_lecture_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FinaLectureTitleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fina_lecture_title_list_item, parent, false)

        return FinaLectureTitleViewHolder(view)
    }

    override fun onBindViewHolder(holder: FinaLectureTitleViewHolder, position: Int) {
        holder.lectureTitle.setText(dataSet[position].lectureTitleId)
    }

    override fun getItemCount(): Int = dataSet.size
}