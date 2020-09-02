package com.santicgit.tictacte_git;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String temp="O";
    Button one,two,three,four,five,six,seven,eight,nine ,restart;
    int rone=0,rtwo=0,rthree=0,rfour=0,rfive=0,rsix=0,rseven=0,reight=0;
    ImageView im;


    int state= 0;
    int tie =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        restart = (Button)findViewById(R.id.restart);

        ButtonListner(one);
        ButtonListner(two);
        ButtonListner(three);
        ButtonListner(four);
        ButtonListner(five);
        ButtonListner(six);
        ButtonListner(seven);
        ButtonListner(eight);
        ButtonListner(nine);

restart.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       restart();
    }
});


    }



    public void ButtonListner(final Button vw){

        int id = vw.getId();
        for(id=0;id<=9;id++)
        {


            vw.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View arg0) {

                    if (temp.equals("x")){

                        vw.setText("O");

                    }
                    else{
                        vw.setText("x");

                    }
                    vw.setClickable(false);
                    temp=vw.getText().toString();
                    result();
                    tie++;
                    state++;
                    ///////////////////////////////////////////////////
                    String ghy = vw.getText().toString();


                    /////////////////////////////////////////////////////
                    if(tie==9 && rone==0 && rtwo==0&&rthree==0 && rfour==0
                            &&rfive==0 && rsix==0&&rseven==0 && reight==0)
                    {
                        Toast.makeText(MainActivity.this, "game tie", Toast.LENGTH_SHORT).show();
                        Handler hand  = new Handler();
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                               restart();
                            }
                        },600);

                    }
                }});


        }
    }
    public void result(){
        String b1=one.getText().toString();
        String b2=two.getText().toString();
        String b3=three.getText().toString();
        String b4=four.getText().toString();
        String b5=five.getText().toString();
        String b6=six.getText().toString();
        String b7=seven.getText().toString();
        String b8=eight.getText().toString();
        String b9=nine.getText().toString();

        if (b6.equals("x") && b3.equals("x") && b9.equals("x")){
            Toast.makeText(getApplicationContext(), "x wins", Toast.LENGTH_LONG).show();
            restart();
            rone++;
        }
        if (b4.equals("x") && b1.equals("x") && b5.equals("x")){
            Toast.makeText(getApplicationContext(), "x wins", Toast.LENGTH_LONG).show();
            restart();
            rtwo++;
        }
        if (b7.equals("x") && b2.equals("x") && b8.equals("x")){
            Toast.makeText(getApplicationContext(), "x wins", Toast.LENGTH_LONG).show();
            restart();
            rthree++;
        }
        if (b6.equals("x") && b1.equals("x") && b8.equals("x")){
            Toast.makeText(getApplicationContext(), "x wins", Toast.LENGTH_LONG).show();
            restart();
            rfour++;
        }
        if (b7.equals("x") && b1.equals("x") && b9.equals("x")){
            Toast.makeText(getApplicationContext(), "x wins", Toast.LENGTH_LONG).show();
            restart();
            rfive++;
        }
        if (b6.equals("x") && b4.equals("x") && b7.equals("x")){
            Toast.makeText(getApplicationContext(), "x wins", Toast.LENGTH_LONG).show();
            restart();
            rsix++;
        }
        if (b3.equals("x") && b1.equals("x") && b2.equals("x")){
            Toast.makeText(getApplicationContext(), "x wins", Toast.LENGTH_LONG).show();
            restart();
            rseven++;
        }
        if (b9.equals("x") && b5.equals("x") && b8.equals("x")){
            Toast.makeText(getApplicationContext(), "x wins", Toast.LENGTH_LONG).show();
            restart();
            reight++;
        }
        //for y
        if (b6.equals("O") && b3.equals("O") && b9.equals("O")){
            Toast.makeText(getApplicationContext(), "O wins", Toast.LENGTH_LONG).show();
            restart();
            rone++;
        }
        if (b4.equals("O") && b1.equals("O") && b5.equals("O")){
            Toast.makeText(getApplicationContext(), "O wins", Toast.LENGTH_LONG).show();
            restart();
            rtwo++;
        }
        if (b7.equals("O") && b2.equals("O") && b8.equals("O")){
            Toast.makeText(getApplicationContext(), "O wins", Toast.LENGTH_LONG).show();
            restart();
            rthree++;
        }
        if (b6.equals("O") && b1.equals("O") && b8.equals("O")){
            Toast.makeText(getApplicationContext(), "O wins", Toast.LENGTH_LONG).show();
            restart();
            rfour++;
        }
        if (b7.equals("O") && b1.equals("O") && b9.equals("O")){
            Toast.makeText(getApplicationContext(), "O wins", Toast.LENGTH_LONG).show();
            restart();
            rfive++;
        }
        if (b6.equals("O") && b4.equals("O") && b7.equals("O")){
            Toast.makeText(getApplicationContext(), "O wins", Toast.LENGTH_LONG).show();
            rsix++;
        }
        if (b3.equals("O") && b1.equals("O") && b2.equals("O")){
            Toast.makeText(getApplicationContext(), "O wins", Toast.LENGTH_LONG).show();
            restart();
            rseven++;
        }
        if (b9.equals("O") && b5.equals("O") && b8.equals("O")){
            Toast.makeText(getApplicationContext(), "O wins", Toast.LENGTH_LONG).show();
            restart();
            reight++;
        }
    }  //end of result();



public void restart(){
    Handler hand  = new Handler();
    hand.postDelayed(new Runnable() {
        @Override
        public void run() {
            finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            startActivity(getIntent());
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    },600);

}
}





