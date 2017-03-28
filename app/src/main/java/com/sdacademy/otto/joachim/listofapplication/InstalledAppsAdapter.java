package com.sdacademy.otto.joachim.listofapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by RENT on 2017-03-28.
 */

public class InstalledAppsAdapter extends RecyclerView.Adapter<InstalledAppsAdapter.InstalledAppsViewHolder> {

    private ArrayList<AppInfo> appInfos;

    InstalledAppsAdapter(ArrayList<AppInfo> appInfos){
        this.appInfos = appInfos;
    }



    @Override
    public InstalledAppsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.installed_apps_adapter,null); // jaka druga
        return new InstalledAppsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InstalledAppsViewHolder holder, int position) {
        AppInfo appInfo = appInfos.get(position);// ta metoda robie jako ostatnia
        holder.name.setText(appInfo.getName());

    }

    @Override
    public int getItemCount() {
        if (appInfos == null || appInfos.isEmpty()) {
            return 0;
        } else {
            return appInfos.size(); // jak pierwsza
        }
    }

    static class InstalledAppsViewHolder extends RecyclerView.ViewHolder { // najpierw viewholdera zdefiniuj

        @BindView(R.id.imageView)
        ImageView imageView;
        @BindView(R.id.textView)
        TextView name;

        public InstalledAppsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
