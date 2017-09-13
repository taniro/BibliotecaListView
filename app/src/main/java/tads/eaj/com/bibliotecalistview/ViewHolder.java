package tads.eaj.com.bibliotecalistview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class ViewHolder {

    final TextView textViewTitulo;
    final TextView textViewAutor;
    final TextView textViewQuantidade;
    final ImageView img;

    public ViewHolder (View v){
        textViewTitulo = (TextView) v.findViewById(R.id.titulo);
        textViewAutor= (TextView) v.findViewById(R.id.autor);
        textViewQuantidade= (TextView) v.findViewById(R.id.quantidade);
        img = (ImageView) v.findViewById(R.id.img);
    }
}
