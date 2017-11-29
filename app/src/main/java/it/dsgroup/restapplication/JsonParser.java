package it.dsgroup.restapplication;

import android.os.health.SystemHealthManager;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by utente9.academy on 28/11/2017.
 */

public class JsonParser {

    public static List<Dipendente> getDipendenti (String string){
        List<Dipendente> l = new ArrayList<>();
        try {
            JSONObject utenti = new JSONObject(string);

            Iterator keys = utenti.keys();





            while (keys.hasNext()){
                Dipendente d = new Dipendente();
                String key = (String)keys.next();
                JSONObject utenteSingolo = utenti.getJSONObject(key);
                Iterator iterator = utenteSingolo.keys();
                while (iterator.hasNext()){
                    String s = (String) iterator.next();
                    if(s.equals("id")){
                        d.setId(utenteSingolo.getString(s));
                    }
                    if(s.equals("nome")){
                        d.setNome(utenteSingolo.getString(s));
                    }
                    if(s.equals("cognome")){
                        d.setCognome(utenteSingolo.getString(s));
                    }

                }

                l.add(d);

            }


        }
        catch (JSONException e){
            Log.e("Error",e.toString());
        }

        return l;

    }
}
