package com.example.zootour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class expAdapter extends RecyclerView.Adapter<expAdapter.expviewholder> {

    private Context context;
    private List<explayout> explayoutList;

    public expAdapter(Context context, List<explayout> explayoutList) {
        this.context = context;
        this.explayoutList = explayoutList;
    }

    @NonNull
    @Override
    public expviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.exp_lay, null);
        return new expviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull expviewholder holder, int position) {
        explayout explayout = explayoutList.get(position);
        holder.coname.setText(explayout.getConame());
        holder.des.setText(explayout.getDes());
        holder.dtfrom.setText(explayout.getDtfrom());
        holder.dtto.setText(explayout.getDtto());
        holder.cologo.setImageDrawable(context.getResources().getDrawable(explayout.getCologo()));
    }

    @Override
    public int getItemCount() {
        return explayoutList.size();
    }

    class expviewholder extends RecyclerView.ViewHolder{

        ImageView cologo;
        TextView coname, des, dtfrom, dtto;


        public expviewholder(@NonNull View itemView) {
            super(itemView);

            cologo = itemView.findViewById(R.id.cologo);
            coname = itemView.findViewById(R.id.coname);
            des = itemView.findViewById(R.id.des);
            dtfrom = itemView.findViewById(R.id.dtfrom);
            dtto = itemView.findViewById(R.id.dtto);

        }
    }
}
