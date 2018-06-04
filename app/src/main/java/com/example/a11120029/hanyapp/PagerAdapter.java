package com.example.a11120029.hanyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a11120029.hanyapp.model.Page;

import java.util.ArrayList;

/**
 * Created by JY-park on 16. 4. 15..
 */
public class PagerAdapter extends android.support.v4.view.PagerAdapter {

    LayoutInflater inflater;
    ArrayList<Page> viewlist;

    public PagerAdapter(Context context, ArrayList<Page> viewArrayList) {
        inflater = LayoutInflater.from(context);
        viewlist = viewArrayList;
    }

    @Override
    public void startUpdate(ViewGroup container) {
        super.startUpdate(container);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return viewlist.get(position).getTitle();
    }

    @Override
    public float getPageWidth(int position) {
        return super.getPageWidth(position);
    }

    @Override
    public int getCount() {
        return viewlist.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = viewlist.get(position).getView();
        //ViewPager에 만들어 낸 View 추가
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public boolean isViewFromObject(View v, Object obj) {
        return v==obj;
    }

}
