package com.example.a11120029.hanyapp;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tab1_item extends Activity {

    private ArrayList<HashMap<String, String>> Data = new ArrayList<HashMap<String, String>>();
    private HashMap<String, String> InputData1 = new HashMap<>();
    private HashMap<String, String> InputData2 = new HashMap<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);
        listView = (ListView) findViewById(R.id.listviewtab1);

        //데이터 초기화
        InputData1.put("ground", "서울 기초 정보");
        InputData1.put("sub", "떠나기전 알아두면 좋을 서울 여행 정보");
        Data.add(InputData1);

        InputData2.put("ground", "서울 월별 축제");
        InputData2.put("sub", "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Data.add(InputData2);

        //simpleAdapter 생성
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, Data, android.R.layout.simple_list_item_2, new String[]{"ground", "sub"}, new int[]{android.R.id.text1, android.R.id.text2});
        listView.setAdapter(simpleAdapter);

    }
}