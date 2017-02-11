package com.hanbit.app.contactapp.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.app.contactapp.R;

public class mypageActivity extends AppCompatActivity implements View.OnClickListener{
    Button btAlbum,btSchedule,btGoogle,btNaver,btUpdate,btQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        btAlbum= (Button) findViewById(R.id.btAlbum);
        btSchedule= (Button) findViewById(R.id.btSchedule);
        btGoogle= (Button) findViewById(R.id.btGoogle);
        btNaver= (Button) findViewById(R.id.btNaver);
        btUpdate= (Button) findViewById(R.id.btUpdate);
        btQuit= (Button) findViewById(R.id.btQuit);

        btAlbum.setOnClickListener(this);
        btSchedule.setOnClickListener(this);
        btGoogle.setOnClickListener(this);
        btNaver.setOnClickListener(this);
        btNaver.setOnClickListener(this);
        btUpdate.setOnClickListener(this);
        btQuit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
