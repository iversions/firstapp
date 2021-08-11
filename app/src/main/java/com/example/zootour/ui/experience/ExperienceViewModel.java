package com.example.zootour.ui.experience;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExperienceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ExperienceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("A man who carries a cat by the tail learns something he can learn in no other way."+" -Mark Twain");
    }

    public LiveData<String> getText() {
        return mText;
    }
}