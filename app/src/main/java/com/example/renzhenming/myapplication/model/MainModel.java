package com.example.renzhenming.myapplication.model;

import android.os.SystemClock;

import com.example.renzhenming.myapplication.frame.IView;
import com.example.renzhenming.myapplication.imp.MainView;

/**
 * Created by renzhenming on 2017/8/5.
 */

public class MainModel {

    public void login(String username, String password, MainView listener){
        SystemClock.sleep(1000);
        if (true){
            listener.onLoginSuccess("登陆成功返回");
        }else {
            listener.onLoginFailed("登陆失败");
        }
    }
}
