package com.example.a11120029.hanyapp.tour;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.a11120029.hanyapp.R;

import java.util.ArrayList;

public class TourMainActivity extends AppCompatActivity {

    ArrayList<Song> al = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touractivity_main);

        al.add(new Song("N서울타워", R.drawable.ntower, "동양 최고의 타워 한국 최초의 타워형태")); //0
        al.add(new Song("63빌딩", R.drawable.building63, "여의도 마천루 한강 서울의 상징적인 관광명소")); //1
        al.add(new Song("쌈지길", R.drawable.ssamtest, "공예품 전문 쇼핑몰 인사동의 새로운 인사동 ")); //2
        al.add(new Song("아쿠아플라넷", R.drawable.aquamain, "형형색색 아름답고 관람하기 좋은 아쿠아플라넷")); //3
        al.add(new Song("한국 관광 명품관", R.drawable.luxurymain, "고품질,고품격의 제품마을 판매하는 한국 관광 명품점")); //4
        al.add(new Song("서울 마리나 클럽 요트", R.drawable.marinamain, "요트의돛이 바람을 느낄수 있는 공간")); //5
        al.add(new Song("박물관이 살아있다", R.drawable.museummain, "나만의 사진을 찍으며 예술을 즐길 수 있는 예술 공간")); //6
        al.add(new Song("북촌 한옥마을", R.drawable.traditionalmain, "우리 전통 거주지역 북촌한옥마을")); //7
        al.add(new Song("영산아트홀", R.drawable.arthallmain, "여의도 새로운 문화 활동공간 영산아트홀")); //8
        al.add(new Song("남산 케이블카", R.drawable.cablecarmain, "남산 풍경을 한눈에 보는 남산케이블카")); //9
        al.add(new Song("남산 팔각정", R.drawable.eightmain, "남산의 유명 관광명소 팔각정을 삼아 휴식을 취할수있는 공간")); //10
        al.add(new Song("서울타워 한복문화체험관", R.drawable.tratestmain, "조선시대 대표적 공간 남산서울타워 한복문화체험관")); //11



        MyAdapter adapter = new MyAdapter(getApplicationContext(), R.layout.row, al);

        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(TourMainActivity.this, seoultower.class);

                    startActivity(intent);

                }

                if(position == 1){

                    Intent intent1 = new Intent(TourMainActivity.this, building.class);

                    startActivity(intent1);

                }

                if(position == 2){

                    Intent intent2 = new Intent(TourMainActivity.this, samload.class);

                    startActivity(intent2);

                }

                if(position == 3){

                    Intent intent3 = new Intent(TourMainActivity.this, aquaplanet.class);

                    startActivity(intent3);

                }

                if(position == 4){

                    Intent intent4 = new Intent(TourMainActivity.this, luxury.class);

                    startActivity(intent4);

                }

                if(position == 5){

                    Intent intent5 = new Intent(TourMainActivity.this, marinabote.class);

                    startActivity(intent5);

                }

                if(position == 6){

                    Intent intent6 = new Intent(TourMainActivity.this, museum.class);

                    startActivity(intent6);

                }

                if(position == 7){

                    Intent intent7 = new Intent(TourMainActivity.this, traditional.class);

                    startActivity(intent7);

                }

                if(position == 8){

                    Intent intent8 = new Intent(TourMainActivity.this, yungsanarthall.class);

                    startActivity(intent8);

                }

                if(position == 9){

                    Intent intent9 = new Intent(TourMainActivity.this, cablecar.class);

                    startActivity(intent9);

                }

                if(position == 10){

                    Intent intent10 = new Intent(TourMainActivity.this, eight.class);

                    startActivity(intent10);

                }

                if(position == 11){

                    Intent intent11 = new Intent(TourMainActivity.this, tratest.class);

                    startActivity(intent11);

                }


            }
        });

    }
}

class MyAdapter extends BaseAdapter { // 리스트 뷰의 아답타
    Context context;
    int layout;
    ArrayList<Song> al;
    LayoutInflater inf;

    public MyAdapter(Context context, int layout, ArrayList<Song> al) {
        this.context = context;
        this.layout = layout;
        this.al = al;
        inf = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int position) {
        return al.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf.inflate(layout, null);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvInfo = (TextView) convertView.findViewById(R.id.textView2);

        Song m = al.get(position);
        iv.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.artist);

        return convertView;
    }
}

class Song { // 자바빈
    String title = ""; // 곡 title
    int img; // 앨범 이미지
    String artist = ""; // artist

    public Song(String title, int img, String artist) {
        super();
        this.title = title;
        this.img = img;
        this.artist = artist;
    }

    public Song() {
    }
}
