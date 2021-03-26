package com.lin.mvvmproject.model;

import androidx.databinding.BaseObservable;

/**
 * Time:2021/3/26
 * Author:lin
 * Description：源数据需要 继承BaseObservable
 * & 对组件中应用属性的get()添加 @Bindable 注解。
 */
public class MainModel extends BaseObservable {
    private String username;
    private String nickname;
    private int age;
    private int userface;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserface() {
        return userface;
    }

    public void setUserface(int userface) {
        this.userface = userface;
    }
}
