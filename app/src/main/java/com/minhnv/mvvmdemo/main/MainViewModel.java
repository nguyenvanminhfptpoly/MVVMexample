package com.minhnv.mvvmdemo.main;

import android.content.Context;
import android.widget.Toast;

import com.minhnv.mvvmdemo.base.BaseViewModel;

public class MainViewModel extends BaseViewModel<MainNavigator> {

    public void login(String username, String password, Context context){
        if(username.equals("admin") || password.equals("admin")){
            Toast.makeText(context, "Thành công", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "thất bại", Toast.LENGTH_SHORT).show();
        }
    }

    public void ServerLogin(){
        getNavigator().doLogin();
    }
}
