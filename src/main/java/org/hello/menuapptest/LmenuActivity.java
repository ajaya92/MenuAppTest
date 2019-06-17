package org.hello.menuapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LmenuActivity extends AppCompatActivity {

    Button nextPage1;
    Intent nexP1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lmenu);
        nextPage1=findViewById(R.id.nextB1);
        nexP1=new Intent(this, Lmenu1Activity.class);
        nextPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nexP1);
            }
        });
    }
}