package com.lidetys.angbao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOpen;
    TextView txt;
    ImageView img;

    //add counter
    boolean counter = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpen = (Button) findViewById(R.id.btn_open);
        txt  = (TextView) findViewById(R.id.txt);
        img = (ImageView) findViewById(R.id.img);
    }

    //All change together
    public void magicHappen(View view) {

        if (counter==false){
            txt.setText("Gong Xi Fa Cai");
            img.setImageResource(R.drawable.sir);
            Toast.makeText(getApplicationContext(), "Your Red Pocket >> $100", Toast.LENGTH_LONG).show();

            counter = true;
        }
        else{
            txt.setText("Happy New Year");
            img.setImageResource(R.drawable.moneybag);
            Toast.makeText(getApplicationContext(), "Red Pocket is Ready", Toast.LENGTH_LONG).show();

            counter = false;
        }

    }



    public void changeText(View view){
        txt.setText("Gong Xi Fa Cai");
    }

    public void changeImage(View view){
        img.setImageResource(R.drawable.robot);
    }

    public void tempMessage(View view){
        Toast.makeText(getApplicationContext(),"Your Red Pocket >> $100",Toast.LENGTH_LONG).show();
    }




    public void flipMagic(View view){






    }

}
