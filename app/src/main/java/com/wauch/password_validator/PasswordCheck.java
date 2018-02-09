package com.wauch.password_validator;

import wauch.password_validator.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PasswordCheck extends AppCompatActivity {
    Validator validate = new Validator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_check);
    }

    /** Called when the user taps the Submit button */
    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        if (validate.validatePassword(message) == validate.PASSEDRULES){
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Strong Password");
        }
        else{
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Your password isn't strong enough.");
        }
    }
}
