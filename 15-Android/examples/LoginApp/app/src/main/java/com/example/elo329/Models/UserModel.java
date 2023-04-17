package com.example.elo329.Models;

public class UserModel {
    private String user;
    private String password;

    public UserModel (String user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean validateCredentials (String inputUser, String inputPass) {
        return user.equals(inputUser) && password.equals(inputPass);
    }
}
