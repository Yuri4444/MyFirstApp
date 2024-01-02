package com.yuri_berezhnoy.myfirstapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yuri_berezhnoy.Constance
import com.yuri_berezhnoy.myfirstapp.databinding.ActivitySignUpInBinding

class SignInUpAct : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpInBinding
    private var signState: String? = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        signState = intent?.getStringExtra(Constance.SIGN_STATE)
        if (signState == Constance.SIGN_IN_STATE){

            binding.edName.visibility = View.GONE
            binding.edName2.visibility = View.GONE
            binding.edName3.visibility = View.GONE
            binding.imAvatar.visibility = View.INVISIBLE
        }
    }

    fun onClickDone(view: View){

        if (signState == Constance.SIGN_IN_STATE){

        }

    }

    fun onClickAvatar(view: View){

        binding.imAvatar.visibility = View.VISIBLE
    }


}