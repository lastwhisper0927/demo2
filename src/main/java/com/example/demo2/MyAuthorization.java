package com.example.demo2;

public class MyAuthorization {

    public boolean checkUser(String login, String password) {
        if (login.equals("login") && password.equals("password")) return true;
        return false;
    }

}
