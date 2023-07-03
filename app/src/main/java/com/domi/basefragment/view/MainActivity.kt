package com.domi.basefragment.view

import android.os.Bundle
import com.domi.basefragment.R
import com.domi.basefragment.base.BaseActivity
import com.domi.basefragment.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding {
            supportFragmentManager.beginTransaction()
                .add(R.id.fcMain, MainFragment())
                .commit()
        }
    }
}