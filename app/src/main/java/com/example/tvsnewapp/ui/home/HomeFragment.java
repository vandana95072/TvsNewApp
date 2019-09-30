package com.example.tvsnewapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.tvsnewapp.R;
import com.example.tvsnewapp.ui.Activity.TokenCreationActivity;
import com.example.tvsnewapp.ui.home.HomeViewModel;


public class HomeFragment extends Fragment {
    CardView t_creation;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        CardView t_creation = (CardView) rootView.findViewById(R.id.t_creation);
        t_creation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });
        return rootView;
    }

    public void updateDetail() {
        Intent intent = new Intent(getActivity(), TokenCreationActivity.class);
        startActivity(intent);
    }

}