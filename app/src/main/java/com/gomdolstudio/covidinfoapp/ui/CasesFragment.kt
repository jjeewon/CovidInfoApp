package com.gomdolstudio.covidinfoapp.ui

import android.content.Context
import android.content.Intent
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gomdolstudio.covidinfoapp.data.CasesLocation
import com.gomdolstudio.covidinfoapp.data.Colors
import com.gomdolstudio.covidinfoapp.databinding.FragmentCasesBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class CasesFragment: DaggerFragment() {
    @Inject
    lateinit var viewModelProvider: ViewModelProvider
    @Inject
    lateinit var binding: FragmentCasesBinding
    private lateinit var casesViewModel: CasesViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null){
            casesViewModel.loadCases()
        }

        binding.lifecycleOwner = this
        binding.casesViewModel = casesViewModel

        casesViewModel.getLiveCases()
            .observe(
                viewLifecycleOwner, Observer { casesLocation: CasesLocation? -> getLocation(casesLocation!!) }
            )

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        casesViewModel = viewModelProvider.get(CasesViewModel::class.java)
    }

    fun getLocation(casesLocation: CasesLocation){
        val a = 3
        val b = 4
        var bgShape : GradientDrawable = binding.chungbuk.background as GradientDrawable
        bgShape.setColor(Colors.colors[5])
    }

    fun setColorOfShape(textView: TextView, colorNum: Int){
        var bgShape : GradientDrawable = textView.background as GradientDrawable
        bgShape.setColor(Colors.colors[colorNum])
    }

}