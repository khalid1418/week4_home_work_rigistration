package com.example.registrationpage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registrationpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { CheckInput() }

    }
    @SuppressLint("SetTextI18n")
    fun CheckInput(){
      val checkname =binding.editname.text.toString()
      val checkmail =binding.editemail.text.toString()
      val checkpassword=binding.editpassword.text.toString()
      val checkpassword2=binding.editrePassword.text.toString()
      val checkdate=binding.editdate.text.toString()

      if (checkname.isEmpty()||checkmail.isEmpty()||checkpassword.isEmpty()||checkpassword2.isEmpty()||checkdate.isEmpty()){
        binding.result.text="fill all the space Please"
      }else if (checkpassword !=checkpassword2){
          binding.result.text="password fail match"

      }else if (!checkmail.contains('@')&&!checkmail.contains(".com")){
          binding.result.text="use @ and .com"
      }else binding.result.text="your name is $checkname your mail is $checkmail you last number of password is ${checkpassword.last()}"







    }
       }

