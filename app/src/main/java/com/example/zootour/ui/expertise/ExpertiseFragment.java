package com.example.zootour.ui.expertise;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.zootour.R;

public class ExpertiseFragment extends Fragment {

    private ExpertiseViewModel expertiseViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        expertiseViewModel =
                ViewModelProviders.of(this).get(ExpertiseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_expertise, container, false);
        final TextView textView = root.findViewById(R.id.text_share);
        expertiseViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}