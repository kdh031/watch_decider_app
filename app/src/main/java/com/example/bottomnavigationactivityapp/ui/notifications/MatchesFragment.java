package com.example.bottomnavigationactivityapp.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottomnavigationactivityapp.R;

public class MatchesFragment extends Fragment {

    private MatchesViewModel matchesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        matchesViewModel =
                new ViewModelProvider(this).get(MatchesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_matches, container, false);

        final TextView tv1= root.findViewById(R.id.tv1);
        final TextView tv2= root.findViewById(R.id.tv2);

        matchesViewModel.getText1().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                tv1.setText(s);
            }
        });
        matchesViewModel.getText2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                tv2.setText(s);
            }
        });
        return root;
    }
}