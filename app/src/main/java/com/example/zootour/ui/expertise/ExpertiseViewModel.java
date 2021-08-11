package com.example.zootour.ui.expertise;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExpertiseViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ExpertiseViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Never become so much of an expert that you stop gaining expertise. View life as a continuous learning experience."+ "             –Denis Waitley");
    }

    public LiveData<String> getText() {
        return mText;
    }
}