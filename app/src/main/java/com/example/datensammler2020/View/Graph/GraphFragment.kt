package com.example.datensammler2020.View.Graph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.datensammler2020.R
import com.example.datensammler2020.View.Options.OptionsFragment

class GraphFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_graph, container, false)
    }

    companion object {
        fun newInstance(): GraphFragment = GraphFragment()
    }
}