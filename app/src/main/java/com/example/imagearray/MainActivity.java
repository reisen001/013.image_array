package com.example.imagearray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int[] imageId={R.drawable.image001, R.drawable.image002, R.drawable.image003, R.drawable.image004, R.drawable.image005,
            R.drawable.image006, R.drawable.image007, R.drawable.image008,R.drawable.image009, R.drawable.image010};
    int count = imageId.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sent =(Button)findViewById(R.id.button_sent);
        final EditText choose =(EditText)findViewById(R.id.editText_choose);
        final ImageView imageview = (ImageView)findViewById(R.id.imageView);
        //---------------------------------------------------------------//
        sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int img = Integer.parseInt(choose.getText().toString());
            Log.e("now","===="+img+"=====");
            count =img-1;
            imageview.setImageResource(imageId[count]);
           
            }
        });
    }
}
