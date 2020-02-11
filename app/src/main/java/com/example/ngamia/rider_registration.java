package com.example.ngamia;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class rider_registration extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{
    CustomArrayAdapter adapter;

    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private static  final String TAG = "rider_registration";
    private TextView mDisplayDate;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rider_registration);
        ButterKnife.bind(this);
        mDisplayDate = (TextView) findViewById(R.id.DOB);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog dialog = new DatePickerDialog(rider_registration.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,year,month,day);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker datePicker,int year,int month,int day){
                month = month +1;
                String date = day + "/" + month + "/" + year;
                mDisplayDate.setText(date);
            }
        };

        Spinner insurance = findViewById(R.id.insurancespinner);
        Spinner saccos = findViewById(R.id.spinnerSacco);
        Spinner educationLevel = findViewById(R.id.educationlevelspinner);
        Spinner childrenNumber = findViewById(R.id.childrenNumberspinner);
        String[] names = {"sacco1","sacco2"};


        insurance.setOnItemSelectedListener(this);
        educationLevel.setOnItemSelectedListener(this);
        childrenNumber.setOnItemSelectedListener(this);

        saccos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),names[position],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


//        Spinner sacco = findViewById(R.id.spinnerSacco);
//        sacco.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v){

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        Toast.makeText(this,parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){

    }
}

