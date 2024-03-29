package com.jpapa.kotline_01

import android.app.ActivityManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.jpapa.kotline_01.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickBtn.setOnClickListener {
            Log.d("메인화면로그", "클릭용 버튼 눌림")
            Log.e("메인화면로그", "에러관련 로그")

        }
        binding.smallbtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()

        }

    }
    }
