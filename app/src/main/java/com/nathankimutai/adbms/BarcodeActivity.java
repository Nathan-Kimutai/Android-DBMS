package com.nathankimutai.adbms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BarcodeActivity extends AppCompatActivity {



    public void continueTo(View view){

        Button mButton = (Button) findViewById(R.id.button);
        EditText useranameEditText = (EditText) findViewById(R.id.username);
        EditText passwordEditText = (EditText) findViewById(R.id.password);
        String username =useranameEditText.getText().toString();
        mButton.animate().scaleX(.9f).scaleY(.9f).setDuration(1000);

        Log.i("info",username);
        if (username.equals("admin")){
            Intent intent = new Intent(BarcodeActivity.this,Typesofbarcodes.class);
            startActivity(intent);
        }else {
            Toast.makeText(this, "please use admin as the username", Toast.LENGTH_SHORT).show();
        }



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);

    }
}
