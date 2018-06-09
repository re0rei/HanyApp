package com.example.a11120029.hanyapp.tour2;

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

public class TourMainActivity2 extends AppCompatActivity {

    ArrayList<Song> al2 = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touractivity_main2);

        al2.add(new Song("광안리 해수욕장", R.drawable.gwanganri_title, "부산의 다이아몬드 브릿지 광안리해수욕장")); //0
        al2.add(new Song("흰여울 문화마을", R.drawable.white_title, "1000만 관객을 불러모은 영화 변호인의 촬영지")); //1
        al2.add(new Song("국제시장", R.drawable.market_title, "다양한 볼거리가 많은 부산하면 유명한 명소")); //2
        al2.add(new Song("The Bay 101", R.drawable.thebay_title, "홍콩보다 부산 야경의 메카라 불리는 명소")); //3
        al2.add(new Song("민락 수변공원", R.drawable.park_title, "광안대교를 바라보며 휴식 공간을 결합한 국내최초수변공원")); //4
        al2.add(new Song("동백섬", R.drawable.island_title, "산책로가 조성되어 시민들의 발길이 끊이지 않는 동백섬")); //5
        al2.add(new Song("태종대", R.drawable.taejong_title, "부산을 대표하는 암석해안의 명승지")); //6
        al2.add(new Song("국립 해양 박물관", R.drawable.seamuseum_title, "바다의 역사를 통해 미래를 엿볼 수 있는 국립해양박물관")); //7
        al2.add(new Song("송도 해수욕장", R.drawable.songdo_title, "부산의 최초의 해수욕장이라 불리는 곳")); //8
        al2.add(new Song("보수동 책방골목", R.drawable.book_title, "전국에 몇 안되는 유일한 책방골목")); //9
        al2.add(new Song("용두산타워", R.drawable.ydtower_title, "부산항과 영도가 내려다 보이는 경승지")); //10
        al2.add(new Song("BIFF광장", R.drawable.biff_title, "부산국제영화제를 거리에서 만나볼수 있는 유일한 장소")); //11



        MyAdapter adapter = new MyAdapter(getApplicationContext(), R.layout.row2, al2);

        ListView lv = (ListView) findViewById(R.id.listView2);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(TourMainActivity2.this, gwanganri.class);

                    startActivity(intent);

                }

                if(position == 1){

                    Intent intent1 = new Intent(TourMainActivity2.this, white.class);

                    startActivity(intent1);

                }

                if(position == 2){

                    Intent intent2 = new Intent(TourMainActivity2.this, market.class);

                    startActivity(intent2);

                }

                if(position == 3){

                    Intent intent3 = new Intent(TourMainActivity2.this, thebay.class);

                    startActivity(intent3);

                }

                if(position == 4){

                    Intent intent4 = new Intent(TourMainActivity2.this, park.class);

                    startActivity(intent4);

                }

                if(position == 5){

                    Intent intent5 = new Intent(TourMainActivity2.this, island.class);

                    startActivity(intent5);

                }

                if(position == 6){

                    Intent intent6 = new Intent(TourMainActivity2.this, taejong.class);

                    startActivity(intent6);

                }

                if(position == 7){

                    Intent intent7 = new Intent(TourMainActivity2.this, seamuseum.class);

                    startActivity(intent7);

                }

                if(position == 8){

                    Intent intent8 = new Intent(TourMainActivity2.this, songdo.class);

                    startActivity(intent8);

                }

                if(position == 9){

                    Intent intent9 = new Intent(TourMainActivity2.this, book.class);

                    startActivity(intent9);

                }

                if(position == 10){

                    Intent intent10 = new Intent(TourMainActivity2.this, ydtower.class);

                    startActivity(intent10);

                }

                if(position == 11){

                    Intent intent11 = new Intent(TourMainActivity2.this, biff.class);

                    startActivity(intent11);

                }


            }
        });

    }
}

class MyAdapter extends BaseAdapter { // 리스트 뷰의 아답타
    Context context2;
    int layout;
    ArrayList<Song> al2;
    LayoutInflater inf2;

    public MyAdapter(Context context, int layout, ArrayList<Song> al) {
        this.context2 = context;
        this.layout = layout;
        this.al2 = al;
        inf2 = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return al2.size();
    }

    @Override
    public Object getItem(int position) {
        return al2.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf2.inflate(layout, null);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView2);
        TextView tvName = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvInfo = (TextView) convertView.findViewById(R.id.textView3);

        Song m = al2.get(position);
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
