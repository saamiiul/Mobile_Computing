package org.samiulhaq.mylayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button = findViewById(R.id.button4);
        textView = findViewById(R.id.textViewCode);
    }
    public void SomeOneIsThere(View view)
    {
        textView.setText("Some one new is there.");
    }
}