package com.yuri_berezhnoy.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yuri_berezhnoy.myfirstapp.databinding.ActivitySignUpInBinding

class SignInUpAct : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpInBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}