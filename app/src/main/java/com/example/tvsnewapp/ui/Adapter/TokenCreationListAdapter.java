package com.example.tvsnewapp.ui.Adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import com.example.tvsnewapp.R;
import com.example.tvsnewapp.ui.Model.TokenCreationListModel;


import java.util.List;

public class TokenCreationListAdapter extends RecyclerView.Adapter<TokenCreationListAdapter.MyViewHolder> {

    private Context mContext;
    private List<TokenCreationListModel> tokenCreationListModels;

    public TokenCreationListAdapter(Context mContext, List<TokenCreationListModel> tokenCreationListModels) {
        this.mContext = mContext;
        this.tokenCreationListModels = tokenCreationListModels;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.token_creation_cell, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        final TokenCreationListModel listModel = tokenCreationListModels.get(i);
        holder.name.setText(listModel.getName());
        holder.email.setText(listModel.getEmail());
        holder.mobile.setText(listModel.getMobile());


    }


    @Override
    public int getItemCount() {
        return tokenCreationListModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, email, mobile;
        private CardView cardView;


        public MyViewHolder(View view) {
            super(view);

            name = (TextView) view.findViewById(R.id.txtname);
            email = (TextView) view.findViewById(R.id.txtemail);
            mobile = view.findViewById(R.id.txtmobile);
            cardView = view.findViewById(R.id.cardView);

        }
    }

}