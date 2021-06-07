package com.example.testfive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.ConnectException;

public class MyrecyclerviewAdabter extends RecyclerView.Adapter<MyrecyclerviewAdabter.MyViewHolder> {
    String data1[], data2[];
    int images[];
    Context context;


    public MyrecyclerviewAdabter(Context ct, String s1[], String s2[], int img[]) {
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyrecyclerviewAdabter.MyViewHolder holder, int position) {
     holder.myText1.setText(data1[position]);
     holder.myText2.setText(data2[position]);
     holder.myImage.setImageResource(images[position]);



    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myText1 ,myText2;
        ImageView myImage;


        public MyViewHolder(View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.txt_title);
            myText2 = itemView.findViewById(R.id.txt_descriptiopn);
            myImage = itemView.findViewById(R.id.image_icon);
        }
    }
}
