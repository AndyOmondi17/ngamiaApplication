package com.example.ngamia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class reset_password extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.lpswrd) EditText mPassword;
    @BindView(R.id.cpswrd) EditText mConfirmPassword;
    @BindView(R.id.signIn) Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v){

        if(v == mButton){


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
