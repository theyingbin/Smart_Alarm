package com.example.home.smartalarm;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.Calendar;


public class AlarmClock extends AppCompatActivity {

    private TimePicker tP;
    private AlarmClock alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_clock);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        tP = (TimePicker) findViewById(R.id.timePicker);
        setSupportActionBar(toolbar);

        Button setTime = (Button) findViewById(R.id.setTime);
        setTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = tP.getCurrentHour();
                int min = tP.getCurrentMinute();

                String displayTime = "Time: " + hour + ":" + min;
                TextView txtView = (TextView) findViewById(R.id.txtView);
                txtView.setText(displayTime);
            }

        });

//        TimePickerDialog.OnTimeSetListener timeSetListerner = new TimePickerDialog.OnTimeSetListener() {
//            @Override
//            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                String am_pm = "";
//
//                Calendar datetime = Calendar.getInstance();
//                datetime.set(Calendar.HOUR_OF_DAY, hourOfDay);
//                datetime.set(Calendar.MINUTE, minute);
//
//                if (datetime.get(Calendar.AM_PM) == Calendar.AM)
//                    am_pm = "AM";
//                else if (datetime.get(Calendar.AM_PM) == Calendar.PM)
//                    am_pm = "PM";
//
////              String displayTime = (datetime.get(Calendar.HOUR) == 0) ? "12" : datetime.get(Calendar.HOUR) + "";
//                String displayThis = "Time: " + hourOfDay + "" + minute;
//
//                TextView txtView = (TextView) findViewById(R.id.txtView);
//                txtView.setText(displayThis);
//
//                   public void onClick(View v) {
//                                    txtView.setText(displayTime);
//                                }
//                    }
//                };
    }
}
