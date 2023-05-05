package com.example.lesson17032023;

import static com.example.lesson17032023.MainActivity.setMenu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson17032023.databinding.FoodOtdelBinding;

public class Buyproduct extends AppCompatActivity {
    FoodOtdelBinding binding;
    int[] foodd = Character_Settings.getFoodf();
    int[] waterr = Character_Settings.getWaterr();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FoodOtdelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Return.setOnClickListener(v -> {
            Intent i = new Intent(Buyproduct.this, magazin.class);
            startActivity(i);
        });
        binding.smallfood.setOnClickListener(v -> {
            if (Character_Settings.getGolds() >= 50) {
                Character_Settings.setGolds(Character_Settings.getGolds() - 50);
                foodd[0] += 1;
                Toast.makeText(getApplicationContext(),
                        "У вас есть " + foodd[0] + " маленьких пайка", Toast.LENGTH_SHORT).show();
            }
        });
        binding.sredfood.setOnClickListener(v -> {
            if (Character_Settings.getGolds() >= 100) {
                Character_Settings.setGolds(Character_Settings.getGolds() - 100);
                foodd[1] += 1;
                Toast.makeText(getApplicationContext(),
                        "У вас есть " + foodd[1] + " средних пайков", Toast.LENGTH_SHORT).show();
            }
        });
        binding.bigfood.setOnClickListener(v -> {
            if (Character_Settings.getGolds() >= 200) {
                Character_Settings.setGolds(Character_Settings.getGolds() - 200);
                foodd[2] += 1;
                Toast.makeText(getApplicationContext(),
                        "У вас есть " + foodd[2] + " больших пайков", Toast.LENGTH_SHORT).show();
            }
        });
        binding.smallwater.setOnClickListener(v -> {
            if (Character_Settings.getGolds() >= 50) {
                Character_Settings.setGolds(Character_Settings.getGolds() - 50);
                waterr[0] += 1;
                Toast.makeText(getApplicationContext(),
                        "У вас есть " + waterr[0] + " маленьких бутылок с водой", Toast.LENGTH_SHORT).show();
            }
        });
        binding.sredwater.setOnClickListener(v -> {
            if (Character_Settings.getGolds() >= 100) {
                Character_Settings.setGolds(Character_Settings.getGolds() - 100);
                waterr[1] += 1;
                Toast.makeText(getApplicationContext(),
                        "У вас есть " + waterr[1] + " фляг", Toast.LENGTH_SHORT).show();
            }
        });
        binding.bigwater.setOnClickListener(v -> {
            if (Character_Settings.getGolds() >= 200) {
                Character_Settings.setGolds(Character_Settings.getGolds() - 200);
                waterr[2] += 1;
                Toast.makeText(getApplicationContext(),
                        "У вас есть " + waterr[2] + " бутылей с водой", Toast.LENGTH_SHORT).show();
            }
        });
        Character_Settings.setWaterr(waterr);
        Character_Settings.setFoodd(foodd);
    }
}
