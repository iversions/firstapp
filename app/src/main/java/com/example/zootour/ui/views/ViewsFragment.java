package com.example.zootour.ui.views;

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

public class ViewsFragment extends Fragment {

    private ViewsViewModel viewsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        viewsViewModel =
                ViewModelProviders.of(this).get(ViewsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_views, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        viewsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}