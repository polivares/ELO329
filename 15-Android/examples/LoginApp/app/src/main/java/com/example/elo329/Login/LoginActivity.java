package com.example.elo329.Login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elo329.R;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private EditText email;
    private EditText password;
    private Button login;

    private LoginPresenter loginPresenter;

    /**
     * Como parte del patrón VIPER instanciamos un presentador, que es el que
     * se encargará de manejar la lógica de negocio. Le pasamos como parámetro
     * la interfaz de la vista, que permitirá al presentador comunicarse con ésta
     * a fin de entregarle la data necesaria para que la vista muestre la
     * información
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPresenter = new LoginPresenter(this);

        initResources();
        setResourceActions();
    }

    /**
     * El método onResume se ejecuta cada vez que la vista se muestra en pantalla.
     * Se setea por default un texto en blanco, y le damos siempre foco inicial
     * al input de email.
     */
    @Override
    protected void onResume() {
        super.onResume();

        email.setText("");
        email.requestFocus();

        password.setText("");
    }

    /**
     * Inicializamos los recursos
     */
    private void initResources() {
        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.loginButton);
    }

    /**
     * Asignamos las acciones necesarias a través de la creación de interfaces
     * usando funciones lambda
     */
    private void setResourceActions() {
        login.setOnClickListener(action -> {
            loginPresenter.manageLoginAccess(email.getText().toString(), password.getText().toString());
        });
    }

    /**
     * El presentador se encarga de conectar con este método cuando su lógica hace
     * referencia a un estado correcto
     */
    @Override
    public void onLoginSucceed() {
        LoginRouter.goToHome(LoginActivity.this);
    }

    /**
     * Así mismo, el presentador desencadena este estado cuando su lógica así
     * lo dicta
     */
    @Override
    public void onLoginFailed() {
        Toast toast = Toast.makeText(this, getText(R.string.login_error_message), Toast.LENGTH_LONG);
        toast.show();
    }
}
