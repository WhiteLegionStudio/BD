package com.example.bd;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bd.ui.FragmentAddFragment;

public class FragmentAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_add);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FragmentAddFragment.newInstance())
                    .commitNow();
        }
    }
}
