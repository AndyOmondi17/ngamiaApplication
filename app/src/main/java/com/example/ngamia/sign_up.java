package com.example.ngamia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class sign_up extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.surname) EditText mSurname;
    @BindView(R.id.firstname) EditText mfirstName;
    @BindView(R.id.idno) EditText mIdentificationNumber;
    @BindView(R.id.userid) EditText mPassword;
    @BindView(R.id.createButton) Button mSubmit;
    @BindView(R.id.loginTextView) TextView mLogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v){
        if(v == mLogIn){
            Intent intent = new Intent(this,log_in.class);
            startActivity(intent);
        }else if(v == mSubmit){

        }
//if(v == mLogInButton){
//            String userName = mUserName.getText().toString();
//            Toast.makeText(Login.this, "welcome "+userName , Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this,MainActivity.class);
//            startActivity(intent);
//        }else if (v == mSignUpPage){
//            Intent intent = new Intent(this,Sign_up.class);
//            startActivity(intent);
//        }else{
//            Toast.makeText(Login.this, "kindly click a button", Toast.LENGTH_LONG);
//        }

    }
}
