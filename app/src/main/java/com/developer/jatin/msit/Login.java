package com.developer.jatin.msit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {
    ImageButton click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();



        click=(ImageButton)findViewById(R.id.imageButton);
//        marqueeView=(MarqueeView)findViewById(R.id.marquee);
//        ArrayList<String> arr=new ArrayList<>();
//        arr.add("Glad..");
//        arr.add("You are here !!");
//        arr.add("Login Below");
//        marqueeView.startWithList(arr);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(Login.this,Maintry.class);
                startActivity(i);
            }
        });

    }
}
