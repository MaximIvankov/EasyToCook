package com.lucky.max.easytocook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button b_cook;
    private Button b_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_cook = findViewById(R.id.b_cook);
        b_exit = findViewById(R.id.b_exit);

        b_exit.setOnClickListener(this);
        b_cook.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_cook:;
            case R.id.b_exit: System.exit(0);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
