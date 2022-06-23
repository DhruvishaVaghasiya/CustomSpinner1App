package com.example.customspinner1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String[] fruitsNames={"Mango","Banana","Orange","Apple"};
    int fruitsImg[]={R.drawable.img_3,R.drawable.img_2,R.drawable.img_1,R.drawable.img};
    Spinner fruitSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruitSpinner=findViewById(R.id.fruitSpinner);
        CustomAdapter1 customAdapter=new CustomAdapter1(this,fruitsNames,fruitsImg);
        fruitSpinner.setAdapter(customAdapter);
    }
}