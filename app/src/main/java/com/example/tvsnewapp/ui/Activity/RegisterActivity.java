package com.example.tvsnewapp.ui.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tvsnewapp.R;


public class RegisterActivity extends AppCompatActivity {
    Button btnregister;
    TextView txtlogin;
    EditText edtpassword,edtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnregister=(Button) findViewById(R.id.btnregister);
        txtlogin=(TextView)findViewById(R.id.txtlogin);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (edtname.length() == 0) {
//                    edtname.setError("Field Can't be Empty.");
//                    edtname.requestFocus();
//                    return;
//                }
//                if (edtpassword.length() == 0) {
//                    edtpassword.setError("Field Can't be Empty.");
//                    edtpassword.requestFocus();
//                    return;
//                }
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));

            }
        });
        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));

            }
        });

//        edtname.addTextChangedListener(new TextWatcher() {
//            public void afterTextChanged(Editable s) {
//
//                if (edtname.length() != 0) {
//                    edtname.setError(null);
//                } else {
//                    edtname.setError("Field Can't be Empty.");
//                }
//
//            }
//
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                // other stuffs
//            }
//
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                // other stuffs
//            }
//        });
//        edtpassword.addTextChangedListener(new TextWatcher() {
//            public void afterTextChanged(Editable s) {
//
//                if (edtpassword.length() != 0) {
//                    edtpassword.setError(null);
//                } else {
//                    edtpassword.setError("Field Can't be Empty.");
//                }
//
//            }
//
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                // other stuffs
//            }
//
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                // other stuffs
//            }
//        });
    }
}
