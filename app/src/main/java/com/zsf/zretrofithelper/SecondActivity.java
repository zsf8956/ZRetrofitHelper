package com.zsf.zretrofithelper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private TextView responseTv;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        responseTv = findViewById(R.id.main_resp);

//        findViewById(R.id.main_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                reqtNews();
//            }
//        });
    }

//    private void reqtNews(){
//
//        String url = "http://v.juhe.cn/toutiao/index?key='62919bd0ec8bf775185ef8f5f0cb9950'&type=yule";
//        RetrofitRequest.sendGetRequest(url,NewsResult.class,new RetrofitRequest.ResultHandler<NewsResult>(this){
//
//            @Override
//            public void onResult(NewsResult newsResult) {
//                String weather = GsonTools.toJson(newsResult);
//                responseTv.setText(weather);
//            }
//        });
//    }
}
