package com.example.lesson17032023;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson17032023.databinding.DeathBinding;

public class GameLose extends AppCompatActivity {
    DeathBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DeathBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
