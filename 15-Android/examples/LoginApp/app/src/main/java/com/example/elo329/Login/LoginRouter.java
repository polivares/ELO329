package com.example.elo329.Login;

import android.content.Context;
import android.content.Intent;

import com.example.elo329.Home.HomeActivity;

public class LoginRouter {
    public static void goToHome (Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        context.startActivity(intent);
    }
}
