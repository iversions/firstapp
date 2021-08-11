package com.example.zootour.ui.skills;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SkillsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SkillsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Skill is the unified force of experience, intellect and passion in their operation."+"     -John Ruskin");
    }

    public LiveData<String> getText() {
        return mText;
    }
}