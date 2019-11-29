package com.minhnv.mvvmdemo.base;

import android.app.ProgressDialog;

import androidx.appcompat.app.AppCompatActivity;

import com.minhnv.mvvmdemo.utils.CommonUtils;

public class BaseActivity<V extends BaseViewModel> extends AppCompatActivity {

    // "V" ở đây là biểu trưng cho 1 viewModel
    public V viewmodel;
    public ProgressDialog progressDialog;

    public void showLoading(){
        progressDialog = CommonUtils.showLoadingDialog(this);
    }
    public void hideLoading(){
        if(progressDialog != null && progressDialog.isShowing()){
            progressDialog.cancel();
        }
    }
}
