package com.exmple.mytestabc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class dev1Activity extends Activity {
    private static final String TAG = "dev1Activity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btn222 = new Button(this);
    }
}
