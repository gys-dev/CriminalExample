package com.uni.officecriminal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BindFragmentToPlaceholder();
    }

    private void BindFragmentToPlaceholder() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment listFragment =  CriminalListFragment.newInstance();
        Fragment detailFragment = CriminalDetailFragment.newInstance();
        transaction.replace(R.id.fragment_list, listFragment);
        if(findViewById(R.id.fragment_details) != null)
            transaction.replace(R.id.fragment_details, detailFragment);
        transaction.commit();
    }
}
