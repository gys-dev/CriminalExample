package com.uni.officecriminal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CriminalDetailFragment extends Fragment {

    public CriminalDetailFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new CriminalDetailFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_criminal_detail, container, false);
    }
}
