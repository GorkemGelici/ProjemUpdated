package com.example.projem

import android.content.Intent
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import android.view.inputmethod.InputBinding
import androidx.appcompat.app.AppCompatActivity
import com.example.projem.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGirisYap.setOnClickListener {
            intent = Intent(applicationContext,MainHosgeldiniz::class.java)
            startActivity(intent)
        }
    }
}