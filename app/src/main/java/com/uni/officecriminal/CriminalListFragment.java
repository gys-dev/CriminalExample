package com.uni.officecriminal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uni.officecriminal.model.Criminal;
import com.uni.officecriminal.model.CriminalDao;
import com.uni.officecriminal.model.DaoSession;

import org.greenrobot.greendao.query.Query;

public class CriminalListFragment extends Fragment {

    public static Fragment newInstance() {
        return new CriminalListFragment();
    }
    private Query<Criminal> criminalQuery;
    private CriminalDao criminalDao;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_criminal_list, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.rclCriminals);

        DaoSession daoSession = ((CriminalApplication)getActivity().getApplication()).getDaoSession();


        criminalDao = daoSession.getCriminalDao();

        CriminalAdapter criminalAdapter = new CriminalAdapter(criminalDao.loadAll());
        recyclerView.setAdapter(criminalAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }
}
