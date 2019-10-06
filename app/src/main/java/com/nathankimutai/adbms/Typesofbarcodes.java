package com.nathankimutai.adbms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Typesofbarcodes extends AppCompatActivity {

    private String[] barcodes = new String[] {"Code 39","Code 128","Interleaved 2 or 5","UPC","EAN","PDF417","Data Matrix","Quick Response"};

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typesofbarcodes);

        mListView = (ListView) findViewById(R.id.theList);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,barcodes);
        mListView.setAdapter(adapter);
    }
}
