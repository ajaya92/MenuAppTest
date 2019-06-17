package org.hello.menuapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Bevmenu3Activity extends AppCompatActivity {
    Button nextPage3, prevButton3;
    Intent nexP3, prevP3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bevmenu3);
        nextPage3=findViewById(R.id.nextB14);
        nexP3=new Intent(this, Bevmenu4Activity.class);
        nextPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nexP3);
            }
        });
        prevButton3 = findViewById(R.id.prevB14);
        prevP3 = new Intent(this, Bevmenu2Activity.class);
        prevButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(prevP3);
            }
        });

    }
}