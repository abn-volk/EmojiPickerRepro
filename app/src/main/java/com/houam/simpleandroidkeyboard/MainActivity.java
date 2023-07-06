package com.houam.simpleandroidkeyboard;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String CURRENT_IME_ID = Settings.Secure.getString(getContentResolver(),Settings.Secure.DEFAULT_INPUT_METHOD);

        InputMethodManager imeManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
        List<InputMethodInfo> list = imeManager.getInputMethodList();
        for (InputMethodInfo info : list){
            if (info.getPackageName().equals(getPackageName()) && !info.getId().equals(CURRENT_IME_ID)){
                imeManager.showInputMethodPicker(); //If the selected keyboard is not ours, show select dialog
            }
        }
    }
}
