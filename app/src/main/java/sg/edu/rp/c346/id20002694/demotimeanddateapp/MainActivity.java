package sg.edu.rp.c346.id20002694.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id. dp);
        tp = findViewById(R.id. tp);
        btnDisplayDate = findViewById(R.id. buttonDisplayDate);
        btnDisplayTime = findViewById(R.id. buttonDisplayTime);
        tvDisplay = findViewById(R.id. tvDisplay);
        reset = findViewById(R.id. resetBtn);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("The time is "+tp.getCurrentHour()+":"+tp.getCurrentMinute());
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("The date is "+dp.getDayOfMonth()+"/"+(dp.getMonth()+1)+"/"+dp.getYear());
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp.updateDate(2020,0,01);
                tp.setCurrentHour(0);
                tp.setCurrentMinute(00);
            }
        });
    }
}