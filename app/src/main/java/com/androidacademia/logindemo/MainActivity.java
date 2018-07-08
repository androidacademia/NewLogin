package com.androidacademia.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editUN,editP;
    int x  = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUN = findViewById(R.id.editTextUN);
        editP = findViewById(R.id.editTextPP);




        x  = 10;
        Log.i("MainAcitivy","OnCreate(), x =  "+x);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainAcitivy","onStart(), x =  "+x);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainAcitivy","onResume() x "+ x);
    }

    @Override
    protected void onPause() {
        super.onPause();
        x = 5;
        Log.i("MainAcitivy","onPause() x "+ x);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainAcitivy","onStop() x "+ x);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainAcitivy","onRestart() x "+ x);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainAcitivy","onDestroy() x "+ x);
    }

    public void login(View view) {
     //Execute your logic
     //Yes or No
        String un = editUN.getText().toString();
        String p = editP.getText().toString();
        Intent i = new Intent();
        i.putExtra("u",un);
        i.putExtra("pass",p);

        //i.setClass(MainActivity.this,WelcomeActivity.class);
          i.setAction("com.androidacademia.logindemo.OPENIT");
        if(un.equals("girish") && p.equals("123456")) {
            startActivity(i);
        }else {

        }

    }
}















