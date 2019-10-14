package com.nathankimutai.adbms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

import static android.Manifest.permission.CAMERA;

public class Typesofbarcodes extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    public static final int REQUEST_CAMERA =1;
    private ZXingScannerView scannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        scannerView = new ZXingScannerView(this);
        setContentView(scannerView);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M)
        {
            if(checkPermission())
            {
                Toast.makeText(this, "Permission granted", Toast.LENGTH_SHORT).show();
            }else {
                requestPermission();
            }
        }

    }

    public boolean checkPermission(){
        return (ContextCompat.checkSelfPermission(this, CAMERA) == PackageManager.PERMISSION_GRANTED);
    }

    public void requestPermission(){
        ActivityCompat.requestPermissions(this,new String[]{CAMERA},REQUEST_CAMERA);
    }

    public void onRequestPermissionResult(int requestCode,String[] permissions,int[] grantResults){
        switch (requestCode)
        {
            case REQUEST_CAMERA:
                if(grantResults.length > 0){
                    boolean cameraAccepted = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                    if(cameraAccepted){
                        Toast.makeText(this, "Permission granted", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                            if(shouldShowRequestPermissionRationale(CAMERA)){
                                displayAlertMessage("You need to allow access for both permissions",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                requestPermissions(new String[]{CAMERA},REQUEST_CAMERA);
                                            }
                                        });
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(checkPermission()){
                if(scannerView==null){
                    scannerView = new ZXingScannerView(this);
                    setContentView(scannerView);
                }
                scannerView.setResultHandler(this);
                scannerView.startCamera();
            }else {
                requestPermission();
            }
        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        scannerView.stopCamera();
    }

    public void displayAlertMessage(String message, DialogInterface.OnClickListener listener){
        new AlertDialog.Builder(Typesofbarcodes.this).setMessage(message).setPositiveButton("OK",listener).setNegativeButton("Cancel",null).create().show();

    }

    @Override
    public void handleResult(final Result result) {
        final String scannedresult = result.getText();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Scanned result");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                scannerView.resumeCameraPreview(Typesofbarcodes.this);

            }
        });
        builder.setNeutralButton("Visit ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(scannedresult));
                startActivity(intent);
            }
        });
        builder.setMessage(scannedresult);
        AlertDialog alert = builder.create();
        alert.show();
    }
}
