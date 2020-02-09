package com.example.ngamia;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class rider_registration extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rider_registration);
        ButterKnife.bind(this);

        Spinner insurance = findViewById(R.id.insurancespinner);
        insurance.setOnItemSelectedListener(this);

//        Spinner sacco = findViewById(R.id.spinnerSacco);
//        sacco.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v){

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

