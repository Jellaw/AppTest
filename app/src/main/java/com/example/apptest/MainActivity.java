package com.example.apptest;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FragmentManager manager;
    LinearLayout profile,history,tuvan,share,language,guide,about;
    Toolbar toolbar;
    DrawerLayout drawer;
    NavigationView navigationView;
    TextView profileText, historyText, advisoryText, shareText, languageText, guideText, aboutText;
    ColorStateList oldColors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        oldColors =  historyText.getTextColors(); //save original colors
        setSupportActionBar(toolbar);
        setBackgroundColor(profile,profileText);
        initProfileFragment();
        profile.setOnClickListener(view -> {
            setBackgroundColor(profile,profileText);
            initProfileFragment();
            drawer.close();
        });
        history.setOnClickListener(view -> {
            setBackgroundColor(history,historyText);
            initHistoryFragment();
            drawer.close();
        });
        tuvan.setOnClickListener(view -> {
            setBackgroundColor(tuvan,advisoryText);
            initTuvanFragment();
            drawer.close();
        });
        share.setOnClickListener(view -> {
            setBackgroundColor(share,shareText);
            initShareFragment();
            drawer.close();
        });
        language.setOnClickListener(view -> {
            setBackgroundColor(language,languageText);
            initLanguageFragment();
            drawer.close();
        });
        guide.setOnClickListener(view -> {
            setBackgroundColor(guide,guideText);
            initGuideFragment();
            drawer.close();
        });
        about.setOnClickListener(view -> {
            setBackgroundColor(about,aboutText);
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
         profileText=findViewById(R.id.profileText);
         historyText=findViewById(R.id.historyText);
         advisoryText=findViewById(R.id.advisoryText);
         shareText=findViewById(R.id.shareText);
         languageText=findViewById(R.id.languageText);
         guideText=findViewById(R.id.guideText);
         aboutText=findViewById(R.id.aboutText);

    }
    private void setBackgroundColor(View v, TextView tv){
        v.setBackgroundResource(R.drawable.background_drawer);
        List<View> views =new ArrayList<>();
        views.add(profile); views.add(history); views.add(tuvan);
        views.add(share); views.add(language); views.add(guide); views.add(about);
        views.remove(v);
        for (View view:views){
            view.setBackgroundResource(R.drawable.backgroud_drawer_disable);
        }
        tv.setTextColor(Color.parseColor("#D74F61C3"));
        List<TextView> list_tv = new ArrayList<>();
        list_tv.add(profileText);list_tv.add(historyText);list_tv.add(advisoryText);
        list_tv.add(shareText);list_tv.add(languageText);list_tv.add(guideText);list_tv.add(aboutText);
        list_tv.remove(tv);
        for (TextView textView: list_tv){
            textView.setTextColor(oldColors);
        }

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