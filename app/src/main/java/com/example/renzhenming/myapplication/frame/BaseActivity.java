package com.example.renzhenming.myapplication.frame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.renzhenming.myapplication.R;

public abstract class BaseActivity<V extends IView,P extends IPresenter<V>> extends AppCompatActivity {

    private P presenter;
    private V view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter == null){
            presenter = bindPresenter();
        }
        if (view == null){
            view = bindView();
        }
    }

    public P getPresenter() {
        return presenter;
    }

    public V getView() {
        return view;
    }

    //绑定view
    protected abstract V bindView();
    //绑定presenter
    public abstract P bindPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null){
            presenter.detachView();
        }
    }
}
