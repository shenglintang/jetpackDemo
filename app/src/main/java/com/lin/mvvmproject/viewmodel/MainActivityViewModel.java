package com.lin.mvvmproject.viewmodel;

import com.lin.mvvmproject.widget.CustomProjectLiveData;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Time:2021/3/26
 * Author:lin
 * Description： ViewModel : 只处理业务逻辑与操作数据，不涉及UI相关的更新
 */
public class MainActivityViewModel extends ViewModel {

    public CustomProjectLiveData<String> username = new CustomProjectLiveData<>();

    public MainActivityViewModel() {
        username = new CustomProjectLiveData<String>();
        username.setValue("loooss");
    }

    public MutableLiveData<String> getUsername() {
        if (username == null) {
            username = new CustomProjectLiveData<String>();
            username.setValue("looo");
        }
        return username;
    }

    public void setUsername(String value) {
        if (username == null) {
            username = new CustomProjectLiveData<String>();
        }
        username.setValue(value);
    }

}
