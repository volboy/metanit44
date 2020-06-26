package com.example.metanit44;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateDefault=findViewById(R.id.dateDefault);
        TextView timeDefault=findViewById(R.id.timeDefault);

        DatePicker dp=(DatePicker)this.findViewById(R.id.datePicker);
        //Месяц начиная с нуля. Для отображения добавляем 1.
        dateDefault.setText("Дата по умолчанию"+dp.getDayOfMonth()+"/"+(dp.getMonth()+1)+"/"+dp.getYear());
        dp.init(2015, 02, 01, null);

        TimePicker tp=(TimePicker)this.findViewById(R.id.timePicker);
        java.util.Formatter timeF=new java.util.Formatter();
        timeF.format("Время по умолчанию %d:%02d",tp.getCurrentHour(), tp.getCurrentMinute());
        timeDefault.setText(timeF.toString());
        tp.setIs24HourView(true);
        tp.setCurrentHour(new Integer(10));
        tp.setCurrentMinute(new Integer(10));

    }
}
