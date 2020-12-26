package com.uni.officecriminal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uni.officecriminal.model.CriminalEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


/**
 * A simple {@link Fragment} subclass.
 */
public class CriminalDetailFragment extends Fragment {

    private TextView contentTextView;
    public CriminalDetailFragment() {
    }

    public static Fragment newInstance() {

        return new CriminalDetailFragment();
    }

    @Override
    public void onStart() {
        super.onStart();

        EventBus.getDefault().register(this);
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(CriminalEvent event) {
        contentTextView.setText(event.getDescription());
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_criminal_detail, container, false);
        contentTextView = (TextView) view.findViewById(R.id.contentTV);

        return view;
    }
}
