package com.nareshtechnologies.celsiustofahrenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText ct;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ct = findViewById(R.id.celsius);
        tv = findViewById(R.id.textView);
    }

    // This method gets invoked as soon as the button on the xml file is clicked.
    public void convert(View view) {
        // TODO 1: Get the celsius temperature
        double celsius = Double.parseDouble(ct.getText().toString());
        // TODO 2: convert it to fahrenheit
        // f = c*1.8 + 32 (here f is fahrenheit & c is celsius)
        double f = celsius*1.8 + 32;
        // TODO 3: Display the data to the user
        DecimalFormat df = new DecimalFormat("#.##");
        tv.setText(df.format(f)+"°F");
    }
}