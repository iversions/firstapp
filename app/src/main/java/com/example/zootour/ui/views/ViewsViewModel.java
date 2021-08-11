package com.example.zootour.ui.views;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ViewsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("There is nothing insignificant in the world. It all depends on the point of view."+"          -Johann Wolfgang von Goethe");
    }

    public LiveData<String> getText() {
        return mText;
    }
}