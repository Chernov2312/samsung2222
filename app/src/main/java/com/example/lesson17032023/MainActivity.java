package com.example.lesson17032023;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.lesson17032023.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private static int menu = 0;
    public static int m = 1;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        m = 1;
        intent = new Intent(MainActivity.this, MyService.class);
        startService(intent);
        binding.person.setOnClickListener(v -> {
            menu = 0;
            Intent i = new Intent(MainActivity.this, Character_Settings.class);
            startActivity(i);
        });
        binding.exit.setOnClickListener(v -> {
            this.finishAffinity();
        });
        binding.play.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, startgame.class);
            startActivity(i);
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        stopService(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(intent);
    }
    public static int getMenu() {
        return menu;
    }

    public static void setMenu(int menu2) {
        menu = menu2;
    }
}