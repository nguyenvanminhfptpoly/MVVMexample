package com.minhnv.mvvmdemo.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.lifecycle.ViewModelProviders;

import com.minhnv.mvvmdemo.R;
import com.minhnv.mvvmdemo.base.BaseActivity;

public class MainActivity extends BaseActivity<MainViewModel> implements MainNavigator, View.OnClickListener {

    /**
     * Name
     */
    private EditText edUsename;
    /**
     * Name
     */
    private EditText edPassword;
    /**
     * Button
     */
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        viewmodel = ViewModelProviders.of(this).get(MainViewModel.class);
        viewmodel.setNavigator(this);
    }

    private void initView() {
        edUsename = (EditText) findViewById(R.id.edUsename);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btnLogin:
                //gọi lại phương thức hàm serverLogin vì hàm này chứa hàm doLogin
                viewmodel.ServerLogin();
                break;
        }
    }

    @Override
    public void doLogin() {
        //khai báo username
       String username = edUsename.getText().toString();
       //khai báo password
       String password = edPassword.getText().toString();
       //việc xử lý username và password đã có viewmodel lo
       viewmodel.login(username,password, this);
    }
}
