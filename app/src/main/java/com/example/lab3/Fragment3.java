package com.example.lab3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Fragment3 extends Fragment {
    private ImageView imageView;
    private ImageButton changeImageButton;
    private int img = 2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);
        imageView = view.findViewById(R.id.imageView_1);
        changeImageButton = view.findViewById(R.id.imageButton_1);

        changeImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (img == 1) {
                    imageView.setImageResource(R.drawable.draw1);
                    img = 2;
                } else if (img == 2) {
                    imageView.setImageResource(R.drawable.draw2);
                    img = 3;
                } else if (img == 3) {
                    imageView.setImageResource(R.drawable.draw3);
                    img = 1;
                }
            }
        });
        return view;
    }
}