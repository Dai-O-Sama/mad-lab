package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");

        btn = findViewById(R.id.button);

        btn.setOnClickListener(view -> {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
        });
    }
}
