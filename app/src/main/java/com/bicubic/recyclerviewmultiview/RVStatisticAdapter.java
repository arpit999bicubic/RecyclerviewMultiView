package com.bicubic.recyclerviewmultiview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bicubic.recyclerviewmultiview.model.Statistic;

import java.util.List;

import static com.bicubic.recyclerviewmultiview.model.Statistic.CITY_TYPE;
import static com.bicubic.recyclerviewmultiview.model.Statistic.EVENT_TYPE;

public class RVStatisticAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Statistic> mList;

    public RVStatisticAdapter(List<Statistic> list) {
        this.mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        switch (viewType) {
            case CITY_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.statistic_row_one, parent, false);
                return new CityViewHolder(view);
            case EVENT_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.statistic_row_two, parent, false);
                return new EventViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Statistic object = mList.get(position);
        if (object != null) {
            switch (object.getType()) {
                case CITY_TYPE:
                    ((CityViewHolder) holder).mTitle.setText(object.getTitle());
                    ((CityViewHolder) holder).no.setText(object.getNo());
                    ((CityViewHolder) holder).playerone.setText(object.getPlayer_one());

                    break;
                case EVENT_TYPE:
                    ((EventViewHolder) holder).mTitle.setText(object.getTitle());
                    ((EventViewHolder) holder).no.setText(object.getNo());
                    ((EventViewHolder) holder).playerone.setText(object.getName());
                    ((EventViewHolder) holder).playertwo.setText(object.getPlayer_two());
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        if (mList == null)
            return 0;
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mList != null) {
            Statistic object = mList.get(position);
            if (object != null) {
                return object.getType();
            }
        }
        return 0;
    }

    public static class CityViewHolder extends RecyclerView.ViewHolder {
        private TextView mTitle,no,playerone;

        public CityViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.tv_title);
            no = (TextView) itemView.findViewById(R.id.tv_no);
            playerone = (TextView) itemView.findViewById(R.id.tv_player_one);

        }
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {
        private TextView mTitle,no,playerone,playertwo;

        public EventViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.tv_title);
            no = (TextView) itemView.findViewById(R.id.tv_no);
            playerone = (TextView) itemView.findViewById(R.id.tv_player_one);
            playertwo = (TextView) itemView.findViewById(R.id.tv_player_two);
        }
    }
}