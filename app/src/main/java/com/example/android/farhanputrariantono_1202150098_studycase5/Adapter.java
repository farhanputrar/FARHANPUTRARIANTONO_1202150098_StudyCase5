package com.example.android.farhanputrariantono_1202150098_studycase5;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class Adapter extends RecyclerView.Adapter<Adapter.holder> {
    //deklarasi variable
    private Context cntx;
    private List<AddDataActivity> list;
    int color;

    //konstruktor
    public Adapter(Context cntx, ArrayList<AddDataActivity> list, int color){
        this.cntx=cntx;
        this.list=list;
        this.color=color;
    }


    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(cntx).inflate(R.layout.cardview_list, parent, false);
        holder hldr = new holder(view);
        return hldr;
    }


    @Override
    public void onBindViewHolder(holder holder, int position) {
        AddDataActivity data = list.get(position);
        holder.ToDo.setText(data.getTodo());
        holder.Description.setText(data.getDesc());
        holder.Priority.setText(data.getPrior());
        holder.cardv.setCardBackgroundColor(cntx.getResources().getColor(this.color));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }


    public AddDataActivity getData(int position){
        return list.get(position);
    }


    public void deleteData(int i){

        list.remove(i);

        notifyItemRemoved(i);
        notifyItemRangeChanged(i, list.size());
    }

    class holder extends RecyclerView.ViewHolder{

        public TextView ToDo, Description, Priority;
        public CardView cardv;
        public holder(View itemView){
            super(itemView);


            ToDo = itemView.findViewById(R.id.headline);
            Description = itemView.findViewById(R.id.explanation);
            Priority = itemView.findViewById(R.id.number);
            cardv = itemView.findViewById(R.id.cardlist);
        }
    }
}
