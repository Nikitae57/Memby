package ru.nikitae57.englisher.layout.dictionary

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.dictionary_view_holder.view.*
import ru.nikitae57.englisher.R
import ru.nikitae57.englisher.dictionary.Entry

class DictionaryViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    private var mTvWord: TextView = itemView!!.findViewById(R.id.dict_item_tv_word)
    private var mTvMeaning: TextView = itemView!!.findViewById(R.id.dict_item_tv_meaning)

    fun bind(position: Int, dictionary: ArrayList<Entry>) {
        mTvWord.text = dictionary[position].word
        mTvMeaning.text = dictionary[position].meaning
    }
}