package com.hanbit.app.contactapp.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hanbit.app.contactapp.R;

public class UpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        Intent intent=this.getIntent();//DetailActivity의 UpDate에서 보낸거 받음
        String id=intent.getExtras().getString("id");
    }
}
