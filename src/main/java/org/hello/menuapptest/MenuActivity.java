package org.hello.menuapptest;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {
    ImageView bImageView;
    ImageView lImageView;
    ImageView bevImageView;
    Intent b,l,bev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bImageView = findViewById(R.id.bImageView);
        lImageView = findViewById(R.id.lImageView);
        bevImageView = findViewById(R.id.bevImageView);
        b=new Intent(this, BmenuActivity.class);
        l=new Intent(this, LmenuActivity.class);
        bev=new Intent(this, BevmenuActivity.class);

        bImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(b);
            }
        });

        lImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(l);
            }
        });

        bevImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bev);
            }
        });



    }
}
