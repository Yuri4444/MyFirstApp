package com.yuri_berezhnoy.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yuri_berezhnoy.Constance
import com.yuri_berezhnoy.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var login: String = "empty"
    private var passsword: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImageId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constance.REQUEST_CODE_SIGN_IN){

        }else if (requestCode == Constance.REQUEST_CODE_SIGN_UP) {
        }
    }

    fun onClickSignIn(view: View){

        val intent = Intent(this,SignInUpAct::class.java)
        intent.putExtra(Constance.SIGN_STATE,Constance.SIGN_IN_STATE)
        startActivityForResult(intent,Constance.REQUEST_CODE_SIGN_IN)
    }

    fun onClickSignUp(view: View){

        val intent = Intent(this,SignInUpAct::class.java)
        intent.putExtra(Constance.SIGN_STATE,Constance.SIGN_UP_STATE)
        startActivityForResult(intent,Constance.REQUEST_CODE_SIGN_UP)
    }

}