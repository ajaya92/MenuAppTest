package org.hello.menuapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Lmenu1Activity extends AppCompatActivity {

    Button nextPage1;
    Intent nexP1;
    Button prevButton1;
    Intent prevP1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lmenu1);
        nextPage1=findViewById(R.id.nextB2);
        nexP1=new Intent(this, Lmenu2Activity.class);
        nextPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nexP1);
            }
        });
        prevButton1 = findViewById(R.id.prevB2);
        prevP1 = new Intent(this, LmenuActivity.class);
        prevButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(prevP1);
            }
        });
    }
}