package com.aarafrao.yttutorial_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = Utils.getInstance().create(ApiInterface::class.java)

        GlobalScope.launch {
            val results = user.getUsers()
            if (results.body()!=null){
                Log.d("TAG", "onCreate: ${results.body()}")
            }

        }




    }
}