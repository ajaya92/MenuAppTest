package org.hello.menuapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BmenuoneActivity extends AppCompatActivity {

    Button prevButton;
    Intent prevP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmenu1);
        prevButton = findViewById(R.id.prevB1);
        prevP = new Intent(this, BmenuActivity.class);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(prevP);
            }
        });

    }
}