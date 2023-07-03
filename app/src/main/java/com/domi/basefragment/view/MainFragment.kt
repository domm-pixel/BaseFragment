package com.domi.basefragment.view

import android.os.Bundle
import android.view.View
import com.domi.basefragment.R
import com.domi.basefragment.base.BaseFragment
import com.domi.basefragment.databinding.FragmentMainBinding

class MainFragment: BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding {
            tvSample1.text = "this is base fragment sample!"
        }
    }
}