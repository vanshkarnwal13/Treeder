package com.brocode.carbon_footprint_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        login.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
        new_account.setOnClickListener { startActivity(Intent(this, RegisterActivity::class.java)) }
    }
}