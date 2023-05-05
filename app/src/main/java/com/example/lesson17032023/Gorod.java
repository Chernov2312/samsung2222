package com.example.lesson17032023;

import static com.example.lesson17032023.MainActivity.setMenu;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson17032023.databinding.GorodBinding;

public class Gorod extends AppCompatActivity {
    GorodBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = GorodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.person.setOnClickListener(v -> {
            setMenu(3);
            Intent i = new Intent(Gorod.this, Character_Settings.class);
            startActivity(i);
        });
        binding.Return.setOnClickListener(v -> {
            Character_Settings.setWater(Character_Settings.getWater() - 2);
            Character_Settings.setFood(Character_Settings.getFood() - 1);
            Intent i = new Intent(Gorod.this, startgame.class);
            startActivity(i);
        });
        binding.magazin.setOnClickListener(v -> {
            Character_Settings.setWater(Character_Settings.getWater() - 2);
            Character_Settings.setFood(Character_Settings.getFood() - 1);
            Intent i = new Intent(Gorod.this, magazin.class);
            startActivity(i);
        });
        binding.gild.setOnClickListener(v -> {
            Intent i = new Intent(Gorod.this, gildia.class);
            startActivity(i);
        });
    }
}

