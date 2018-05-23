package com.example.neoh.app_test1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tgActivity extends AppCompatActivity {

    private final static String TAG = "INFO activity ";
    private TextView mTwName;
    private TextView mTwPwd;
    private Button mBtnOk;
    private String name = "";
    private String pwd = "";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate called.");
        setContentView(R.layout.activity_tg);

        intent = getIntent();
        name = intent.getStringExtra("username");
        pwd = intent.getStringExtra("password");
        Init();
    }

    private void Init() {

        mTwName = (TextView) findViewById(R.id.sName);
        mTwPwd = (TextView) findViewById(R.id.sPwd);
        mBtnOk = (Button) findViewById(R.id.bOK);

        mTwName.setText("user:     " + name);
        mTwPwd.setText("password: " + pwd);
        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("username", name);
                intent.putExtra("password", pwd);
                setResult(1,intent);
                finish();
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause called.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop called.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume called.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy called.");
    }
}
