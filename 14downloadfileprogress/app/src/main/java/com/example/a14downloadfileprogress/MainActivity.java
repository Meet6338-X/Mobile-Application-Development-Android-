package com.example.a14downloadfileprogress;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();
    int progressStatus = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void popoutdialog(View view){
        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("File downloading");
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setMax(100);
        pd.setProgress(0);
        pd.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < 100) {
                    progressStatus += 10;

                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            pd.setProgress(progressStatus);
                        }
                    });
                    try {
                        Thread.sleep(450);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // After loop completes
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        pd.dismiss();
                        progressStatus = 0;
                    }
                });
            }
        }).start();
    }
}