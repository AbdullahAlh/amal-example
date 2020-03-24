package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final LinearLayout linearLayout1 = findViewById(R.id.linearLayout1);
        final LinearLayout linearLayout2 = findViewById(R.id.linearLayout2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linearLayout1.getVisibility() == View.VISIBLE) {
                    linearLayout1.setVisibility(View.GONE);
                    linearLayout2.setVisibility(View.VISIBLE);
                }
                else {
                    linearLayout2.setVisibility(View.GONE);
                    linearLayout1.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
