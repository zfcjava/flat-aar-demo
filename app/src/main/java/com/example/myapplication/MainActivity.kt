package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lib_base_library.BaseActivity
import com.example.lib_base_library.User
import com.example.lib_main_library.activity.MainLibActivity

class MainActivity : BaseActivity() {

    override fun getLayoutId() = R.layout.activity_main

    fun toLogin(view: View) {
        checkUserInfo()
        val intent = Intent(this,MainLibActivity::class.java)
        startActivity(intent)
    }

    private fun checkUserInfo() {
        val userData = User("zfc","18210055300","123456")
        showToast(userData.toString())
    }
}
