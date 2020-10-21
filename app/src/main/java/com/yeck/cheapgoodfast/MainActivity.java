package com.yeck.cheapgoodfast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Switch switch1, switch2, switch3;
    Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        switch3 = findViewById(R.id.switch3);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switch1.isChecked() && switch2.isChecked() && switch3.isChecked()){
                    if (r.nextBoolean()){
                        switch2.setChecked(false);
                    } else {
                        switch3.setChecked(false);
                    }
                }
            }
        });
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switch1.isChecked() && switch2.isChecked() && switch3.isChecked()){
                    if (r.nextBoolean()){
                        switch1.setChecked(false);
                    } else {
                        switch3.setChecked(false);
                    }
                }
            }
        });
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switch1.isChecked() && switch2.isChecked() && switch3.isChecked()){
                    if (r.nextBoolean()){
                        switch1.setChecked(false);
                    } else {
                        switch2.setChecked(false);
                    }
                }
            }
        });
    }




}
