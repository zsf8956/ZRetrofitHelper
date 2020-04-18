package com.zsf.zretrofithelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView responseTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        responseTv = findViewById(R.id.main_resp);


//        findViewById(R.id.main_next).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,SecondActivity.class));
//            }
//        });
//
//        findViewById(R.id.main_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                reqtNews();
//            }
//        });

    }


//    private void reqtNews(){
//        String url = "http://v.juhe.cn/toutiao/index";
//        Map<String, String> paramMap = new HashMap<>(1);
//        paramMap.put("key", "62919bd0ec8bf775185ef8f5f0cb9950");
//        paramMap.put("type", "keji");
//        RetrofitRequest.sendPostRequest(url,paramMap, NewsResult.class,new RetrofitRequest.ResultHandler<NewsResult>(this) {
//
//            @Override
//            public void onResult(NewsResult newsResult) {
//                String weather = GsonTools.toJson(newsResult);
//                responseTv.setText(weather);
//            }
//
//        });
//    }
}
