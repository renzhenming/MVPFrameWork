package com.example.renzhenming.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.renzhenming.myapplication.frame.BaseActivity;
import com.example.renzhenming.myapplication.imp.MainView;
import com.example.renzhenming.myapplication.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainView,MainPresenter> implements MainView{

    @Override
    protected MainView bindView() {
        return this;
    }

    @Override
    public MainPresenter bindPresenter() {
        return new MainPresenter(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        getPresenter().login("张三","123456");
    }

    @Override
    public void onLoginSuccess(String result) {
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFailed(String ex) {

    }

}
