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

import butterknife.BindView;
import butterknife.ButterKnife;

public class log_in extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.userid) EditText mUserIdNumber;
    @BindView(R.id.pswrdL) EditText mPassword;
    @BindView(R.id.loginButton) Button mButton;
    @BindView(R.id.registerTextView) TextView mRegister;
    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        ButterKnife.bind(this);
        mButton.setOnClickListener(this);
        mRegister.setOnClickListener(this);
        awesomeValidation= new AwesomeValidation(ValidationStyle.BASIC);

        // add validation to identification number
        awesomeValidation.addValidation(this,R.id.idno,"[5-9]{1}[0-9]{9}$",R.string.invalid_idno);
//        add validation to password
        awesomeValidation.addValidation(this,R.id.userid,".{6,}",R.string.invalid_password);
    }

    @Override
    public void onClick(View v){
        if(v == mRegister){

            Intent intent = new Intent(this,sign_up.class);
            startActivity(intent);
        }else if(v == mButton){


        }
//        if(v == mLogInButton){
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
