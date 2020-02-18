package com.example.ngamia;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

    ProgressDialog progressDialog;

    AwesomeValidation awesomeValidation;

    APIinterface apIinterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        ButterKnife.bind(this);
        mSubmit.setOnClickListener(this);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

//        add validation to surname
        awesomeValidation.addValidation(this, R.id.surname, RegexTemplate.NOT_EMPTY, R.string.invalid_name);
//        add valdiation to firstname
        awesomeValidation.addValidation(this, R.id.firstname, RegexTemplate.NOT_EMPTY, R.string.invalid_name);

        progressDialog = new ProgressDialog(this);

        progressDialog.setMessage("Please wait.... ");
        // add validation to identification number
        awesomeValidation.addValidation(this, R.id.idno, "[5-9]{1}[0-9]{9}$", R.string.invalid_idno);
//        add validation to password
        awesomeValidation.addValidation(this, R.id.userid, ".{6,}", R.string.invalid_password);
    }


    private void regiterUser(){
        String Surname = mSurname.getText().toString().trim();
        String Firstname = mfirstName.getText().toString().trim();
        String password = mPassword.getText().toString().trim();
        Integer IdNo = Integer.parseInt(mIdentificationNumber.getText().toString().trim());

        apIinterface = APIclient.getApiClient().create(APIinterface.class);
        Call<User> call = apIinterface.saveUSer(Surname, Firstname, IdNo, password);
        call.enqueue(new Callback<User>(){

            @Override
            public void onResponse(Call<User> call, Response<User> response){
                progressDialog.dismiss();
                if(response.isSuccessful()&&response.body()!=null){
                    Boolean success = response.body().getSuccess();
                    if(success){
                        Toast.makeText(sign_up.this,response.body().getMessage(), Toast.LENGTH_SHORT).show();
                        finish();
                    }else{
                        Toast.makeText(sign_up.this,response.body().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(sign_up.this,t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        progressDialog.show();
    }

    @Override
    public void onClick(View v) {
        if(v == mSubmit) {
            regiterUser();
        }else if (v == mLogIn){
            Intent intent = new Intent(this, log_in.class);
            startActivity(intent);
        }else{

        }

    }
}