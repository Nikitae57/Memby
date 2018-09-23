package ru.nikitae57.englisher.layout.dictionary


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_dictionary.*
import ru.nikitae57.englisher.R
import ru.nikitae57.englisher.dictionary.Entry

class DictionaryFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_dictionary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView? = view.findViewById(R.id.dict_rv)
        recyclerView!!.layoutManager = LinearLayoutManager(context)

        val array = ArrayList<Entry>()
        array.add(Entry("Cow", "Animal"))
        array.add(Entry("Cow", "Animal"))
        array.add(Entry("Cow", "Animal"))
        array.add(Entry("Cow", "Animal"))
        array.add(Entry("Cow", "Animal"))
        recyclerView.adapter = DictionaryAdapter(array)
    }
}
