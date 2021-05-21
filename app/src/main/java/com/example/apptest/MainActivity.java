package com.example.apptest;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;

import com.example.apptest.ui.about.AboutFragment;
import com.example.apptest.ui.advisory.AdvisoryFragment;
import com.example.apptest.ui.guide.GuideFragment;
import com.example.apptest.ui.history.HistoryFragment;
import com.example.apptest.ui.profile.ProfileFragment;
import com.example.apptest.ui.language.LanguageFragment;
import com.example.apptest.ui.share.ShareFragment;
import com.google.android.material.navigation.NavigationView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private FragmentManager manager;
    LinearLayout profile,history,tuvan,share,language,guide,about;
    Toolbar toolbar;
    DrawerLayout drawer;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setSupportActionBar(toolbar);
        initProfileFragment();
        profile.setOnClickListener(view -> {
            setBackgroundColor(profile);
            initProfileFragment();
            drawer.close();
        });
        history.setOnClickListener(view -> {
            setBackgroundColor(history);
            initHistoryFragment();
            drawer.close();
        });
        tuvan.setOnClickListener(view -> {
            setBackgroundColor(tuvan);
            initTuvanFragment();
            drawer.close();
        });
        share.setOnClickListener(view -> {
            setBackgroundColor(share);
            initShareFragment();
            drawer.close();
        });
        language.setOnClickListener(view -> {
            setBackgroundColor(language);
            initLanguageFragment();
            drawer.close();
        });
        guide.setOnClickListener(view -> {
            setBackgroundColor(guide);
            initShareFragment();
            drawer.close();
        });
        about.setOnClickListener(view -> {
            setBackgroundColor(about);
            initAboutFragment();
            drawer.close();
        });

    }
    private void init(){
         toolbar = findViewById(R.id.toolbar);
         drawer = findViewById(R.id.drawer_layout);
         navigationView = findViewById(R.id.nav_view);
         profile=findViewById(R.id.profile);
         history=findViewById(R.id.history);
         tuvan=findViewById(R.id.tuvan);
         share=findViewById(R.id.share);
         language=findViewById(R.id.lang);
         guide=findViewById(R.id.guide);
         about=findViewById(R.id.about);
    }
    private void setBackgroundColor(View v){
        v.setBackgroundColor(Color.parseColor("#80EDEAEA"));
        new CountDownTimer(500, 1000) {
            @Override
            public void onTick(long l) {
            }
            public void onFinish() {
                v.setBackgroundColor(Color.parseColor("#00000000"));
            }
        }.start();
    }
    private void initProfileFragment(){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction0 = manager.beginTransaction();
        ProfileFragment fragment = new ProfileFragment();
        transaction0.replace(R.id.nav_host_fragment, fragment, "A");
        transaction0.commit();
    }
    private void initHistoryFragment(){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        HistoryFragment fragmentA = new HistoryFragment();
        transaction.replace(R.id.nav_host_fragment, fragmentA, "A");
        transaction.commit();
    }
    private void initTuvanFragment(){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        AdvisoryFragment fragmentA = new AdvisoryFragment();
        transaction.replace(R.id.nav_host_fragment, fragmentA, "A");
        transaction.commit();
    }
    private void initShareFragment(){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        ShareFragment fragmentA = new ShareFragment();
        transaction.replace(R.id.nav_host_fragment, fragmentA, "A");
        transaction.commit();
    }
    private void initLanguageFragment(){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        LanguageFragment fragmentA = new LanguageFragment();
        transaction.replace(R.id.nav_host_fragment, fragmentA, "A");
        transaction.commit();
    }
    private void initGuideFragment(){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        GuideFragment fragmentA = new GuideFragment();
        transaction.replace(R.id.nav_host_fragment, fragmentA, "A");
        transaction.commit();
    }
    private void initAboutFragment(){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        AboutFragment fragmentA = new AboutFragment();
        transaction.replace(R.id.nav_host_fragment, fragmentA, "A");
        transaction.commit();
    }
}