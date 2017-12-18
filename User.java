package com.example.srilakshmip.yamyahapp;

/**
 * Created by SRILAKSHMI.P on 18-12-2017.
 */

public class User {

    String name;
    String email;
    String password;
    String userid;
    int  phoneno;
    User()
    {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    User(String name,String email,String password,String userid,int phoneno){
        this.name=name;
        this.email=email;
        this.password=password;
        this.userid=userid;
        this.phoneno=phoneno;
    }
}
