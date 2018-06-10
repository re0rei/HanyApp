package com.example.a11120029.hanyapp.food2;

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

public class FoodMainActivity2 extends AppCompatActivity {

    ArrayList<Song> al5 = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodactivity_main2);

        al5.add(new Song("HanCook", R.drawable.hancooktitle, "한국의 전통적인 맛과 현대의 편리함이 공존하는 고풍스러운 한식 레스토랑")); //0
        al5.add(new Song("THE PLACE Dining", R.drawable.diningtitle, "남산의 푸르름을 만끽하며 Western food의 풀서비스가 이루어지는 캐주얼 레스토랑")); //1
        al5.add(new Song("촛불1978", R.drawable.chotbooltitle, "수많은 연인들의 love story를 간직한 대한민국 대표 프로포즈 레스토랑")); //2
        al5.add(new Song("슈치쿠", R.drawable.shucikutitle, "장인 정신과 현대적 감각이 만난 웰빙 하이엔드 일식당")); //3
        al5.add(new Song("백리향", R.drawable.backrihyangtitle, "대한민국을 대표하는 고품격 Traditional Chinese Restaurant")); //4
        al5.add(new Song("뷔페 파빌리온", R.drawable.paviliontitle, "각 키친 별 파인 다이닝 수준의 Live 메뉴와 Evoluto 서비스를 선보이는 Premium Buffet")); //5
        al5.add(new Song("떡싸롱", R.drawable.dducssaroongtitle, "분식을 먹고싶을때 한번 먹으면 또 온다는 그맛 분식의 다양한 메뉴까지 제공")); //6
        al5.add(new Song("양반댁", R.drawable.yangbandacktitle, "흔히 계란찜에서도 고급스러운 맛과 멋을 느낄수 있는 한정식 전문점")); //7
        al5.add(new Song("우레옥", R.drawable.ureoktitle, "60년 넘게 평양 냉면의 전통을 지켜오는 유명한 명소 미국 까지 진출한 냉면집")); //8




        MyAdapter adapter = new MyAdapter(getApplicationContext(), R.layout.row5, al5);

        ListView lv = (ListView) findViewById(R.id.listView5);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(FoodMainActivity2.this, hancook.class);

                    startActivity(intent);

                }

                if(position == 1){

                    Intent intent1 = new Intent(FoodMainActivity2.this, dining.class);

                    startActivity(intent1);

                }

                if(position == 2){

                    Intent intent2 = new Intent(FoodMainActivity2.this, chotbool.class);

                    startActivity(intent2);

                }

                if(position == 3){

                    Intent intent3 = new Intent(FoodMainActivity2.this, shuciku.class);

                    startActivity(intent3);

                }

                if(position == 4){

                    Intent intent4 = new Intent(FoodMainActivity2.this, backrihyang.class);

                    startActivity(intent4);

                }

                if(position == 5){

                    Intent intent5 = new Intent(FoodMainActivity2.this, pavilion.class);

                    startActivity(intent5);

                }

                if(position == 6){

                    Intent intent6 = new Intent(FoodMainActivity2.this, dducssaroong.class);

                    startActivity(intent6);

                }

                if(position == 7){

                    Intent intent7 = new Intent(FoodMainActivity2.this, yangbandack.class);

                    startActivity(intent7);

                }

                if(position == 8){

                    Intent intent8 = new Intent(FoodMainActivity2.this, ureok.class);

                    startActivity(intent8);

                }

            }
        });

    }
}

class MyAdapter extends BaseAdapter { // 리스트 뷰의 아답타
    Context context5;
    int layout;
    ArrayList<Song> al5;
    LayoutInflater inf5;

    public MyAdapter(Context context, int layout, ArrayList<Song> al) {
        this.context5 = context;
        this.layout = layout;
        this.al5 = al;
        inf5 = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return al5.size();
    }

    @Override
    public Object getItem(int position) {
        return al5.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf5.inflate(layout, null);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView6);
        TextView tvName = (TextView) convertView.findViewById(R.id.textView5);
        TextView tvInfo = (TextView) convertView.findViewById(R.id.textView6);

        Song m = al5.get(position);
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
