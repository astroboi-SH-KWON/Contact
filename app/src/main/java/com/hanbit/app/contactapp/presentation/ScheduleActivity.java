package com.hanbit.app.contactapp.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import com.hanbit.app.contactapp.R;

import java.util.Calendar;

public class ScheduleActivity extends AppCompatActivity implements View.OnClickListener{
    RadioButton rbCalendar,rbClock;
    CalendarView cvSet;
    TimePicker tpSet;
    Button btSet;
    TextView tvYear,tvMonth,tvDate,tvHour,tvMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        rbCalendar= (RadioButton) findViewById(R.id.rbCalendar);
        rbClock= (RadioButton) findViewById(R.id.rbClock);
        cvSet= (CalendarView) findViewById(R.id.cvSet);
        tpSet= (TimePicker) findViewById(R.id.tpSet);
        btSet= (Button) findViewById(R.id.btSet);
        tvYear= (TextView) findViewById(R.id.tvYear);
        tvMonth= (TextView) findViewById(R.id.tvMonth);
        tvDate= (TextView) findViewById(R.id.tvDate);
        tvHour= (TextView) findViewById(R.id.tvHour);
        tvMinute= (TextView) findViewById(R.id.tvMinute);

        cvSet.setVisibility(View.VISIBLE);
        tpSet.setVisibility(View.INVISIBLE);
        rbCalendar.setOnClickListener(this);
        rbCalendar.setOnClickListener(this);
        btSet.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbCalendar:
                cvSet.setVisibility(View.VISIBLE);
                tpSet.setVisibility(View.INVISIBLE);
                break;
            case R.id.rbClock:
                cvSet.setVisibility(View.INVISIBLE);
                tpSet.setVisibility(View.VISIBLE);
                break;
            case R.id.btSet:
                java.util.Calendar curDate=java.util.Calendar.getInstance();
                curDate.setTimeInMillis(cvSet.getDate());
                tvYear.setText(Integer.toString(curDate.get(Calendar.YEAR)));
                tvMonth.setText(Integer.toString(curDate.get(Calendar.MONTH)+1));
                tvDate.setText(Integer.toString(curDate.get(Calendar.DATE)));
                /*tvHour.setText(Integer.toString(curDate.get(tpSet.getCurrentHour())));
                tvMinute.setText(Integer.toString(curDate.get(tpSet.getCurrentMinute())));*/
                break;
        }
    }
}
