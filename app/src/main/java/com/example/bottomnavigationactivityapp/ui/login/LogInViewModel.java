package com.example.bottomnavigationactivityapp.ui.login;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bottomnavigationactivityapp.R;

public class LogInViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LogInViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This will be the Log In page");
    }


    public LiveData<String> getText() {
        return mText;
    }
}
