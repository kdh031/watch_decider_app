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

public class LikedMoviesFragment extends Fragment {

    private static final String TAG = LikedMoviesFragment.class.getSimpleName();
    private LikedMoviesViewModel likedMoviesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        likedMoviesViewModel =
                new ViewModelProvider(this).get(LikedMoviesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_liked_movies, container, false);

        final TextView tvLikes1 = root.findViewById(R.id.tvLikes1);
        final TextView tvLikes2 = root.findViewById(R.id.tvLikes2);
        final TextView tvLikes3 = root.findViewById(R.id.tvLikes3);


        likedMoviesViewModel.getText1().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                tvLikes1.setText(s);
            }
        });
        likedMoviesViewModel.getText2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                tvLikes2.setText(s);
            }
        });
        likedMoviesViewModel.getText3().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                tvLikes3.setText(s);
            }
        });

        return root;
    }

}