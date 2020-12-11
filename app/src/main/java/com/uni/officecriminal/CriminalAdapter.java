package com.uni.officecriminal;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uni.officecriminal.model.Criminal;

import java.text.SimpleDateFormat;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CriminalAdapter extends RecyclerView.Adapter<CriminalAdapter.ViewHolder> {

    private List<Criminal> criminals;

    public CriminalAdapter(List<Criminal> criminals) {
        this.criminals = criminals;
    }

    int i = 0, j =0;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_criminal, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        Log.d("CRIMINAL", "onCreateViewHolder " + ++i);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(j > 20) return;
        Criminal criminal = criminals.get(position);
        holder.mTvTile.setText(criminal.getTitle());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String date = simpleDateFormat.format(criminal.getCreationDate());
        holder.mTvDate.setText(date);
        Log.d("CRIMINAL", "onBindViewHolder " + ++j);
    }

    @Override
    public int getItemCount() {
        return criminals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mTvTile;
        public final TextView mTvDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTvTile = itemView.findViewById(R.id.item_criminal_tv_title);
            mTvDate = itemView.findViewById(R.id.item_criminal_tv_date);
        }
    }
}
