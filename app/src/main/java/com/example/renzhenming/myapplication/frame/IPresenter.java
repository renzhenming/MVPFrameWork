package com.example.renzhenming.myapplication.frame;

/**
 * Created by renzhenming on 2017/8/5.
 */

public class IPresenter<V extends IView > {


    private V view;

    public IPresenter(V view) {
        attachView(view);
    }

    public void attachView(V view){
        this.view = view;
    }

    public void detachView(){
        view = null;
    }

    public V getView() {
        return view;
    }
}
