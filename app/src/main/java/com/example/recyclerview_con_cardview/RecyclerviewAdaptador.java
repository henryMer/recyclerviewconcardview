package com.example.recyclerview_con_cardview;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerviewAdaptador extends RecyclerView.Adapter<RecyclerviewAdaptador.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView jugador,nacionalidad;
    ImageView fotojugador;

        public ViewHolder(View itemView) {
            super(itemView);
            jugador=(TextView)itemView.findViewById(R.id.tvjugador);
            nacionalidad=(TextView)itemView.findViewById(R.id.tvNacionalidad);
            fotojugador=(ImageView) itemView.findViewById(R.id.imgjugador);
        }
    }
    public List<jugadorfutbol> jugadorLista;

    public RecyclerviewAdaptador(List<jugadorfutbol> jugadorLista) {
        this.jugadorLista = jugadorLista;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jugador,parent,false);
        ViewHolder viewHolder=new  ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        holder.jugador.setText(jugadorLista.get(position).getJugador());
        holder.nacionalidad.setText(jugadorLista.get(position).getNacionalidad());
        holder.fotojugador.setImageResource(jugadorLista.get(position).getImgJugador());
    }

    @Override
    public int getItemCount() {
        return jugadorLista.size();
    }
}
