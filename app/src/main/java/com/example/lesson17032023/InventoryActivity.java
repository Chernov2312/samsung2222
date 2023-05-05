package com.example.lesson17032023;

import static com.example.lesson17032023.Character_Settings.getInventory;
import static com.example.lesson17032023.Character_Settings.getInventoryy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.lesson17032023.databinding.InventoryBinding;

import java.util.ArrayList;

public class InventoryActivity extends MainActivity {
    private InventoryBinding binding;
    ArrayList<String> inventory = getInventoryy();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = InventoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        m = 2;
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, inventory);
        binding.predmets.setAdapter(adapter);
        startService(new Intent(this, MyService.class));
        binding.Return2.setOnClickListener(v -> {
            if (getInventory() == 0) {
                Intent i = new Intent(InventoryActivity.this, Character_Settings.class);
                startActivity(i);
            }
        });
        binding.rasxodn.setOnClickListener(v -> {
            Intent i = new Intent(InventoryActivity.this, rasxodn.class);
            startActivity(i);
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopService(new Intent(this, MyService.class));
    }
}

