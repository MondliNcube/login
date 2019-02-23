package com.example.beverly.registrationdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Homepage extends AppCompatActivity {

    TextView textView4;
    SimpleDateFormat simpleDateFormat;
    String time;
    Calendar calander;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());
        TextView textView9=(TextView) findViewById(R.id.textView9);
        textView9.setText(currentTime);




        TextView textView4 = (TextView) findViewById(R.id.textView4);


            /// For Show Time
            String currentTimeString = DateFormat.getTimeInstance().format(new Date());
            // textView is the TextView view that should display it
            textView4.setText(currentTimeString);



    }

}

