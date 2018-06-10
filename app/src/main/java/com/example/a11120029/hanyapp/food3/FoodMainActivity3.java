package com.example.a11120029.hanyapp.food3;

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

public class FoodMainActivity3 extends AppCompatActivity {

    ArrayList<Song> al6 = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodactivity_main3);

        al6.add(new Song("법환 어촌계횟집", R.drawable.buqhwantitle, "해녀들이 직접 잡은 해산물과 서귀포 앞바다에서 잡은 자연산 활어")); //0
        al6.add(new Song("검은여쉼터", R.drawable.blackresttitle, "간단하게 끼니를 때울수 있는 바로 그곳 검은여쉼터")); //1
        al6.add(new Song("새섬갈비", R.drawable.saesumtitle, "제주도에서 생산된 흑돼지 오겹살이 유명하며 직화구이를 하는 그 장소")); //2
        al6.add(new Song("옹포별장가든", R.drawable.gardentitle, "유명인사들이 많이 방문해서 일대에서는 유명한 업소로서 흑돼지오겹살구이가 유명")); //3
        al6.add(new Song("제주 흑돈가", R.drawable.blackfigtitle, "깔끔하고 세련된 실내공간은 그 맛을 더욱 돋보이게 하는 곳")); //4
        al6.add(new Song("수우동", R.drawable.sooudongtitle, "우동면이 길고 탱글탱글한 고소한 맛이 예술")); //5
        al6.add(new Song("보영반점", R.drawable.boyungtitle, "음식 하나에 정성이 가득해 사람들이 많이 찾는다는 그 장소")); //6
        al6.add(new Song("돌하르방 식당", R.drawable.dolhartitle, "제주도 사람들의 정서를 느끼고싶으면 찾는 식당")); //7
        al6.add(new Song("독개물항", R.drawable.docgaetitle, "조용한 바닷가 마을에 있는 향토음식 전문점 독개물항")); //8




        MyAdapter adapter = new MyAdapter(getApplicationContext(), R.layout.row6, al6);

        ListView lv = (ListView) findViewById(R.id.listView6);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(FoodMainActivity3.this, buphwan.class);

                    startActivity(intent);

                }

                if(position == 1){

                    Intent intent1 = new Intent(FoodMainActivity3.this, blackrest.class);

                    startActivity(intent1);

                }

                if(position == 2){

                    Intent intent2 = new Intent(FoodMainActivity3.this, saesum.class);

                    startActivity(intent2);

                }

                if(position == 3){

                    Intent intent3 = new Intent(FoodMainActivity3.this, gardenn.class);

                    startActivity(intent3);

                }

                if(position == 4){

                    Intent intent4 = new Intent(FoodMainActivity3.this, blackfig.class);

                    startActivity(intent4);

                }

                if(position == 5){

                    Intent intent5 = new Intent(FoodMainActivity3.this, sooudong.class);

                    startActivity(intent5);

                }

                if(position == 6){

                    Intent intent6 = new Intent(FoodMainActivity3.this, boyung.class);

                    startActivity(intent6);

                }

                if(position == 7){

                    Intent intent7 = new Intent(FoodMainActivity3.this, dolharbangg.class);

                    startActivity(intent7);

                }

                if(position == 8){

                    Intent intent8 = new Intent(FoodMainActivity3.this, docgae.class);

                    startActivity(intent8);

                }

            }
        });

    }
}

class MyAdapter extends BaseAdapter { // 리스트 뷰의 아답타
    Context context6;
    int layout;
    ArrayList<Song> al6;
    LayoutInflater inf6;

    public MyAdapter(Context context, int layout, ArrayList<Song> al) {
        this.context6 = context;
        this.layout = layout;
        this.al6 = al;
        inf6 = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return al6.size();
    }

    @Override
    public Object getItem(int position) {
        return al6.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf6.inflate(layout, null);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView8);
        TextView tvName = (TextView) convertView.findViewById(R.id.textView9);
        TextView tvInfo = (TextView) convertView.findViewById(R.id.textView10);

        Song m = al6.get(position);
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
