package com.example.elo329;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    /**
     * El método onCreate siempre debe ser implementado, y siempre debe llamar
     * al constructor de la super clase
     * @param savedInstanceState Este parámetro permite tener acceso al último estado guardado de la aplicación
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        /**
         * Aquí lo único que hacemos es que después de 2 segundos, se abra la
         * pantalla de login
         */
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            goToLogin();
        }, 2000);
    }

    /**
     * El patrón VIPER considera el uso de Routers para implementar la navegación
     */
    private void goToLogin() {
        MainRouter.goToLogin(MainActivity.this);
        finish();
    }

}