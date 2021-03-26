package com.lin.mvvmproject.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.lin.mvvmproject.R;
import com.lin.mvvmproject.viewmodel.MainActivityViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    // ActivityMainBinding由框架编译时生成，
    // 负责通知界面同步更新(命名方式：xml文件名 + BindingImpl)；
    private com.lin.mvvmproject.databinding.ActivityMainBinding mMainActivityBinding;
    private MainActivityViewModel mMainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mMainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mMainActivityBinding.setLifecycleOwner(this);
        //数据绑定
        mMainActivityViewModel = new ViewModelProvider(this, getDefaultViewModelProviderFactory())
                .get(MainActivityViewModel.class);
        mMainActivityViewModel.setUsername("shfvuioe");
        mMainActivityBinding.setVMMain(mMainActivityViewModel);
        //点击事件绑定
        mMainActivityBinding.setAdb(this);
    }

    public void onClickGetData(View view) {
        Log.i("logMaster", "view= " +view );
        mMainActivityViewModel.setUsername("onclick");
    }
}