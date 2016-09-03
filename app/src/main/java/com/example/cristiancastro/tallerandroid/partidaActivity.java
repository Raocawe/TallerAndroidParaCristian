package com.example.cristiancastro.tallerandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Chronometer;

import Dominio.Ahorcado;
import Dominio.UsuarioPublico;

public class partidaActivity extends AppCompatActivity {

    Bundle b;
    UsuarioPublico u;
    Context MiContext;
    Chronometer crono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_partida);
        MiContext = getApplicationContext();
        crono = (Chronometer)findViewById(R.id.crono);

       /* crono.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer arg0) {
                countUp = (SystemClock.elapsedRealtime() - startTime) / 1000;

                if (countUp % 2 == 0) {
                    chronoRecordingImage.setVisibility(View.VISIBLE);
                } else {
                    chronoRecordingImage.setVisibility(View.INVISIBLE);
                }
                int min = (int) (countUp/60);
                int sec = (int) (countUp%60);

                Utility.printMessage(min+":"+sec);
                int newCount = MAX_TIME - (int) countUp;  // MAIN LOGIC
                String asText = String.format("%02d",(newCount / 60)) + ":"
                        + String.format("%02d", (newCount % 60));

                chrono.setText(asText);
                if (countUp > MAX_TIME) {
                    //time complete
                }
            }
        });*/

        b = getIntent().getExtras();
        Ahorcado aho = new Ahorcado();
        u = new UsuarioPublico();
        u.setIdUP(b.getInt("Usuario"));
        u = aho.SeleccionarEspecificaUsuarioPublicoPorId(u,MiContext);
    }
}
