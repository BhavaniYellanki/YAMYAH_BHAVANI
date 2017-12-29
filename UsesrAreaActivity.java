package com.example.srilakshmip.yamyahapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;

public class UsesrAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usesr_area);
        final EditText etUserID = (EditText) findViewById(R.id.etUserID);
        final EditText etPhoneNo = (EditText) findViewById(R.id.etPhoneNo);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);
    }
}
