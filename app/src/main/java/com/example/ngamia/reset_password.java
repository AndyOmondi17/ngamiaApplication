package com.example.ngamia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import butterknife.BindView;
import butterknife.ButterKnife;

public class reset_password extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.lpswrd) EditText mPassword;
    @BindView(R.id.cpswrd) EditText mConfirmPassword;
    @BindView(R.id.changePassword) Button mButton;


    AwesomeValidation awesomevalidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);
        ButterKnife.bind(this);
        mButton.setOnClickListener(this);
//        initialize validationsty;e
//        awesomevalidation = new AwesomeValidation(ValidationStyle.BASIC);

//        add validation for newpassword

//        awesomeValidation.addValidation(this,R.id.userid,".{6,}",R.id.invalid_password);
//        awesomevalidation.addValidation(this,R.id.lpswrd,".{6,}",R.string.invalid_password);
//        add validation for confirmpassword
//        awesomevalidation.addValidation(this,R.id.cpswrd,R.id.lpswrd,R.string.invalid_confirmpassword);


    }

    @Override
    public void onClick(View v){
        if(v == mButton){
            Toast.makeText(getApplicationContext(),"Password Changed succesfully",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,log_in.class);
            startActivity(intent);
//            check validation
//    if(awesomevalidation.validate()){
//        Toast.makeText(getApplicationContext(),"Form Validation succesfull",Toast.LENGTH_SHORT);
    }else{
        Toast.makeText(getApplicationContext(),"validation failed",Toast.LENGTH_SHORT).show();
    }
//            on success
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

