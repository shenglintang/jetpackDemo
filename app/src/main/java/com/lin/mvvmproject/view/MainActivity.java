package com.lin.mvvmproject.view;

import android.os.Bundle;

import com.lin.mvvmproject.R;
import com.lin.mvvmproject.viewmodel.MainActivityViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    private com.lin.mvvmproject.databinding.ActivityMainBinding mMainActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityViewModel mainActivityViewModel = new ViewModelProvider(this, getDefaultViewModelProviderFactory())
                .get(MainActivityViewModel.class);
        mMainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mMainActivityBinding.setVm(mainActivityViewModel);
        mMainActivityBinding.setLifecycleOwner(this);
        mMainActivityBinding.tvMain.setText("databinding");
    }
}