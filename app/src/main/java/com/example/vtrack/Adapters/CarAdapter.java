package com.example.vtrack.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vtrack.Models.CarModel;
import com.example.vtrack.R;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.viewHolder>{
    ArrayList<CarModel> list;
    Context context;

    public CarAdapter(ArrayList<CarModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_card, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        CarModel model = list.get(position);
        holder.carPic.setImageResource(model.getCarPic());
        holder.carName.setText(model.getCarName());
        holder.carNo.setText(model.getCarNo());
//        holder.carCompany.setText(model.getCarCompany());
//        holder.carAddress.setText(model.getCarAddress());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView carPic;
        TextView carName;
        TextView carNo;
//        TextView carCompany;
//        TextView carAddress;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            carPic = itemView.findViewById(R.id.car_pic);
            carName = itemView.findViewById(R.id.car_name);
            carNo = itemView.findViewById(R.id.car_no);
//            carCompany = itemView.findViewById(R.id.car_company);
//            carAddress = itemView.findViewById(R.id.car_address);
        }
    }
}
