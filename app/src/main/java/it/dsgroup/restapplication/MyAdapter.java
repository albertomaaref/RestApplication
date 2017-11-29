package it.dsgroup.restapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by utente9.academy on 28/11/2017.
 */

public class MyAdapter extends ArrayAdapter<Dipendente> {
    private LayoutInflater inflater;
    private int resourceId;
    private List<Dipendente> dipendenti;

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Dipendente> objects) {
        super(context, resource, objects);
        this.inflater = LayoutInflater.from(context);
        this.resourceId=resource;
        this.dipendenti=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView==null){
            Log.d("DEBUG","Inflating View");
            convertView = inflater.inflate(R.layout.item_list,null);
        }

        Dipendente d = getItem(position);

        TextView tId ;

        tId = (TextView) convertView.findViewById(R.id.tId);
        tId.setText(d.getId());

        /*TextView tNome = (TextView) convertView.findViewById(R.id.tNome);
        TextView tCognome = (TextView) convertView.findViewById(R.id.tCognome);

        tNome.setText(d.getNome());
        tCognome.setText((d.getCognome()));
        */

        return convertView;


    }
}
