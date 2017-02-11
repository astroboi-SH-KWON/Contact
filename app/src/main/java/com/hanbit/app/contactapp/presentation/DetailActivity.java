package com.hanbit.app.contactapp.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.app.contactapp.R;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{
    Button btCall,btText,btPlace,btDelete,btUpdate,btList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        btCall= (Button) findViewById(R.id.btCall);
        btText= (Button) findViewById(R.id.btText);
        btPlace= (Button) findViewById(R.id.btPlace);
        btDelete= (Button) findViewById(R.id.btDelete);
        btUpdate= (Button) findViewById(R.id.btUpdate);
        btList= (Button) findViewById(R.id.btList);

        btCall.setOnClickListener(this);
        btText.setOnClickListener(this);
        btPlace.setOnClickListener(this);
        btDelete.setOnClickListener(this);
        btUpdate.setOnClickListener(this);
        btList.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btUpdate:
                Intent intent = new Intent(DetailActivity.this,UpdateActivity.class);
                intent.putExtra("id","hong");
                startActivity(intent);
                break;
            case R.id.btList:
                startActivity(new Intent(DetailActivity.this,ListActivity.class));

                break;
        }
    }
}
