package com.example.neoh.app_test1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "login activity ";
    private Context context = this;

    private EditText mEtName;
    private EditText mEtPwd;
    private Button mBtnSgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate called.");
        setContentView(R.layout.activity_main);
        getViewItem();
    }

    private void getViewItem() {
        mEtName = (EditText) findViewById(R.id.editText_name);
        mEtPwd = (EditText) findViewById(R.id.editText_pwd);
        mBtnSgn = (Button) findViewById(R.id.button_sign);
        mBtnSgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, tgActivity.class);
                intent.putExtra("username", mEtName.getText().toString());
                intent.putExtra("password", mEtPwd.getText().toString());
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 1) {
            String name = data.getStringExtra("username");
            String pwd = data.getStringExtra("password");
            mEtName.setText(name);
            mEtPwd.setText(pwd);
        }

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
