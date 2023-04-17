package com.example.elo329.Login;

import com.example.elo329.MockDataUtil;
import com.example.elo329.Models.UserModel;

public class LoginPresenter {
    private LoginView loginView;
    private UserModel mockUser;

    /**
     * El presentador recibe como parámetro la vista hacia
     * la cual debe conectarse para enviar datos a la vista
     * @param view
     */
    public LoginPresenter (LoginView view) {
        this.loginView = view;
        this.mockUser = MockDataUtil.createMockUser();
    }

    /**
     * Este método permite que a través de la validación de un modelo
     * de usuario, el presentador le pueda decir a la vista cuál es
     * el estado siguiente
     * @param user
     * @param pass
     */
    public void manageLoginAccess (String user, String pass) {
        if (mockUser.validateCredentials(user, pass)) {
            loginView.onLoginSucceed();
        } else {
            loginView.onLoginFailed();
        }
    }
}
