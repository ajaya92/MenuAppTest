package org.hello.menuapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Lmenu3Activity extends AppCompatActivity {

    Button nextPage3;
    Intent nexP3;
    Button prevButton3;
    Intent prevP3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lmenu3);
        nextPage3=findViewById(R.id.nextB4);
        nexP3=new Intent(this, LmenuActivity.class);
        nextPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nexP3);
            }
        });
        prevButton3 = findViewById(R.id.prevB4);
        prevP3 = new Intent(this, Lmenu2Activity.class);
        prevButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(prevP3);
            }
        });
    }
}