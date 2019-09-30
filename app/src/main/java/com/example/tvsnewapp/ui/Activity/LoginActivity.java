package com.example.tvsnewapp.ui.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tvsnewapp.R;


public class LoginActivity extends AppCompatActivity {
    Button btn_login;
    TextView txtregister;
    EditText edtname,edtpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login=(Button) findViewById(R.id.btn_login);
        txtregister=(TextView) findViewById(R.id.txtregister);
        edtname=(EditText)findViewById(R.id.edtname);
        edtpassword=(EditText)findViewById(R.id.edtpassword);
        txtregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtname.length() == 0) {
                    edtname.setError("Field Can't be Empty.");
                    edtname.requestFocus();
                    return;
                }
                if (edtpassword.length() == 0) {
                    edtpassword.setError("Field Can't be Empty.");
                    edtpassword.requestFocus();
                    return;
                }
                startActivity(new Intent(LoginActivity.this, MainActivity.class));

            }
        });

        edtname.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {

                if (edtname.length() != 0) {
                    edtname.setError(null);
                } else {
                    edtname.setError("Field Can't be Empty.");
                }

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });
        edtpassword.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {

                if (edtpassword.length() != 0) {
                    edtpassword.setError(null);
                } else {
                    edtpassword.setError("Field Can't be Empty.");
                }

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });

    }
}
