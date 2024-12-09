package com.kamalapp.cashify.ui.welcome

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kamalapp.cashify.R
import com.kamalapp.cashify.ui.login.LoginActivity
import com.kamalapp.cashify.ui.register.RegisterActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        val btnMulai = findViewById<Button>(R.id.btnMulai)

        btnMulai.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }


    }
}