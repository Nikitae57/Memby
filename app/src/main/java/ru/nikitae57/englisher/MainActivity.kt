package ru.nikitae57.englisher

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import ru.nikitae57.englisher.layout.dictionary.DictionaryFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = DictionaryFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_view, fragment).commit()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.action_open_dictionary -> {
                // TODO make dictionary fragment
            }

            R.id.action_open_learn_screen -> {
                // TODO make learn fragment
            }

            R.id.action_open_statistics -> {
                // TODO make statistics fragment
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
