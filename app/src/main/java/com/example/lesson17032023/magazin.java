package com.example.lesson17032023;

import static com.example.lesson17032023.MainActivity.setMenu;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson17032023.databinding.MagazinBinding;

public class magazin extends AppCompatActivity {
    MagazinBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MagazinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.person.setOnClickListener(v -> {
            setMenu(4);
            Intent i = new Intent(magazin.this, Character_Settings.class);
            startActivity(i);
        });
        binding.Return.setOnClickListener(v -> {
            Character_Settings.setWater(Character_Settings.getWater() - 2);
            Character_Settings.setFood(Character_Settings.getFood() - 1);
            Intent i = new Intent(magazin.this, Gorod.class);
            startActivity(i);
        });
        binding.foodotdel.setOnClickListener(v -> {
            Intent i = new Intent(magazin.this, Buyproduct.class);
            startActivity(i);
        });
    }
}
