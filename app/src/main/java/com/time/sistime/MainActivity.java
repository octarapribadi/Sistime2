package com.time.sistime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fc_fragment);
        if (fragment == null) {
            fragment = new ListFragment();
            fm.beginTransaction().add(R.id.fc_fragment, fragment).commit();
        }
    }
}