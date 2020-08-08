package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {
    TextView txtView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.i(tag:"LifeCycle", msg:"OnCreate() invoked");

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
    }
    public void onStart(){
        super.onStart();
        Log.i(tag: "LifeCycle", msg: "OnStart() invoked");
    }

    public void onRestart(){
        super.onRestart();
        Log.i(tag: "LifeCycle", msg: "OnRestart() invoked");
    }

    public void onResume(){
        super.onResume();
        Log.i(tag: "LifeCycle", msg: "OnResume() invoked");
    }

    public void onPause(){
        super.onPause();
        Log.i(tag: "LifeCycle", msg: "OnPause() invoked");
    }

    public void onStop(){
        super.onStop();
        Log.i(tag: "LifeCycle", msg: "OnStop() invoked");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.i(tag: "LifeCycle", msg: "OnDestroy() invoked");
    }
}

