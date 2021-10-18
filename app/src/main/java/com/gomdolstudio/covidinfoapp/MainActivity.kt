package com.gomdolstudio.covidinfoapp

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gomdolstudio.covidinfoapp.databinding.ActivityMainBinding
import com.gomdolstudio.covidinfoapp.ui.CasesFragment
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, CasesFragment())
            .commitNow()

    }


}