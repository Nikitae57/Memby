package ru.nikitae57.englisher.layout.dictionary

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import ru.nikitae57.englisher.R
import ru.nikitae57.englisher.dictionary.Entry

class DictionaryAdapter(private var dictionary: ArrayList<Entry>) : RecyclerView.Adapter<DictionaryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DictionaryViewHolder {
        return DictionaryViewHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.dictionary_view_holder,
                parent,
                false)
        )
    }

    override fun getItemCount() = dictionary.size

    override fun onBindViewHolder(holder: DictionaryViewHolder, position: Int) {
        holder.bind(position, dictionary)
    }

}