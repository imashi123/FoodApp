package com.example.selectfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button noll;
    TextView text;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        noll=(Button)findViewById(R.id.noll);
        text=(TextView)findViewById(R.id.txtt);
        noll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neo=new Intent(MainActivity.this,NOODLES.class);
            }
        });




    }
}
