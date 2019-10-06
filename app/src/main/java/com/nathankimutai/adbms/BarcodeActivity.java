package com.nathankimutai.adbms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BarcodeActivity extends AppCompatActivity {

    private Button mButton = (Button) findViewById(R.id.button);
    private EditText useranameEditText = (EditText) findViewById(R.id.editText);
    private EditText passwordEditText = (EditText) findViewById(R.id.editText2);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);
    }
}
