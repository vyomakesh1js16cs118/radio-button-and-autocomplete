package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
RelativeLayout relativeLayout;
RadioGroup radioGroup;
String[] countries=new String[]{"india","iran","united states of america"};
AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout=findViewById(R.id.relative);
        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countries);
        autoCompleteTextView.setAdapter(adapter);
        radioGroup=findViewById(R.id.rgroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbb:relativeLayout.setBackgroundColor(Color.parseColor("#74B9FF"));
                    break;
                    case R.id.rbr:relativeLayout.setBackgroundColor(Color.parseColor("#FF3E4D"));
                        break;
                    case R.id.rbg:relativeLayout.setBackgroundColor(Color.parseColor("#badc57"));
                        break;
                }
            }
        });
    }
}
