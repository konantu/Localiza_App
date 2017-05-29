package com.example.konan.localiza_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GestionActivity extends AppCompatActivity {

    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);

        mensaje = (TextView) findViewById(R.id.textView2);
        Bundle parametro = getIntent().getExtras();

        if (parametro != null)
        {
            mensaje.setText(parametro.getString("nombreClie"));
        }
    }
}
