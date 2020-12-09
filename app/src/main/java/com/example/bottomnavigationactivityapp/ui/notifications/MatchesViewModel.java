package com.example.bottomnavigationactivityapp.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MatchesViewModel extends ViewModel {

    private MutableLiveData<String> mText1;
    private MutableLiveData<String> mText2;

    public MatchesViewModel() {
        mText1 = new MutableLiveData<>();
        mText2 = new MutableLiveData<>();

        mText1.setValue("You've got a match! Consider watching the movie \"Spirited Away\" ");
        mText2.setValue("You've got a match! Consider watching the movie \"My Hero Academia: Heroes Rising\" ");
    }

    public LiveData<String> getText1() {
        return mText1;
    }
    public LiveData<String> getText2() {
        return mText2;
    }
}