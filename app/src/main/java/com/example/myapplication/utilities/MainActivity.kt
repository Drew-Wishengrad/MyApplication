package com.example.myapplication.utilities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.util.myFirstClass

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        saySomething()

        val myVar: IntArray

        val intent = parent

        }

    private fun saySomething() {
        val myFirstClass = myFirstClass()
        myFirstClass.saySomething()
    }

    fun myFunc1() {

    }

    fun myFunc2() {

    }

    }