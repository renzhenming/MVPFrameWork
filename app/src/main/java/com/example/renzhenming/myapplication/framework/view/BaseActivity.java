package com.example.renzhenming.myapplication.framework.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.renzhenming.myapplication.framework.presenter.IPresenter;

/**
 * Created by renzhenming on 2017/8/5.
 */

public abstract class BaseActivity<V extends IView,P extends IPresenter<V>> extends AppCompatActivity {

    private P presenter;
    private V view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter == null){
            presenter = createPresenter();
        }
        if (view == null){
            view = createView();
        }
        if (presenter != null && view != null){
            presenter.attachView(view);
        }
    }

    protected abstract V createView();

    public abstract P createPresenter() ;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null){
            presenter.detachView();
            presenter = null;
        }
    }
}
