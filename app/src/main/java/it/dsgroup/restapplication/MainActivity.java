package it.dsgroup.restapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;


public class MainActivity extends AppCompatActivity implements TaskCompletetion {

    MyAdapter mioAdapter;
    Azienda azienda;
    ListView listview01;



    private ProgressDialog dialog ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TaskCompletetion delegation = this;
        azienda = new Azienda();

        restCall(delegation);
        listview01 = (ListView) findViewById(R.id.ListView01);
        listview01.setOnItemClickListener(temporary);




    }

    public void restCall(final  TaskCompletetion delegate) {
        dialog = new ProgressDialog(MainActivity.this);
        dialog.show();


        FireBaseConnection.get("dipendenti.json", null, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String s = new String(responseBody);
                azienda.dipendenti= JsonParser.getDipendenti(s);
                delegate.taskComplettionStep("completato");
                setAdapter();

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("error",responseBody.toString());
            }


        });
    }


    private void setAdapter() {

        mioAdapter = new MyAdapter(getApplicationContext(), R.layout.item_list,azienda.dipendenti);


        listview01.setAdapter(mioAdapter);
    }

    @Override
    public void taskComplettionStep(String resul) {
        dialog.dismiss();
        dialog.cancel();
        Toast.makeText(getApplicationContext(),resul,Toast.LENGTH_SHORT);
    }

    ListView.OnItemClickListener temporary = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            InternalStorage.writeObject(getApplicationContext(),"azienda01",azienda);
            Intent i = new Intent(getApplicationContext(),ShowActivity.class);
            i.putExtra("position",position);
            startActivity(i);

        }
    };

}