package com.example.ngamia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class sign_up extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.surname)
    EditText mSurname;
    @BindView(R.id.firstname)
    EditText mfirstName;
    @BindView(R.id.idno)
    EditText mIdentificationNumber;
    @BindView(R.id.pswrd)
    EditText mPassword;
    @BindView(R.id.createButton)
    Button mSubmit;
    @BindView(R.id.lTextView)
    TextView mLogIn;

    AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        ButterKnife.bind(this);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

//        add validation to surname
        awesomeValidation.addValidation(this, R.id.surname, RegexTemplate.NOT_EMPTY, R.string.invalid_name);
//        add valdiation to firstname
        awesomeValidation.addValidation(this, R.id.firstname, RegexTemplate.NOT_EMPTY, R.string.invalid_name);


        // add validation to identification number
        awesomeValidation.addValidation(this, R.id.idno, "[5-9]{1}[0-9]{9}$", R.string.invalid_idno);
//        add validation to password
        awesomeValidation.addValidation(this, R.id.userid, ".{6,}", R.string.invalid_password);


    }

    @Override
    public void onClick(View v){
        if(v == mLogIn){
            Intent intent = new Intent();
            startActivity(intent);
        }
    }

}