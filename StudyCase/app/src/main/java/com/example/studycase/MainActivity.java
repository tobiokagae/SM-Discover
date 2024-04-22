package com.example.studycase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menu, exit, ivNewcb, ivDream, ivAespa, ivRiize;

    TextView tvArtist, tvHome, tvCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        exit = findViewById(R.id.iv_close_nav);

        ivNewcb = findViewById(R.id.iv_newcb);
        ivDream = findViewById(R.id.iv_dream);
        ivAespa = findViewById(R.id.iv_aespa);
        ivRiize = findViewById(R.id.iv_riize);

        tvCompany = findViewById(R.id.tv_company);
        tvArtist = findViewById(R.id.tv_artist);
        tvHome = findViewById(R.id.tv_home);

        menu.setOnClickListener(view -> openDrawer(drawerLayout));
        exit.setOnClickListener(view -> closeDrawer(drawerLayout));

        tvHome.setOnClickListener(v -> closeDrawer(drawerLayout));
        tvCompany.setOnClickListener(v -> {
            closeDrawer(drawerLayout);
            Intent intent = new Intent(this, CompanyActivity.class);
            startActivity(intent);
        });

        tvArtist.setOnClickListener(v -> {
            closeDrawer(drawerLayout);
            Intent intent = new Intent(this, ArtistActivity.class);
            startActivity(intent);
        });

        ivNewcb.setOnClickListener(v -> {
            Intent intent = new Intent(this, RiizeActivity.class);
            startActivity(intent);
        });

        ivRiize.setOnClickListener(v -> {
            Intent intent = new Intent(this, RiizeActivity.class);
            startActivity(intent);
        });

        ivAespa.setOnClickListener(v -> {
            Intent intent = new Intent(this, AespaActivity.class);
            startActivity(intent);
        });

        ivDream.setOnClickListener(v -> {
            Intent intent = new Intent(this, DreamActivity.class);
            startActivity(intent);
        });
    }

    private void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END);
        }
    }


    private void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.END);
    }
}