package com.example.lesson17032023;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.lesson17032023.databinding.GildiaBinding;

import java.util.ArrayList;

public class gildia extends Character_Settings{
    GildiaBinding binding;
    ArrayList<String> inventory2 = getInventoryy();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = GildiaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Return.setOnClickListener(v -> {
            Intent i = new Intent(gildia.this, Gorod.class);
            startActivity(i);
        });
        binding.person.setOnClickListener(v -> {
            setMenu(5);
            Intent i = new Intent(gildia.this, Character_Settings.class);
            startActivity(i);
        });
        binding.nachsnar.setOnClickListener(v -> {
            setS(false);
            binding.nachsnar.setText("Получить награду");
            inventory2.remove(0);
            inventory2.add("Короткий меч 1lv");
            inventory2.add("Нагрудник из кольчуги 1lv");
            inventory2.add("Круглый щит 1lv");
            inventory2.add("Книга начинающего чародея 1lv");
            setInventoryy(inventory2);
        });
        binding.Boss.setOnClickListener(v -> {
            Intent i = new Intent(gildia.this, BossFight.class);
            startActivity(i);
        });
    }
}
