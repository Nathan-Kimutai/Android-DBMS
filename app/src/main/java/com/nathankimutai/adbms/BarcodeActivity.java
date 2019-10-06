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
        EditText useranameEditText = (EditText) findViewById(R.id.editText);
        EditText passwordEditText = (EditText) findViewById(R.id.editText2);
        String username =useranameEditText.getText().toString();
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
