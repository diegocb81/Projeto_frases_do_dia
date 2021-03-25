package com.cursoandroid.projeto_frases_do_dia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia!",
                "Pra hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz!",
                "Que o dia seja leve, que a tristeza seja breve e que o dia seja feliz!",
                "Sempre que o sol nasce, você tem uma oportunidade de ser feliz!"
        };
        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }

}