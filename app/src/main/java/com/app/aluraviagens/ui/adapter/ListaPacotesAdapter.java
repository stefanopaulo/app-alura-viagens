package com.app.aluraviagens.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.aluraviagens.R;
import com.app.aluraviagens.model.Pacote;

import java.util.List;

public class ListaPacotesAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private Context context;

    public ListaPacotesAdapter(List<Pacote> pacotes, Context context) {
        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Pacote getItem(int position) {
        return pacotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(context)
                .inflate(R.layout.item_pacote, parent, false);

        Pacote pacote = pacotes.get(position);

        ImageView imagem = viewCriada.findViewById(R.id.item_pacote_imagem);
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(pacote.getImagem(),
                "drawable", context.getPackageName());
        Drawable drawableImagemPacote = resources.getDrawable(idDoDrawable);
        imagem.setImageDrawable(drawableImagemPacote);

        TextView local = viewCriada.findViewById(R.id.item_pacote_local);
        local.setText(pacote.getLocal());

        TextView dias = viewCriada.findViewById(R.id.item_pacote_dias);
        dias.setText(pacote.getDias() + " dias");

        TextView preco = viewCriada.findViewById(R.id.item_pacote_preco);
        preco.setText("R$ " + pacote.getPreco().toString());

        return viewCriada;
    }

}