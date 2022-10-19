package com.example.layout_sandbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.layout_sandbox.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // view binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // event listener
        setEventListener();
    }

    private void setEventListener() {
        // btn first @click
        binding.firstButton.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FirstActivity.class));
            binding.drawerLayout.closeDrawers();
        });
        // btn second @click
        binding.secondButton.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
            binding.drawerLayout.closeDrawers();
        });
        // btn third @click
        binding.thirdButton.setOnClickListener(view -> {
            Snackbar.make(view, "No 3rd Activity", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        });
    }

}