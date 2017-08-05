package com.example.renzhenming.myapplication.presenter;

import com.example.renzhenming.myapplication.frame.IPresenter;
import com.example.renzhenming.myapplication.frame.IView;
import com.example.renzhenming.myapplication.imp.MainView;
import com.example.renzhenming.myapplication.model.MainModel;

/**
 * Created by renzhenming on 2017/8/5.
 */

public class MainPresenter extends IPresenter<MainView>{

    private MainModel mainModel;

    public MainPresenter(MainView view) {
        super(view);
        this.mainModel = new MainModel();
    }

    public void login(String username, String password){
        mainModel.login(username, password, new MainView() {
            @Override
            public void onLoginSuccess(String result) {
                if (getView()!= null)
                    getView().onLoginSuccess(result);
            }

            @Override
            public void onLoginFailed(String result) {
                if (getView()!= null)
                    getView().onLoginFailed(result);
            }
        });
    }
}
