package com.example.lesson17032023;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson17032023.databinding.BossBinding;

public class BossFight extends AppCompatActivity {
    BossBinding binding;
    private static int BossXitpoints = 1000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = BossBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.bossXp.setText("BOSS XP: " + BossXitpoints);

        binding.atack.setOnClickListener(v -> {
           BossXitpoints -= Character_Settings.getDamage();
           Character_Settings.setXit_points((int) (Character_Settings.getXit_points() - 100 * (float)Character_Settings.getBlockdamage()/100));
           binding.bossXp.setText("BOSS XP: " + BossXitpoints);
        });
        binding.person.setOnClickListener(v -> {
            MainActivity.setMenu(6);
            Intent i = new Intent(BossFight.this, Character_Settings.class);
            startActivity(i);
        });
    }
}
