package com.example.clickme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Date;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btn;
    TextView txt;

    @Override
    public void onCreate(Bundle icicle){
        // Método equivalente al método main
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        // La clase R en conjunto con el método findViewById permite capturar
        // un elemento gráfico y transformarlo a un objeto Java
        btn = (Button) findViewById(R.id.button1);
        txt = (TextView) findViewById(R.id.textView1);
        btn.setOnClickListener(this);
    }

    public void onClick(View view){
        updateTime();
    }

    private void updateTime(){
        txt.setText(new Date().toString());
    }

}