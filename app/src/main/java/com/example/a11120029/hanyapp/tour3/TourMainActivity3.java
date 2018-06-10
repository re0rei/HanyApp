package com.example.a11120029.hanyapp.tour3;

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

public class TourMainActivity3 extends AppCompatActivity {

    ArrayList<Song> al3 = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touractivity_main3);

        al3.add(new Song("주상절리대", R.drawable.joosang_title, "대표적인 명승지 중 하나로 국가지정문화재 천연기념물")); //0
        al3.add(new Song("검멀레 해변", R.drawable.gum_title, "우도봉 아래에 협곡 속에 검은 모래 해변의 해수욕장")); //1
        al3.add(new Song("한림 공원", R.drawable.hanrim_title, "1년 내내 아름답고 화려한 꽃을 볼 수 있는 공원")); //2
        al3.add(new Song("천지연 폭포", R.drawable.chun_title, " 선계로 들어올것같은 황홀경을 느끼게하는 폭포")); //3
        al3.add(new Song("쇠소깍", R.drawable.ggac_title, "해안가의 아름다운 풍경을 느끼는 명소")); //4
        al3.add(new Song("섭지코지", R.drawable.sub_title, "코지곶을 의미하는 제주 방언 코의 끄트리모양 섭지코지")); //5
        al3.add(new Song("우도 등대", R.drawable.udo_title, "국내기술로 개발한 대형 회전식 등명기")); //6
        al3.add(new Song("하고수동 해변", R.drawable.hago_title, "아름다운 조개껍질이 유독많아 주울 수있는 해변")); //7
        al3.add(new Song("금오름", R.drawable.guem_title, "제주 대표 오름중 하나 화구에 물이 찬 오름")); //8
        al3.add(new Song("협재 해변", R.drawable.hyup_title, "제주의 조개껍질가루가 많이 섞인 백사장")); //9
        al3.add(new Song("제주 민속촌", R.drawable.minsok_title, "옛 제주의 모습을 간직한 문화 창조의 터전 명소")); //10
        al3.add(new Song("제주 해녀 박물관", R.drawable.jejumuseum_title, "생존과 삶, 자존의 역사를 담은 해녀박물관")); //11



        MyAdapter adapter = new MyAdapter(getApplicationContext(), R.layout.row3, al3);

        ListView lv = (ListView) findViewById(R.id.listView3);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(TourMainActivity3.this, joosang.class);

                    startActivity(intent);

                }

                if(position == 1){

                    Intent intent1 = new Intent(TourMainActivity3.this, gum.class);

                    startActivity(intent1);

                }

                if(position == 2){

                    Intent intent2 = new Intent(TourMainActivity3.this, hanrim.class);

                    startActivity(intent2);

                }

                if(position == 3){

                    Intent intent3 = new Intent(TourMainActivity3.this, chun.class);

                    startActivity(intent3);

                }

                if(position == 4){

                    Intent intent4 = new Intent(TourMainActivity3.this, ggac.class);

                    startActivity(intent4);

                }

                if(position == 5){

                    Intent intent5 = new Intent(TourMainActivity3.this, sub.class);

                    startActivity(intent5);

                }

                if(position == 6){

                    Intent intent6 = new Intent(TourMainActivity3.this, udo.class);

                    startActivity(intent6);

                }

                if(position == 7){

                    Intent intent7 = new Intent(TourMainActivity3.this, hago.class);

                    startActivity(intent7);

                }

                if(position == 8){

                    Intent intent8 = new Intent(TourMainActivity3.this, guem.class);

                    startActivity(intent8);

                }

                if(position == 9){

                    Intent intent9 = new Intent(TourMainActivity3.this, hyup.class);

                    startActivity(intent9);

                }

                if(position == 10){

                    Intent intent10 = new Intent(TourMainActivity3.this, minsok.class);

                    startActivity(intent10);

                }

                if(position == 11){

                    Intent intent11 = new Intent(TourMainActivity3.this, jejumuseum.class);

                    startActivity(intent11);

                }


            }
        });

    }
}

class MyAdapter extends BaseAdapter { // 리스트 뷰의 아답타
    Context context3;
    int layout;
    ArrayList<Song> al3;
    LayoutInflater inf3;

    public MyAdapter(Context context, int layout, ArrayList<Song> al) {
        this.context3 = context;
        this.layout = layout;
        this.al3 = al;
        inf3 = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return al3.size();
    }

    @Override
    public Object getItem(int position) {
        return al3.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf3.inflate(layout, null);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView3);
        TextView tvName = (TextView) convertView.findViewById(R.id.textView3);
        TextView tvInfo = (TextView) convertView.findViewById(R.id.textView4);

        Song m = al3.get(position);
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
