package com.manasvi.androidutilities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gdacciaro.iOSDialog.iOSDialog;
import com.gdacciaro.iOSDialog.iOSDialogBuilder;
import com.gdacciaro.iOSDialog.iOSDialogClickListener;

public class IOSDialogeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_iosdialoge);
    }

    public void IOSDialoge(Context ctx, String title, String subtitle) {
        new iOSDialogBuilder(ctx)
                .setTitle(title)
                .setSubtitle(subtitle)
                .setBoldPositiveLabel(true)
                .setCancelable(false)
                .setPositiveListener("Ok", new iOSDialogClickListener() {
                    @Override
                    public void onClick(iOSDialog dialog) {
                        dialog.dismiss();

                    }
                })
                .setNegativeListener("Dismiss", new iOSDialogClickListener() {
                    @Override
                    public void onClick(iOSDialog dialog) {
                        dialog.dismiss();
                    }
                })
                .build().show();
    }
}
