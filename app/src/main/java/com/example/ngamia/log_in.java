package com.example.ngamia;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class log_in extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.userid) EditText mUserIdNumber;
    @BindView(R.id.pswrdL) EditText mPassword;
    @BindView(R.id.loginButton) Button mButton;
    @BindView(R.id.registerTextView) TextView mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        ButterKnife.bind(this);
        mButton.setOnClickListener(this);
        mRegister.setOnClickListener(this);
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
