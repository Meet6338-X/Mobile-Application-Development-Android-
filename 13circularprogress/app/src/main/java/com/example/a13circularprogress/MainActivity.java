package com.example.a13circularprogress;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public ProgressBar progressBar;
    public int progressStatus = 0;
    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.pb1);
        textView = findViewById(R.id.textview);
        new Thread(new Runnable(){
            public void run() {
                while(progressStatus < 100) {
                    progressStatus += 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(){
                        public void run() {
                            progressBar.setProgress(progressStatus);
                            textView.setText(progressStatus+"/"+progressBar.getMax());
                        }
                    });
                    try {
                        Thread.sleep(150);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}