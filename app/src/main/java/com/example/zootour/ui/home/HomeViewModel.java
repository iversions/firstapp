package com.example.zootour.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This section is created for everyone to have an insight into my professional life and my motivations. \n \nI have split my profile in several topics that can be accessed by navigation on the right. The thought behind having something like this was to showcase my skills and detail things that goes unnoticed, that there is more in everyone than what can be deduced from a CV. \n \nI have put forth a lot of my thoughts related to topics like this and other in the &quot;Views&quot; section. Thanks for taking time and going through the app. I would highly appreciate if you could leave some feedback in the &quot;Contact&quot; screen.");
    }

    public LiveData<String> getText(){
        return mText;
    }
}
