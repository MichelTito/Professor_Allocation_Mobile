package com.example.professorallocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity2 extends AppCompatActivity {

        private Button btCurso;
        private Button btDepartamento;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu2);

            btCurso = findViewById(R.id.btCurso);
            btDepartamento = findViewById(R.id.btDepartamento);

            btCurso.setOnClickListener(view -> {
                Intent mensageiro = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mensageiro);

                btDepartamento.setOnClickListener(view1 -> {
                    Intent dept = new Intent(getApplicationContext(),MainActivityTela2.class);
                    startActivity(mensageiro);
                });

            });