package org.hello.menuapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Bevmenu4Activity extends AppCompatActivity {
    Button nextPage4, prevButton4;
    Intent nexP4, prevP4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bevmenu4);
        nextPage4=findViewById(R.id.nextB15);
        nexP4=new Intent(this, BevmenuActivity.class);
        nextPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nexP4);
            }
        });
        prevButton4 = findViewById(R.id.prevB15);
        prevP4 = new Intent(this, Bevmenu3Activity.class);
        prevButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(prevP4);
            }
        });

    }
}