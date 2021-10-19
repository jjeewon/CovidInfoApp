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
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gomdolstudio.covidinfoapp.data.CasesLocation
import com.gomdolstudio.covidinfoapp.data.Colors
import com.gomdolstudio.covidinfoapp.data.NewsItems
import com.gomdolstudio.covidinfoapp.databinding.FragmentCasesBinding
import com.gomdolstudio.covidinfoapp.util.convertMarkDownToString
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class CasesFragment: DaggerFragment() {
    @Inject
    lateinit var viewModelProvider: ViewModelProvider
    @Inject
    lateinit var binding: FragmentCasesBinding
    private lateinit var casesViewModel: CasesViewModel
    private lateinit var newsViewModel: NewsViewModel

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
            newsViewModel.loadNews()
            casesViewModel.loadCases()

        }

        binding.lifecycleOwner = this
        binding.casesViewModel = casesViewModel
        binding.newsViewModel = newsViewModel

        casesViewModel.getLiveCases()
            .observe(
                viewLifecycleOwner, Observer { casesLocation: CasesLocation? -> getLocation(casesLocation!!) }
            )
        newsViewModel.getLiveNews()
                .observe(
                        viewLifecycleOwner, Observer { newsItems: NewsItems? -> getNews(newsItems!!) }
                )

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        casesViewModel = viewModelProvider.get(CasesViewModel::class.java)
        newsViewModel = viewModelProvider.get(NewsViewModel::class.java)
    }

    fun getLocation(casesLocation: CasesLocation){
        val a = 3
        val b = 4
        var bgShape : GradientDrawable = binding.chungbuk.background as GradientDrawable
        bgShape.setColor(Colors.colors[5])
    }

    fun getNews(newsItems: NewsItems){
        val b = 3
        val a = 5
        Log.d("ggg", convertMarkDownToString(newsItems.items.get(2).title))
    }

    fun setColorOfShape(textView: TextView, colorNum: Int){
        var bgShape : GradientDrawable = textView.background as GradientDrawable
        bgShape.setColor(Colors.colors[colorNum])
    }

}