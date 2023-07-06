package com.houam.simpleandroidkeyboard;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.widget.FrameLayout;

public class SimpleIME extends InputMethodService {



    @Override
    public View onCreateInputView() {
        return (FrameLayout) getLayoutInflater().inflate(R.layout.keyboard, null);
    }
}
