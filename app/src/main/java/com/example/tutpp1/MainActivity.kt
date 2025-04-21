package com.example.tutpp1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.tutpp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel:MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory=MainActivityViewModelFactory(123)
        viewModel=ViewModelProvider(this,viewModelFactory)[MainActivityViewModel::class.java]

        binding.btnAdd.setOnClickListener{
            viewModel.setTotal(binding.editTextNumber.text.toString().toInt())
            binding.textView.text=viewModel.getTotal().toString()

        }

    }



}