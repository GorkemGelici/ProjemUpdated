package com.example.projem

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import android.view.inputmethod.InputBinding
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projem.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)

        binding.btnGirisYap.setOnClickListener {
            var kayitliKullanici = preferences.getString("kullanici", "")
            var kayitliParola = preferences.getString("parola", "")

            var girisKullanici = binding.girisKullaniciAdi.text.toString()
            var girisParola = binding.girisParola.text.toString()

            if ((kayitliKullanici == girisKullanici) && (kayitliParola == girisParola)) {
                intent = Intent(applicationContext, MainHosgeldiniz::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Giriş Bilgileri Hatalı!!!", Toast.LENGTH_LONG)
                    .show()
            }


        }
        binding.btnKayitOl.setOnClickListener {
            intent = Intent(applicationContext,MainKayitOl::class.java)
            startActivity(intent)
        }
    }
}