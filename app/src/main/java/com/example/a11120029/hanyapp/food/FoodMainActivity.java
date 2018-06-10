package com.example.a11120029.hanyapp.food;

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

public class FoodMainActivity extends AppCompatActivity {

    ArrayList<Song> al4 = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodactivity_main);

        al4.add(new Song("할매재첩국 ", R.drawable.halmaefood, "6.25때 부산 피난길에 재첩을 잡아 국을 판것으로 유명")); //0
        al4.add(new Song("수정궁", R.drawable.soojungfood, "자연활어를 기반으로 다양하고 품격있는 식음료 서비스를 지향")); //1
        al4.add(new Song("신센", R.drawable.sinsenfood, "부드러운 돈까스의 풍미가 어우러진 정통 일본식 돈까스, 우동 전문점")); //2
        al4.add(new Song("태종대짬뽕", R.drawable.taejongfood, "여러종류의 해물이 올라간 태종대의 매운 짬뽕")); //3
        al4.add(new Song("전주식당", R.drawable.junjufood, "밑반찬 까지 고소하고 맛있는 낙곱새가 유명한 해물요리전문점")); //4
        al4.add(new Song("목장원", R.drawable.mokjangwonfood, "한국전통의 토속적인 분위기와 현대적인 세련미를 두루 갖춘 식당")); //5
        al4.add(new Song("예당", R.drawable.yedangfood, "45년 전통의 한식당 예당으로 불리는 곳")); //6
        al4.add(new Song("사해방", R.drawable.sahaebangfood, "중화요리가 빠질수없는 유명한 맛집")); //7
        al4.add(new Song("한양족발", R.drawable.hanyangfood, "족발이 유명한 오랜전통이 담긴 냉채족발이 일품")); //8




        MyAdapter adapter = new MyAdapter(getApplicationContext(), R.layout.row4, al4);

        ListView lv = (ListView) findViewById(R.id.listView4);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(FoodMainActivity.this, halmae.class);

                    startActivity(intent);

                }

                if(position == 1){

                    Intent intent1 = new Intent(FoodMainActivity.this, soojung.class);

                    startActivity(intent1);

                }

                if(position == 2){

                    Intent intent2 = new Intent(FoodMainActivity.this, sinsen.class);

                    startActivity(intent2);

                }

                if(position == 3){

                    Intent intent3 = new Intent(FoodMainActivity.this, taejongjjam.class);

                    startActivity(intent3);

                }

                if(position == 4){

                    Intent intent4 = new Intent(FoodMainActivity.this, junju.class);

                    startActivity(intent4);

                }

                if(position == 5){

                    Intent intent5 = new Intent(FoodMainActivity.this, mokjang.class);

                    startActivity(intent5);

                }

                if(position == 6){

                    Intent intent6 = new Intent(FoodMainActivity.this, yedang.class);

                    startActivity(intent6);

                }

                if(position == 7){

                    Intent intent7 = new Intent(FoodMainActivity.this, sahaebang.class);

                    startActivity(intent7);

                }

                if(position == 8){

                    Intent intent8 = new Intent(FoodMainActivity.this, hanyang.class);

                    startActivity(intent8);

                }

            }
        });

    }
}

class MyAdapter extends BaseAdapter { // 리스트 뷰의 아답타
    Context context4;
    int layout;
    ArrayList<Song> al4;
    LayoutInflater inf4;

    public MyAdapter(Context context, int layout, ArrayList<Song> al) {
        this.context4 = context;
        this.layout = layout;
        this.al4 = al;
        inf4 = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return al4.size();
    }

    @Override
    public Object getItem(int position) {
        return al4.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf4.inflate(layout, null);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView4);
        TextView tvName = (TextView) convertView.findViewById(R.id.textView4);
        TextView tvInfo = (TextView) convertView.findViewById(R.id.textView6);

        Song m = al4.get(position);
        iv.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.artist);

        return convertView;
    }
}

class Song {
    String title = "";
    int img; // 앨범 이미지
    String artist = "";

    public Song(String title, int img, String artist) {
        super();
        this.title = title;
        this.img = img;
        this.artist = artist;
    }

    public Song() {
    }
}
