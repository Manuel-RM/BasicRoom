package com.example.basicroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.basicroom.database.User

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mainViewModel.saveUser(User(
           //"userid00001",
            //"name0001",
            //1.71,
            //"user001@email.com",
            //"password0001"
            //))

        mainViewModel.getUsers()
        mainViewModel.savedUsers.observe(this) {userList ->
            if(!userList.isNullOrEmpty()){
                for(user in userList){
                    Log.d("thesearetheusers", user.user_email)
                }
            }else{
                Log.d("thesearetheusers", "null or empty")
            }
        }
    }
}