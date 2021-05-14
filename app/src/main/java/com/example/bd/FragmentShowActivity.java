package com.example.bd;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bd.ui.FragmentShowFragment;

public class FragmentShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_show);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FragmentShowFragment.newInstance())
                    .commitNow();
        }
    }
}