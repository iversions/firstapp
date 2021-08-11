package com.example.zootour.ui.skills;

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

public class SkillsFragment extends Fragment {

    private SkillsViewModel skillsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        skillsViewModel =
                ViewModelProviders.of(this).get(SkillsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_skills, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        skillsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}