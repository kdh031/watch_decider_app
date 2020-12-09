package com.example.bottomnavigationactivityapp.ui.likedmovies;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class LikedMoviesViewModel extends ViewModel {

    private MutableLiveData<String> mText1;
    private MutableLiveData<String> mText2;
    private MutableLiveData<String> mText3;

    private static final String TAG = LikedMoviesFragment.class.getSimpleName();
    ArrayList<String> movieList;

    public LikedMoviesViewModel() {
        mText1 = new MutableLiveData<>();
        mText2 = new MutableLiveData<>();
        mText3 = new MutableLiveData<>();

        mText1.setValue("My Hero Academia: Heroes Rising");
        mText2.setValue("Spirited Away");
        mText3.setValue("The Iron Giant");
    }

    public LiveData<String> getText1() {
        return mText1;
    }
    public LiveData<String> getText2() {
        return mText2;
    }
    public LiveData<String> getText3() {
        return mText3;
    }

    public void setMovieList(ArrayList<String> movies) {
        movieList = movies;
    }
}