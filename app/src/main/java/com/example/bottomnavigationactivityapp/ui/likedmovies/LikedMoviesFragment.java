package com.example.bottomnavigationactivityapp.ui.likedmovies;

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
import com.example.bottomnavigationactivityapp.ui.home.HomeFragment;

public class LikedMoviesFragment extends Fragment {

    private LikedMoviesViewModel likedMoviesViewModel;
    private HomeFragment homeFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        likedMoviesViewModel =
                new ViewModelProvider(this).get(LikedMoviesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_liked_movies, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        likedMoviesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}