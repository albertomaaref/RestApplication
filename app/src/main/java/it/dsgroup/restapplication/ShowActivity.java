package it.dsgroup.restapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    TextView t0;
    TextView t1;
    TextView t2;
    Azienda azienda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent i = getIntent();

        t0 = (TextView) findViewById(R.id.textView);
        t1 = (TextView) findViewById(R.id.textView2);
        t2 = (TextView) findViewById(R.id.textView3);

        int position = i.getIntExtra("position",-1);
        azienda = (Azienda) InternalStorage.readObject(getApplicationContext(),"azienda01");

        setDettagli(azienda, position);


    }

    public void setDettagli(Azienda a, int numero){
        t0.setText((a.getDipendenti().get(numero).getNome()));
        t1.setText(a.getDipendenti().get(numero).getCognome());
        t2.setText(a.getDipendenti().get(numero).getId().toString());

    }
}
