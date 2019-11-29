package com.minhnv.mvvmdemo.base;

import androidx.lifecycle.ViewModel;

import java.lang.ref.WeakReference;

public class BaseViewModel<N> extends ViewModel {
    // weak reference dùng để liên kết giữa activity và fragment
    private WeakReference<N> mNavigator;

    public BaseViewModel() {
    }

    // nhận về interface navigator
    protected N getNavigator(){
        return mNavigator.get();
    }

    //cài đặt interface navigator
    public void setNavigator(N navigator){
        this.mNavigator = new WeakReference<>(navigator);
    }
}
