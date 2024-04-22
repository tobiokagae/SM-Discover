package com.example.studycase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CompanyActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menu, exit;
    TextView tvArtist, tvHome, tvCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);

        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        exit = findViewById(R.id.iv_close_nav);

        tvArtist = findViewById(R.id.tv_artist);
        tvCompany = findViewById(R.id.tv_company);
        tvHome = findViewById(R.id.tv_home);

        menu.setOnClickListener(view -> openDrawer());
        exit.setOnClickListener(view -> closeDrawer());

        tvHome.setOnClickListener(v -> {
            closeDrawer();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
        tvCompany.setOnClickListener(v -> closeDrawer());

        tvArtist.setOnClickListener(v -> {
            closeDrawer();
            Intent intent = new Intent(this, ArtistActivity.class);
            startActivity(intent);
        });
    }

    private void closeDrawer() {
        if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END);
        }
    }

    private void openDrawer() {
        drawerLayout.openDrawer(GravityCompat.END);
    }
}