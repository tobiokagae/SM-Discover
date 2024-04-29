package com.example.studycase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class AespaActivity extends AppCompatActivity {

    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aespa);

        ivBack = findViewById(R.id.iv_back);
        ivBack.setOnClickListener(v -> finish());
    }
}