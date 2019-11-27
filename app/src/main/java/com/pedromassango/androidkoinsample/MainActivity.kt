package com.pedromassango.androidkoinsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.main_activity.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // we get our viewModel from Koin
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        mainViewModel.loadData()?.observe(this, Observer {
Log
        .e("rt",it)
            sd.text = it

//                sd.text = it.page.toString()
//                Toast.makeText(this, it.page.toString(), Toast.LENGTH_SHORT).show()


            // show message coming from ViewModel -> Repository
        })
    }

}
