package com.example.zootour.ui.education;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EducationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EducationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("The difference between school and life? In school, you're taught a lesson and then given a test. In life, you're given a test that teaches you a lesson."+"-Tom Bodett");
    }

    public LiveData<String> getText() {
        return mText;
    }
}