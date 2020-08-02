package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

        Log.i("Lifecycle", "On Create called...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "On Start called...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "On Resume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "On Pause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "On Stop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "On Destroy called...");
    }
}