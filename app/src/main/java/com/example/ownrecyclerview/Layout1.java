package com.example.ownrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Layout1 extends LinearLayout {
    ImageView imageView;
    TextView textView;
    TextView textView2;
    public Layout1(Context context) {
        super(context);
        init(context);
    }

    public Layout1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.layout1,this,true);

        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.name);
        textView2 = findViewById(R.id.mobile);
    }

    public void setName(String string){
        textView.setText(string);
    }

    public void setMobile(String string){
        textView2.setText(string);
    }
}
