package com.example.myapplication.presenter.acivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.interfaces.IBasePresenter;

public class Questionnaire_acivity extends BaseActivity {


    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_questionnaire_acivity;
    }

    @Override
    public void showError(String errorMsg) {

    }
}
