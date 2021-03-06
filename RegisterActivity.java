package com.example.srilakshmip.yamyahapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etUserID = (EditText) findViewById(R.id.etUserID);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etPhoneNo = (EditText) findViewById(R.id.etPhoneNo);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final Button bRegister = (Button) findViewById(R.id.bRegister);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("user");

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User ob=new User();
                ob.setName(etName.getText().toString());
                ob.setPassword(etPassword.getText().toString());
                ob.setEmail(etEmail.getText().toString());
                ob.setPhoneno(Integer.parseInt(etPhoneNo.getText().toString()));
                ob.setUserid(etUserID.getText().toString());
                myRef.setValue(ob);

            }
        });
    }
}
