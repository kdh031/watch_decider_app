package com.example.bottomnavigationactivityapp.ui.likedmovies;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LikedMoviesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LikedMoviesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This will be the liked movies page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}