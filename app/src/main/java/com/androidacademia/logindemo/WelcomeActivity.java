package com.androidacademia.logindemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    TextView textViewOut;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        editText = findViewById(R.id.editTextURL);
        textViewOut = findViewById(R.id.textView);
        Intent intent=getIntent();
        String u = intent.getStringExtra("u");
        String p = intent.getStringExtra("pass");
        String welocome = "Welcome, "+u+" ,your password is "+p;
        textViewOut.setText(welocome);
    }

    public void openURL(View view) {
        String url = editText.getText().toString();
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }
}
