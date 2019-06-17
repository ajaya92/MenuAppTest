package org.hello.menuapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BmenuActivity extends AppCompatActivity {

    Button nextPage;
    Intent nexP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmenu);

        nextPage=findViewById(R.id.nextB1);
        nexP=new Intent(this, BmenuoneActivity.class);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nexP);
            }
        });

    }
}