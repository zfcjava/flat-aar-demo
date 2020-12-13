package com.example.lib_base_library;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        initData();
        initListener();
    }

    public abstract int getLayoutId();

    public void initView(){};

    public void initData(){};

    public void initListener(){};


    protected void showToast(int msgRes){
        String msg = getResources().getString(msgRes);
        showToast(msg);
    }


    protected void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
