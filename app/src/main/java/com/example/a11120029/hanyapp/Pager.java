package com.example.a11120029.hanyapp;

import android.support.v4.view.ViewPager; //support v4에 들어있는 ViewPager를 사용한다.
import android.support.v7.app.AppCompatActivity; // 롤리팝부터는 support v7의 AppCompatActivity를 사용한다.
import android.os.Bundle; //intent 데이터 전달객체
import android.support.v7.app.AppCompatDelegate;

import com.astuetz.PagerSlidingTabStrip; //탭
import com.example.a11120029.hanyapp.model.Page; //만든 클래스

import java.util.ArrayList;

public class Pager extends AppCompatActivity {

    //화면들을 저장할 리스트
    private ArrayList<Page> viewList = new ArrayList<>();

    //뷰페이저
    private ViewPager pager;
    //화면들을 뿌려주는 어댑터
    private PagerAdapter pagerAdapter;
    //탭
    private PagerSlidingTabStrip tabs;

    //import를 안했을 경우 ViewPager 사용법
    private android.support.v4.view.ViewPager test;

    /**
     * 접근 제한자란?
     * 멤버변수들은 객체 자신들만의 속성이자 특징이므로 대외적으로 공개되는 것이 결코 좋은 것은 아닙니다.
     * 그런 이유로 프로그래머가 객체의 멤버들에게 접근 제한을 걸 수가 있는데 자바에서는 이를 접근 제한자라 합니다.
     *
     * public      : 모든 접근을 허용
     * protected : 같은 패키지(폴더)에 있는 객체와 상속관계의 객체들만 허용
     * default    : 같은 패키지(폴더)에 있는 객체들만 허용
     * private    : 현재 객체 내에서만 허용
     *
     */


    /**
     * 앱이 켜지고 가장 먼저 실행되는 함수
     *
     * @param savedInstanceState onSaveInstanceState()로 상태를 저장하고 다시 파라미터로 전달된다.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //상속받은 상위클래스의 onCreate()를 호출한다.
        super.onCreate(savedInstanceState);
        //현재 액티비티의 화면을 res/layout/activity_main.xml로 띄운다.
        setContentView(R.layout.pager);

        //리스트에 보여줄화면과 탭에 표시될 제목을 적는다.
        //풀어서 선언하면 다음과 같다.
        Page page = new Page(this, R.layout.tab1, "맛집");
        viewList.add(page);

        viewList.add(new Page(this, R.layout.tab2, "관광"));
        viewList.add(new Page(this, R.layout.tab3, "준비"));

        //activity_main에 선언해둔 pager를 찾아서 변수에 연결시켜준다.
        pager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new PagerAdapter(this, viewList);

        //viewpager를 사용할때는 adapter를 연결시켜줘야한다.
        pager.setAdapter(pagerAdapter);

        //탭도 연결시켜준다.
        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        tabs.setViewPager(pager);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

}
