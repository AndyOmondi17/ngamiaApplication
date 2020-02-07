package com.example.ngamia;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class rider_registration extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rider_registration);
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v){
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
