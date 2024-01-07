package com.yuri_berezhnoy.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yuri_berezhnoy.User

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var user = User("Sergey", "0000", 25)
        var user2 = User("Andrey", "1234", 32)
        user.addAge(10)
        user2.addAge(8)
        
        user.printUserInfo()
        user2.printUserInfo()

}
}