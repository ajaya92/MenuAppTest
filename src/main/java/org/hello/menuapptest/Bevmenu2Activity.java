package org.hello.menuapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Bevmenu2Activity extends AppCompatActivity {
    Button nextPage2, prevButton2;
    Intent nexP2, prevP2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bevmenu2);
        nextPage2=findViewById(R.id.nextB13);
        nexP2=new Intent(this, Bevmenu3Activity.class);
        nextPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nexP2);
            }
        });
        prevButton2 = findViewById(R.id.prevB13);
        prevP2 = new Intent(this, Bevmenu1Activity.class);
        prevButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(prevP2);
            }
        });

    }
}