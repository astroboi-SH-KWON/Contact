package com.hanbit.app.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hanbit.app.contactapp.presentation.SignupActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{//imp후 23행 오버라이딩, 18행 19행 리스너
    Button btSignUp, btSignIn;//변수 선언(초기화는 15행부터 16행)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//res의 activity_main.xml을 보여주는 중

        btSignUp= (Button) findViewById(R.id.btSignIn);//field 8행에 선언한 변수값 초기화
        btSignIn= (Button) findViewById(R.id.btSignUp);
        btSignUp.setOnClickListener(this);//this는 아래 오버라이딩 가르킴
        btSignIn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btSignUp:
                /*Toast t=Toast.makeText(MainActivity.this,"Go to Add",Toast.LENGTH_LONG);//일종의 팝업창(어디서,팝업창에 내용(String),)
                t.show();*/
                Toast.makeText(MainActivity.this,"Go to Add",Toast.LENGTH_LONG).show();

                /*Intent intent = new Intent(this.getApplicationContext(), SignupActivity.class);
                //getApplicationContext() 위치값*/
                /*Intent intent = new Intent(MainActivity.this, SignupActivity.class);//바로 위 코딩의 만능버젼
                startActivity(intent);//바로 위 코딩은 FROM MainActivity.this TO SignActivity.class의미
                //startActivity(intent)는 위에 FROM ~ TO ~ 를 시작하자.*/
                startActivity(new Intent(MainActivity.this, SignupActivity.class));//더 빠른 코딩
                break;
            case R.id.btSignIn:
                Toast.makeText(MainActivity.this,"Go to Login",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, SignupActivity.class));//p.391
                break;
        }

    }
}
