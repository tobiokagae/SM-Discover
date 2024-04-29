package com.example.studycase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RiizeActivity extends AppCompatActivity {

    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riize);

        ivBack = findViewById(R.id.iv_back);
        ivBack.setOnClickListener(v -> finish());

    }
}