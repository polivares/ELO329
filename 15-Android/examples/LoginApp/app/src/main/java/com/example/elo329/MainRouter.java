package com.example.elo329;

import android.content.Context;
import android.content.Intent;

import com.example.elo329.Login.LoginActivity;

public class MainRouter {
    public static void goToLogin(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
