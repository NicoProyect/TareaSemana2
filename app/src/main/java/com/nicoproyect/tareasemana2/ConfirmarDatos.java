package com.nicoproyect.tareasemana2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView texnombre;
    private TextView texnumero;
    private TextView texDate;
    private TextView texemail;
    private TextView texdescripcion;
    private Button btback;
    //private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        texnombre = (TextView) findViewById(R.id.texnombre);
        texDate = (TextView) findViewById(R.id.texDate);
        texnumero = (TextView) findViewById(R.id.texnumero);
        texemail = (TextView) findViewById(R.id.texemail);
        texdescripcion = (TextView) findViewById(R.id.texdescripcion);

        String dato = getIntent().getStringExtra("datonombre");
        String dato1 = getIntent().getStringExtra("datodatePicker");
        String dato2 = getIntent().getStringExtra("datonumero");
        String dato3 = getIntent().getStringExtra("datoemail");
        String dato4 = getIntent().getStringExtra("datodescripcion");

        texnombre.setText("nombre: " + dato);
        texDate.setText("Fecha de nacimiento: " + dato1);
        texnumero.setText("Telefono: " + dato2);
        texemail.setText("Email: " + dato3);
        texdescripcion.setText("Descripcion: " + dato4);

        Button btback = (Button) findViewById(R.id.btback);

        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Regresar();
            }
        });

    }

    public void Regresar(){
        finish();

    }
}