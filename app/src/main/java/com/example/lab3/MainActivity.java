package com.example.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Button btn_fragment1, btn_fragment2, btn_fragment3;
    Fragment1 fragment1 = new Fragment1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_fragment1 = findViewById(R.id.button1);
        btn_fragment2 = findViewById(R.id.button2);
        btn_fragment3 = findViewById(R.id.button3);

        setNewFragment(fragment1);

        btn_fragment1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setNewFragment(fragment1);
            }
        });

        btn_fragment2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 = new Fragment2();
                setNewFragment(fragment2);
            }
        });

        btn_fragment3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Fragment3 fragment3 = new Fragment3();
                setNewFragment(fragment3);
            }
        });

    }
    private void setNewFragment(Fragment fragment){

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_layout, fragment);
        ft.commit();
    }
}