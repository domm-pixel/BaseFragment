package com.domi.basefragment.base

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<B : ViewDataBinding>(
    private val layoutRes: Int
) : AppCompatActivity() {
    protected lateinit var dataBinding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, layoutRes)
        dataBinding.lifecycleOwner = this
    }

    /**
     * use in activity like .. binding { /*codes: */}
     */
    protected fun binding(action: B.() -> Unit) {
        dataBinding.run(action)
    }

    // toStart activity intents
    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)
    }
}