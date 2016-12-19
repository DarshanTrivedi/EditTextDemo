package com.edittextdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sotsys016-2 on 19/12/16 in com.edittextdemo.
 */

public class MainActivity extends AppCompatActivity{
    private EditText edtText;
    private TextView tvText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtText = (EditText) findViewById(R.id.edtText);
        tvText = (TextView) findViewById(R.id.tvText);

        edtText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tvText.setText(""+charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
