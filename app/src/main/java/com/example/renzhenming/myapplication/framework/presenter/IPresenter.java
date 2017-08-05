package com.example.renzhenming.myapplication.framework.presenter;

import com.example.renzhenming.myapplication.framework.view.IView;

/**
 * Created by renzhenming on 2017/8/5.
 */

public interface IPresenter<V extends IView> {

    /**绑定视图*/
    public void attachView(V view);

    /**解除绑定*/
    public void detachView();
}
