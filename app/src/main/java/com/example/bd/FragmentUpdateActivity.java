package com.example.bd;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bd.ui.FragmentUpdateFragment;

public class FragmentUpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_update);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FragmentUpdateFragment.newInstance())
                    .commitNow();
        }
    }
}
