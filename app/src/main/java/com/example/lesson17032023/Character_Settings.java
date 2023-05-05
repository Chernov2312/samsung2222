package com.example.lesson17032023;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.lesson17032023.databinding.CharacterSettingsBinding;

import java.util.ArrayList;

public class Character_Settings extends MainActivity {
    private CharacterSettingsBinding binding;
    Intent intent;
    private static String name_person = "";
    private static int golds = 1000;
    private static int inventory;
    private static int level = 1;
    private static int Xit_points = 100;
    private static int Mana = 1000;
    private static int maxXit_points = 100;
    private static int maxMana = 1000;
    private static int Food = 50;
    private static int Water = 60;
    private static int[] foodf = {0, 0, 0};
    private static int[] waterr = {0, 0, 0};
    private static int basedamage = 20;
    public static int damage = 0;
    public static int blockdamage = 0;
    static boolean s = true;
    private static ArrayList<String> inventoryy = new ArrayList<>();

    {
        if (s)
            inventoryy.add(0, "Пусто");
        if (Xit_points > maxXit_points) Xit_points = maxXit_points;
        if (Food > 100) Food = 100;
        if (Water > 100) Water = 100;
        s = false;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = CharacterSettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        intent = new Intent(Character_Settings.this, MyService.class);
        m = 2;
        damage = basedamage;
        for (String s : inventoryy) {
            if ("Короткий меч 1lv".equals(s))
                damage += 30;
            if ("Книга начинающего чародея 1lv".equals(s))
                damage += 20;
            if ("Круглый щит 1lv".equals(s))
                blockdamage += 10;
            if ("Нагрудник из кольчуги 1lv".equals(s))
                blockdamage += 5;
        }
        startService(intent);
        setInventory(0);
        binding.name.setText(name_person);
        binding.Return.setOnClickListener(v -> {
            if (getMenu() == 0) {
                Intent i = new Intent(Character_Settings.this, MainActivity.class);
                startActivity(i);
            } else if (getMenu() == 1) {
                Intent i = new Intent(Character_Settings.this, startgame.class);
                startActivity(i);
            } else if (getMenu() == 2) {
                Intent i = new Intent(Character_Settings.this, Home.class);
                startActivity(i);
            } else if (getMenu() == 3) {
                Intent i = new Intent(Character_Settings.this, Gorod.class);
                startActivity(i);
            } else if (getMenu() == 4) {
                Intent i = new Intent(Character_Settings.this, magazin.class);
                startActivity(i);
            } else if (getMenu() == 5) {
                Intent i = new Intent(Character_Settings.this, gildia.class);
                startActivity(i);
            }
            else if (getMenu() == 6) {
                Intent i = new Intent(Character_Settings.this, BossFight.class);
                startActivity(i);
            }
        });
        binding.name.setText(name_person);
        name_person = String.valueOf(binding.name.getText());
        binding.Inventory.setOnClickListener(v -> {
            Intent i = new Intent(Character_Settings.this, InventoryActivity.class);
            startActivity(i);
        });
        binding.rename.setOnClickListener(v -> {
            name_person = String.valueOf(binding.name.getText());
        });
        binding.level.setText("Уровень: " + level);
        binding.xitPoints.setProgress(Xit_points);
        binding.Mana.setProgress(Mana);
        binding.Food.setProgress(Food);
        binding.water.setProgress(Water);
        binding.gold.setText("Gold: " + golds);
    }

    public static void setFoodf(int[] foodf) {
        Character_Settings.foodf = foodf;
    }

    public static int getBasedamage() {
        return basedamage;
    }

    public static void setBasedamage(int basedamage) {
        Character_Settings.basedamage = basedamage;
    }

    public static int getDamage() {
        return damage;
    }

    public static void setDamage(int damage) {
        Character_Settings.damage = damage;
    }

    public static int getBlockdamage() {
        return blockdamage;
    }

    public static void setBlockdamage(int blockdamage) {
        Character_Settings.blockdamage = blockdamage;
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopService(intent);
    }

    public static void setS(boolean s) {
        Character_Settings.s = s;
    }

    public static int getMaxXit_points() {
        return maxXit_points;
    }

    public static void setMaxXit_points(int maxXit_points) {
        Character_Settings.maxXit_points = maxXit_points;
    }

    public static int getMaxMana() {
        return maxMana;
    }

    public static void setMaxMana(int maxMana) {
        Character_Settings.maxMana = maxMana;
    }

    public static ArrayList<String> getInventoryy() {
        return inventoryy;
    }

    public static void setInventoryy(ArrayList<String> inventoryy) {
        Character_Settings.inventoryy = inventoryy;
    }

    public static int getFood() {
        return Food;
    }

    public static void setFood(int food) {
        Food = food;
    }

    public static int getWater() {
        return Water;
    }

    public static void setWater(int water) {
        Water = water;
    }

    public static int getInventory() {
        return inventory;
    }

    public static void setInventory(int inventory) {
        Character_Settings.inventory = inventory;
    }

    public static String getName_person() {
        return name_person;
    }

    public static void setName_person(String name_person) {
        Character_Settings.name_person = name_person;
    }

    public static int getGolds() {
        return golds;
    }

    public static void setGolds(int golds2) {
        golds = golds2;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level2) {
        level = level2;
    }

    public static int getXit_points() {
        return Xit_points;
    }

    public static void setXit_points(int Xit_points2) {
        Xit_points = Xit_points2;
    }

    public static int getMana() {
        return Mana;
    }

    public static void setMana(int mana2) {
        Mana = mana2;
    }

    public static int[] getFoodf() {
        return foodf;
    }

    public static int[] getWaterr() {
        return waterr;
    }

    public static void setFoodd(int[] foodd) {
        Character_Settings.foodf = foodd;
    }

    public static void setWaterr(int[] waterr) {
        Character_Settings.waterr = waterr;
    }

}
