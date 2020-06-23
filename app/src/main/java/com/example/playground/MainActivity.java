package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    File file;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String filename = "newfile";
        file = new File(this.getFilesDir(), filename);
    }
}
