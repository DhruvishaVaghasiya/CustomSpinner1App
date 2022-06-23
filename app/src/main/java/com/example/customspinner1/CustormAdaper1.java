package com.example.customspinner1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter1 extends BaseAdapter {
    Context context;
    String[] fruitsNames;
    int fruitsImg[];


    public CustomAdapter1(Context appContext,String[] fruitsNames,int fruitsImg[])
    {
        this.context=appContext;
        this.fruitsNames=fruitsNames;
        this.fruitsImg=fruitsImg;
    }

    @Override
    public int getCount() {
        return fruitsNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.spinner_itme1,null);
        TextView txtName=view.findViewById(R.id.txtName);
        txtName.setText(fruitsNames[position]);
        ImageView imgview=view.findViewById(R.id.imageView);
        imgview.setImageResource(fruitsImg[position]);

        return view;
    }
}

