package com.example.zootour.ui.contact;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ContactViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("One thing that is likely to make you lose touch is if you keep in touch with the past too much."+"-John Hurt");
    }

    public LiveData<String> getText() {
        return mText;
    }
}