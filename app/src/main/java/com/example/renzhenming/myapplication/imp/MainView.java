package com.example.renzhenming.myapplication.imp;

import com.example.renzhenming.myapplication.frame.IView;

/**
 * Created by renzhenming on 2017/8/5.
 */

public interface MainView extends IView {
    void onLoginSuccess(String result);
    void onLoginFailed(String result);
}
