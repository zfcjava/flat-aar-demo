package com.example.lib_main_library.activity

import android.os.Bundle
import com.example.lib_base_library.BaseActivity
import com.example.lib_main_library.R
import kotlinx.android.synthetic.main.activity_main_lib.*

class MainLibActivity : BaseActivity(){

    override fun getLayoutId() = R.layout.activity_main_lib

    override fun initView() {
    }

    override fun initData() {
    }

    override fun initListener() {
        btn_commit.setOnClickListener {
            showToast("please try again")
        }
    }
}