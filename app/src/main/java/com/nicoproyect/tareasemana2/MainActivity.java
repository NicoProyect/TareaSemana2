package com.nicoproyect.tareasemana2;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText txtnombre;
    private DatePicker datePicker;
    private EditText txtnumero;
    private EditText txtemail;
    private EditText txtdescripcion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtnombre = (EditText) findViewById(R.id.txtnombre);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        txtnumero= (EditText) findViewById(R.id.txtnumero);
        txtemail = (EditText) findViewById(R.id.txtemail);
        txtdescripcion = (EditText) findViewById(R.id.txtdescripcion);
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth() + 1;
        int year = datePicker.getYear();

        Button btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarNuevosdatos();

            }
        });

    }


    public void mostrarNuevosdatos(){
            Intent intent = new Intent(this, ConfirmarDatos.class);
            intent.putExtra("datonombre", txtnombre.getText().toString());
            intent.putExtra("datodatePicker",datePicker.getDayOfMonth() + datePicker.getMonth() + datePicker.getYear());
            intent.putExtra("datonumero", txtnumero.getText().toString());
            intent.putExtra("datoemail", txtemail.getText().toString());
            intent.putExtra("datodescripcion", txtdescripcion.getText().toString());
            startActivity(intent);

    }
}